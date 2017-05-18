/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.control;

import br.com.livr.BatedorDePenaltis;
import br.com.livr.Equipe;
import br.com.livr.Goleiro;
import br.com.livr.statics.Sessao;
import static br.com.livr.statics.Sessao.getEquipeAdversaria;
import static br.com.livr.statics.Sessao.getEquipePlayer;
import static br.com.livr.statics.Sessao.getGoleiroEquipePlayer;
import static br.com.livr.statics.Sessao.getJogadoresPorTime;
import static br.com.livr.statics.Sessao.getTecnico;
import br.com.livr.views.boundary.ErrorDialog;
import br.com.livr.views.boundary.InGameWindow;
import br.com.livr.views.boundary.Notificacao;
import br.com.livr.views.boundary.ParOuImparDialog;
import br.com.livr.views.boundary.ReacaoDialog;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.Timer;

/**
 *
 * @author victor
 */
public class InGameWindowController {

    int delayParaIAJogar = 8 * 1000;

    public static Goleiro verificarEquipeDoGoleiro(Equipe equipeDoBatedor) {
        if (equipeDoBatedor.getGoleiro().equals(getGoleiroEquipePlayer())) {
            //Se bp e gk forem do mesmo time
            return getEquipeAdversaria().getGoleiro();
        } else {
            return getEquipePlayer().getGoleiro();
        }
    }

    private ArrayList<String> relatorio = new ArrayList<>();
    private int numeroBatedorIA = 0;
    private int penaltisBatidosPelaIA = 0, penaltisBatidosPeloPlayer = 0;
    private final int totalCobrancasPorTime = getJogadoresPorTime();
    private List<Integer> indicesSelecionados = new ArrayList<>();
    private Notificacao notificacao = new Notificacao();
    private boolean haVencedor = false;

    private final InGameWindow inGameWindow;

    public InGameWindowController(InGameWindow inGameWindow) {
        this.inGameWindow = inGameWindow;
    }

    public void verificarQuemComeca(boolean venceuParOuImpar) {
        inGameWindow.getBtnSuaVez().setEnabled(venceuParOuImpar); //Se venceu, true. Se não, false
        if (!venceuParOuImpar) {
            runIA();
        }
    }

    public void gerarRelatorio(BatedorDePenaltis bp, Equipe equipeDoBatedor) {
        getRelatorio().add(bp.baterPenalti(equipeDoBatedor));
        updateScrollPane(inGameWindow.getScrollPaneRelatorio(), inGameWindow.getListRelatorio());
        boolean foiGol = BatedorDePenaltis.isMarcouGol();
        if (foiGol) {
            alterarPlacarDe(equipeDoBatedor);
        }
        if (Sessao.getTecnico().getEquipe().equals(equipeDoBatedor)) {
            setPenaltisBatidosPeloPlayer(getPenaltisBatidosPeloPlayer() + 1);
            if (getPenaltisBatidosPeloPlayer() == getTotalCobrancasPorTime()) {
                initListaJogadores();
            }
            inGameWindow.getBtnSuaVez().setEnabled(false);
        } else {
            setPenaltisBatidosPelaIA(getPenaltisBatidosPelaIA() + 1);
            inGameWindow.getBtnSuaVez().setEnabled(true);
        }
    }

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void setPenaltisBatidosPeloPlayer(int penaltisBatidosPeloPlayer) {
        this.penaltisBatidosPeloPlayer = penaltisBatidosPeloPlayer;
    }

    public void setIndicesSelecionados(List<Integer> indicesSelecionados) {
        this.indicesSelecionados = indicesSelecionados;
    }

    public void runIA() {
        Timer t = new Timer(delayParaIAJogar, (ActionEvent e) -> {
            int numeroBatedorPenaltiIA = getNumeroBatedorIA();
            if (numeroBatedorPenaltiIA >= getJogadoresPorTime()) {
                numeroBatedorPenaltiIA = 0;
                setNumeroBatedorIA(0);
            }
            Equipe equipeDaIA = getEquipeAdversaria();
            BatedorDePenaltis bp = equipeDaIA.getTecnico().escolherBatedor(numeroBatedorPenaltiIA);
            gerarRelatorio(bp, equipeDaIA);
            setNumeroBatedorIA(numeroBatedorPenaltiIA + 1);
            verificarPlacar(equipeDaIA);
            inGameWindow.getBtnSuaVez().setEnabled(!isHaVencedor());
        });
        t.setRepeats(false);
        t.start();
    }

    private void naoHaVencedor(Equipe ultimaEquipeQueBateu) {
        if (ultimaEquipeQueBateu.equals(getTecnico().getEquipe())) {
            inGameWindow.getBtnSuaVez().setEnabled(false);
        } else {
            inGameWindow.getBtnSuaVez().setEnabled(true);
        }
        setHaVencedor(false);
    }

    public List<Integer> getIndicesSelecionados() {
        return indicesSelecionados;
    }

    public boolean jaFoi(int selecionado) {
        List<Integer> is = getIndicesSelecionados();
        if (is.size() == 4) {
            getIndicesSelecionados().clear();
        }
        for (int i = 0; i < is.size(); i++) {
            if (is.get(i) == selecionado) {
                return true;
            }
        }
        return false;
    }

    public void setRelatorio(ArrayList<String> relatorio) {
        this.relatorio = relatorio;
    }

    public void setNumeroBatedorIA(int numeroBatedorIA) {
        this.numeroBatedorIA = numeroBatedorIA;
    }

    public void alterarPlacarDe(Equipe equipe) {
        if (equipe.getGoleiro().equals(getGoleiroEquipePlayer())) {
            int placar = Integer.parseInt(inGameWindow.getLblPlacarTimePlayer().getText());
            int novoPlacar = (placar + 1);
            if (novoPlacar < 10) {
                inGameWindow.getLblPlacarTimePlayer().setText("0" + novoPlacar);
            } else {
                inGameWindow.getLblPlacarTimePlayer().setText("" + novoPlacar);
            }
        } else {
            int placar = Integer.parseInt(inGameWindow.getLblPlacarTimeIA().getText());
            int novoPlacar = (placar + 1);
            if (novoPlacar < 10) {
                inGameWindow.getLblPlacarTimeIA().setText("0" + novoPlacar);
            } else {
                inGameWindow.getLblPlacarTimeIA().setText("" + novoPlacar);
            }
        }
    }

    private boolean verificarSeTodosJaBateram(int penaltisBatidos) {
        return penaltisBatidos % 2 == 0;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }

    public int getTotalCobrancasPorTime() {
        return totalCobrancasPorTime;
    }

    public void verificarPlacar(Equipe ultimaEquipeQueBateu) {
        int penaltisBatidos = getPenaltisBatidosPelaIA() + getPenaltisBatidosPeloPlayer();
        boolean todosBateram = verificarSeTodosJaBateram(penaltisBatidos);
        boolean atingiuQuantidadeMinimaCobrancas = penaltisBatidos >= getTotalCobrancasPorTime() * 2;
        if (atingiuQuantidadeMinimaCobrancas && todosBateram) {
            int placarIA = Integer.parseInt(inGameWindow.getLblPlacarTimeIA().getText());
            int placarPlayer = Integer.parseInt(inGameWindow.getLblPlacarTimePlayer().getText());
            if (placarIA != placarPlayer) {
                if (placarIA > placarPlayer) {
                    getNotificacao().exibirNotificacao(getEquipeAdversaria(), placarIA, placarPlayer);
                } else {
                    getNotificacao().exibirNotificacao(getEquipePlayer(), placarPlayer, placarIA);
                }
                setHaVencedor(true);
                inGameWindow.getBtnSuaVez().setEnabled(false);
            } else {
                naoHaVencedor(ultimaEquipeQueBateu);
            }
        } else {
            naoHaVencedor(ultimaEquipeQueBateu);
        }
    }

    public ArrayList<String> getRelatorio() {
        return relatorio;
    }

    public int getNumeroBatedorIA() {
        return numeroBatedorIA;
    }

    public void setPenaltisBatidosPelaIA(int penaltisBatidosPelaIA) {
        this.penaltisBatidosPelaIA = penaltisBatidosPelaIA;
    }

    public void updateScrollPane(JScrollPane scrollPaneRelatorio, JList<String> listRelatorio) {
        int tamanhoListaRelatorios = getRelatorio().size();
        listRelatorio.setListData(getRelatorio().toArray(new String[tamanhoListaRelatorios]));
        listRelatorio.setSelectedIndex(tamanhoListaRelatorios - 1);
        int maxValue = scrollPaneRelatorio.getVerticalScrollBar().getMaximum();
        scrollPaneRelatorio.getViewport().setViewPosition(new Point(0, maxValue));
    }

    public int getPenaltisBatidosPelaIA() {
        return penaltisBatidosPelaIA;
    }

    public void initListaJogadores() {
        List<BatedorDePenaltis> lst = getEquipePlayer().getBatedoresDePenaltis();
        List<String> nomes = new ArrayList<>();
        lst.forEach((BatedorDePenaltis bp) -> {
            nomes.add(bp.getNomeJogador());
        });
        inGameWindow.getListJogadoresTimePlayer().setListData(nomes.toArray(new String[nomes.size()]));
    }

    public int getPenaltisBatidosPeloPlayer() {
        return penaltisBatidosPeloPlayer;
    }

    public boolean isHaVencedor() {
        return haVencedor;
    }

    public void setHaVencedor(boolean haVencedor) {
        this.haVencedor = haVencedor;
    }

    public void btnTirarParOuImparOnClick() {
        ParOuImparDialog parOuImparDialog = new ParOuImparDialog(inGameWindow, true);
        parOuImparDialog.setVisible(true);
        inGameWindow.setVisible(false);
        if (parOuImparDialog.getParOuImparDialogController().isJogou()) {
            JLabel btn = inGameWindow.getBtnTirarParOuImpar();
            btn.setText(parOuImparDialog.getParOuImparDialogController().getQuemComeca().toUpperCase());
            btn.setEnabled(false);
            verificarQuemComeca(parOuImparDialog.getParOuImparDialogController().isVenceuParOuImpar());
            inGameWindow.pack();
        }
        inGameWindow.setVisible(true);

    }

    public void btnSuaVezOnClick() {
        if (!inGameWindow.getBtnTirarParOuImpar().isEnabled()) {
            int selecionado = inGameWindow.getListJogadoresTimePlayer().getSelectedIndex();
            boolean temCartaoVermelho = Sessao.getBatedoresEquipePlayer().get(selecionado).getCartaoVermelho();

            if ((!jaFoi(selecionado)) && (!temCartaoVermelho)) {
                getIndicesSelecionados().add(selecionado);
                BatedorDePenaltis bp = getTecnico().escolherBatedor(selecionado);
                gerarRelatorio(bp, getEquipePlayer());
                inGameWindow.getBtnSuaVez().setEnabled(false);

                verificarPlacar(getEquipePlayer());

                if (!isHaVencedor()) {
                    runIA();
                }

            } else if (temCartaoVermelho) {
                new ErrorDialog(inGameWindow, true, "Jogador Expulso", "Este jogador foi expulso").setVisible(true);
            } else if (jaFoi(selecionado)) {
                new ErrorDialog(inGameWindow, true, "Já Foi", "Este jogador já foi escolhido").setVisible(true);
            }
        } else {
            btnTirarParOuImparOnClick();
        }
    }

    public void closeButtonOnClick() {
        System.exit(0);
    }

    public void setarNomeEquipe(JLabel lblNomeEquipe, String nomeEquipe) {
        lblNomeEquipe.setText(nomeEquipe);
    }

    public void btnReagirMouseClicked() {
        ReacaoDialog reacaoDialog = new ReacaoDialog(inGameWindow);
        reacaoDialog.setVisible(true);
    }
}
