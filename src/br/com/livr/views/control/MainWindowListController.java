package br.com.livr.views.control;

import br.com.livr.BatedorDePenaltis;
import br.com.livr.Goleiro;
import br.com.livr.statics.Sessao;
import static br.com.livr.statics.Sessao.getBatedoresEquipeAdversaria;
import static br.com.livr.statics.Sessao.getBatedoresEquipePlayer;
import static br.com.livr.statics.Sessao.getBatedoresParticipantes;
import static br.com.livr.statics.Sessao.getGoleiroEquipePlayer;
import static br.com.livr.statics.Sessao.getGoleirosParticipantes;
import static br.com.livr.statics.Sessao.getGoleirosPorTime;
import static br.com.livr.statics.Sessao.getJogadoresPorTime;
import static br.com.livr.statics.Sessao.setBatedoresEquipeAdversaria;
import static br.com.livr.statics.Sessao.setBatedoresParticipantes;
import static br.com.livr.statics.Sessao.setGoleiroEquipeAdversaria;
import static br.com.livr.statics.Sessao.setGoleiroEquipePlayer;
import static br.com.livr.statics.Sessao.setGoleirosParticipantes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainWindowListController implements ListSelectionListener {

    private int quantidadeItensSelecionados = 0;
    private static int[] indicesSelecionados;
    private boolean once = true;
    private int limiteDeEscolhas;
    private static String[] nomesBatedoresPenaltis = new String[(getJogadoresPorTime() * 2)]; //Lista com os 8 Jogadores
    private static String[] nomesGoleiros = new String[getGoleirosPorTime() * 2]; //Lista com os 2 Jogadores

    public MainWindowListController(int limiteDeEscolhas) {
        this.limiteDeEscolhas = limiteDeEscolhas;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList lista = (JList) e.getSource();

        setQuantidadeItensSelecionados(lista.getSelectedIndices().length);

        if (getQuantidadeItensSelecionados() == getLimiteDeEscolhas() && isOnce()) {
            if (getLimiteDeEscolhas() == 4) {
                getBatedoresEquipePlayer().clear();
                
                getBatedoresEquipeAdversaria().addAll(getBatedoresParticipantes());
            } else {
                setGoleiroEquipePlayer(null);
            }
            setIndicesSelecionados(lista.getSelectedIndices());
            for (int indice = 0; indice < getLimiteDeEscolhas(); indice++) {
                if (getLimiteDeEscolhas() == 4) { 
                    getBatedoresEquipePlayer().add(getBatedoresParticipantes().get(getIndicesSelecionados()[indice]));
                } else {
                    setGoleiroEquipePlayer(getGoleirosParticipantes().get(getIndicesSelecionados()[indice]));
                    setGoleiroEquipeAdversaria(cadastrarGoleiroAdversario(getGoleiroEquipePlayer()));
                }
            }
            
            getBatedoresEquipeAdversaria().removeAll(getBatedoresEquipePlayer());

            setOnce(false);
        } else if (!isOnce()) {

            setOnce(true);
        }

    }

    public int getQuantidadeItensSelecionados() {
        return quantidadeItensSelecionados;
    }

    public static int[] getIndicesSelecionados() {
        return indicesSelecionados;
    }

    public void setQuantidadeItensSelecionados(int quantidadeItensSelecionados) {
        this.quantidadeItensSelecionados = quantidadeItensSelecionados;
    }

    public static void setIndicesSelecionados(int[] aIndicesSelecionados) {
        indicesSelecionados = aIndicesSelecionados;
    }

    public static void initListasJogadores() {
        setBatedoresParticipantes(new ArrayList<>());        
        int cont = 0;
        while (cont < 8) {
            getBatedoresParticipantes().add(new BatedorDePenaltis(Sessao.getNomesJogadores()[cont], (cont +1)));
            cont++;
        }
        
        getBatedoresEquipeAdversaria().addAll(getBatedoresParticipantes());
        
        setGoleirosParticipantes(new ArrayList<>());
        getGoleirosParticipantes().add(new Goleiro("Tiago"));
        getGoleirosParticipantes().add(new Goleiro("Gabriel"));

        getNomesJogadores(getBatedoresParticipantes(), getNomesBatedoresPenaltis());

        getNomesGoleiros(getGoleirosParticipantes(), getNomesGoleiros());

    }

    private static void getNomesJogadores(List<BatedorDePenaltis> jogadoresParticipantes, String[] arrayQueSeraUsado) {
        int cont = 0;
        for (BatedorDePenaltis jogador : jogadoresParticipantes) {
            arrayQueSeraUsado[cont] = jogador.getNomeJogador();
            cont++;
        }
    }

    private static void getNomesGoleiros(List<Goleiro> goleirosParticipantes, String[] arrayQueSeraUsado) {
        int cont = 0;
        for (Goleiro jogador : goleirosParticipantes) {
            arrayQueSeraUsado[cont] = jogador.getNomeJogador();
            cont++;
        }
    }

    public boolean isOnce() {
        return once;
    }

    public int getLimiteDeEscolhas() {
        return limiteDeEscolhas;
    }

    public static String[] getNomesBatedoresPenaltis() {
        return nomesBatedoresPenaltis;
    }

    public void setOnce(boolean once) {
        this.once = once;
    }

    public void setLimiteDeEscolhas(int limiteDeEscolhas) {
        this.limiteDeEscolhas = limiteDeEscolhas;
    }

    public void setNomesBatedoresPenaltis(String[] aNomesBatedoresPenaltis) {
        nomesBatedoresPenaltis = aNomesBatedoresPenaltis;
    }

    public static String[] getNomesGoleiros() {
        return nomesGoleiros;
    }

    public static void setNomesGoleiros(String[] aNomesGoleiros) {
        nomesGoleiros = aNomesGoleiros;
    }

    private static Goleiro cadastrarGoleiroAdversario(Goleiro goleiroEquipePlayer) {
        List<Goleiro> goleirosParticipantesAux = new ArrayList<>();
        getGoleirosParticipantes().forEach((g) -> {
            goleirosParticipantesAux.add(g);
        });
        goleirosParticipantesAux.remove(goleiroEquipePlayer);
        return goleirosParticipantesAux.get(0); 
    }

    public static void cadastrarEquipeAdversaria() {
        List listaSemRepeticao = new ArrayList(new HashSet(getBatedoresEquipeAdversaria()));
        setBatedoresEquipeAdversaria(listaSemRepeticao);
    }
}
