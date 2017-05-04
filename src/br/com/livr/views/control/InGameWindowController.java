/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.control;

import br.com.livr.BatedorDePenalti;
import br.com.livr.Equipe;
import br.com.livr.Goleiro;
import br.com.livr.statics.Sessao;
import static br.com.livr.statics.Sessao.getEquipeAdversaria;
import static br.com.livr.statics.Sessao.getEquipePlayer;
import static br.com.livr.statics.Sessao.getGoleiroEquipePlayer;
import static br.com.livr.statics.Sessao.getJogadoresPorTime;
import static br.com.livr.statics.Sessao.getTecnico;
import br.com.livr.views.boundary.InGameWindow;
import br.com.livr.views.boundary.Notificacao;
import br.com.livr.views.boundary.ParOuImparDialog;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.Timer;

/**
 *
 * @author victor
 */
public class InGameWindowController {

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

    public void gerarRelatorio(BatedorDePenalti bp, Equipe equipeDoBatedor) {
        getRelatorio().add(bp.baterPenalti(equipeDoBatedor));
        updateScrollPane(inGameWindow.getScrollPaneRelatorio(), inGameWindow.getListRelatorio());
        boolean foiGol = BatedorDePenalti.isMarcouGol();
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
        Timer t = new Timer(5000, (ActionEvent e) -> {
            int numeroBatedorPenaltiIA = getNumeroBatedorIA();
            if (numeroBatedorPenaltiIA >= getJogadoresPorTime()) {
                numeroBatedorPenaltiIA = 0;
                setNumeroBatedorIA(0);
            }
            Equipe equipeDaIA = getEquipeAdversaria();
            BatedorDePenalti bp = equipeDaIA.getTecnico().escolherBatedor(numeroBatedorPenaltiIA);
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

    //    private int correcaoDoValor(int selecionado) {
    //        for(Integer is : indicesSelecionados) {
    //            if(is.intValue() == selecionado) selecionado++;
    //            if(selecionado > 4) selecionado = 0;
    //        }
    //
    //        return selecionado;
    //    }
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
            InGameWindow.getLblPlacarTimePlayer().setText("" + (Integer.parseInt(InGameWindow.getLblPlacarTimePlayer().getText()) + 1));
        } else {
            InGameWindow.getLblPlacarTimeIA().setText("" + (Integer.parseInt(InGameWindow.getLblPlacarTimeIA().getText()) + 1));
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
            int placarIA = Integer.parseInt(InGameWindow.getLblPlacarTimeIA().getText());
            int placarPlayer = Integer.parseInt(InGameWindow.getLblPlacarTimePlayer().getText());
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
        List<BatedorDePenalti> lst = getEquipePlayer().getJogadores();
        List<String> nomes = new ArrayList<>();
        lst.forEach((BatedorDePenalti bp) -> {
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

    public void btnTirarParOuImparActionPerformed() {
        ParOuImparDialog parOuImparDialog = new ParOuImparDialog(inGameWindow, true);
        parOuImparDialog.setVisible(true);
        if (parOuImparDialog.getParOuImparDialogController().isJogou()) {
            JButton btn = inGameWindow.getBtnTirarParOuImpar();
            btn.setText(parOuImparDialog.getParOuImparDialogController().getQuemComeca().toUpperCase());
            btn.setEnabled(false);
            verificarQuemComeca(parOuImparDialog.getParOuImparDialogController().isVenceuParOuImpar());
        }
    }

    public void btnSuaVezActionPerformed() {
        if (!inGameWindow.getBtnTirarParOuImpar().isEnabled()) {
            int selecionado = inGameWindow.getListJogadoresTimePlayer().getSelectedIndex();
            if (!jaFoi(selecionado)) {
                getIndicesSelecionados().add(selecionado);
                BatedorDePenalti bp = getTecnico().escolherBatedor(selecionado);
                gerarRelatorio(bp, getEquipePlayer());
                inGameWindow.getBtnSuaVez().setEnabled(false);

                verificarPlacar(getEquipePlayer());

                if (!isHaVencedor()) {
                    System.out.println("NÃO HÁ VENCEDOR");

                    runIA();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Escolha OUtro");
            }
        } else{
            inGameWindow.getBtnTirarParOuImpar().doClick();
        }
    }
}
