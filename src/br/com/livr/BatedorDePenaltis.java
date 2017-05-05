package br.com.livr;

import br.com.livr.statics.Jogador;
import br.com.livr.statics.Sessao;
import br.com.livr.views.boundary.Notificacao;
import br.com.livr.views.control.InGameWindowController;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class BatedorDePenaltis extends Jogador {

    private final int porcentagemMinimaParaChutarAoGol = 35;
    private static boolean marcouGol;

    public BatedorDePenaltis(String nomeBatedor, int numeroJogador) {
        super();
        super.setNomeJogador(nomeBatedor);
        super.setNumeroJogador(numeroJogador);
    }

    public String baterPenalti(Equipe equipeDoBatedor) {        
        Notificacao notificacao = new Notificacao();
        Random r = new Random();
        int chanceDeFazerGol = r.nextInt(101);

        if (chanceDeFazerGol >= porcentagemMinimaParaChutarAoGol) {
            Goleiro g = InGameWindowController.verificarEquipeDoGoleiro(equipeDoBatedor);
            if (!g.defender()) {
                setMarcouGol(true);
                notificacao.exibirNotificacao(this);
                Sessao.getTorcidaEducadaEquipeAdversaria().lamentar();
                return this.getNomeJogador() + " marcou o gol em " + g.getNomeJogador();
            } else {
                setMarcouGol(false);
                notificacao.exibirNotificacao(g);
                return g.getNomeJogador() + " defendeu o chute de " + this.getNomeJogador();
            }
        } else {
            setMarcouGol(false);
            notificacao.exibirNotificacao("Errooou", "Pelas barbas do profeta!", "goal-missed.png", true, 5);
            return this.getNomeJogador() + " errou o gol!";
        }
    }

    public static boolean isMarcouGol() {
        return marcouGol;
    }

    public static void setMarcouGol(boolean marcou) {
        marcouGol = marcou;
    }

    @Override
    public boolean equals(Object batedorDePenaltis) {
        return (this.getNumeroJogador() == ((BatedorDePenaltis) batedorDePenaltis).getNumeroJogador());
    }
}
