/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.statics;

import br.com.livr.BatedorDePenalti;
import br.com.livr.Goleiro;
import static br.com.livr.statics.Sessao.getBatedoresEquipeAdversaria;
import static br.com.livr.statics.Sessao.getBatedoresEquipePlayer;
import static br.com.livr.statics.Sessao.getBatedoresParticipantes;
import static br.com.livr.statics.Sessao.getGoleiroEquipeAdversaria;
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

/**
 *
 * @author victor
 */
public class ListListener implements ListSelectionListener {

    private int quantidadeItensSelecionados = 0;
    private static int[] indicesSelecionados;
    private boolean once = true;
    private int limiteDeEscolhas;
    private static String[] nomesBatedoresPenaltis = new String[(getJogadoresPorTime() * 2)]; //Lista com os 8 Jogadores
    private static String[] nomesGoleiros = new String[getGoleirosPorTime() * 2]; //Lista com os 2 Jogadores

    public ListListener(int limiteDeEscolhas) {
        this.limiteDeEscolhas = limiteDeEscolhas;
    }

    ListListener() {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList lista = (JList) e.getSource();

        setQuantidadeItensSelecionados(lista.getSelectedIndices().length);

        if (getQuantidadeItensSelecionados() == getLimiteDeEscolhas() && isOnce()) {
            if (getLimiteDeEscolhas() == 4) {
                getBatedoresEquipePlayer().clear();
                //Reestarta lista de adversários
                getBatedoresEquipeAdversaria().addAll(getBatedoresParticipantes());
            } else {
                setGoleiroEquipePlayer(null);
            }
            setIndicesSelecionados(lista.getSelectedIndices());
            for (int indice = 0; indice < getLimiteDeEscolhas(); indice++) {
                if (getLimiteDeEscolhas() == 4) { //Verifica se a quantidade máxima bate com a qtd de bp ou de goleiros
                    getBatedoresEquipePlayer().add(getBatedoresParticipantes().get(getIndicesSelecionados()[indice]));

                } else {
                    setGoleiroEquipePlayer(getGoleirosParticipantes().get(getIndicesSelecionados()[indice]));
                    setGoleiroEquipeAdversaria(cadastrarGoleiroAdversario(getGoleiroEquipePlayer()));
                }
            }

            //Pega a lista completa e remove os que são do time do jogador (para formar o time adv)
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
        //Cadastra os Jogadores
        setBatedoresParticipantes(new ArrayList<>());        
        int cont = 0;
        while (cont < 8) {
            getBatedoresParticipantes().add(new BatedorDePenalti(Sessao.getNomesJogadores()[cont], (cont +1)));
            cont++;
        }
        //Até o momento, todos são jogadores adversários
        getBatedoresEquipeAdversaria().addAll(getBatedoresParticipantes());
        //Cadastro de Goleiros
        setGoleirosParticipantes(new ArrayList<>());
        getGoleirosParticipantes().add(new Goleiro("Tiago"));
        getGoleirosParticipantes().add(new Goleiro("Gabriel"));

        getNomesJogadores(getBatedoresParticipantes(), getNomesBatedoresPenaltis());

        getNomesGoleiros(getGoleirosParticipantes(), getNomesGoleiros());

    }

    private static void getNomesJogadores(List<BatedorDePenalti> jogadoresParticipantes, String[] arrayQueSeraUsado) {
        int cont = 0;
        for (BatedorDePenalti jogador : jogadoresParticipantes) {
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
        return goleirosParticipantesAux.get(0); //Retorna Goleiro Adv
    }

    public static void cadastrarEquipeAdversaria() {
        List listaSemRepeticao = new ArrayList(new HashSet(getBatedoresEquipeAdversaria()));
        setBatedoresEquipeAdversaria(listaSemRepeticao);
        System.out.println(getGoleiroEquipeAdversaria().getNomeJogador());
    }
}
