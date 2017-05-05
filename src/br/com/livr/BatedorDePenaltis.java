package br.com.livr;

import br.com.livr.statics.Jogador;
import br.com.livr.statics.Sessao;
import br.com.livr.statics.enums.TipoTorcida;
import br.com.livr.views.boundary.Notificacao;
import br.com.livr.views.control.InGameWindowController;
import com.notification.NotificationFactory;
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

    private final int precisaoMinimaParaChutarAoGol = 35;
    private static boolean marcouGol;

    public BatedorDePenaltis(String nomeBatedor, int numeroJogador) {
        super();
        super.setNomeJogador(nomeBatedor);
        super.setNumeroJogador(numeroJogador);
    }

    public String baterPenalti(Equipe equipeDoBatedor) {
        Notificacao notificacao = new Notificacao();
        Random r = new Random();
        int precisaoDoChute = r.nextInt(101);

        if (precisaoDoChute >= precisaoMinimaParaChutarAoGol) {
            Goleiro g = InGameWindowController.verificarEquipeDoGoleiro(equipeDoBatedor);
            if (!g.defender()) {
                setMarcouGol(true);
                notificacao.exibirNotificacao(this);
                if (equipeDoBatedor.equals(Sessao.getEquipePlayer())) {
                    Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();//Comemorar
                    Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();//Comemorar
                    Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();
                    Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();
                } else {                    
                    Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();//Comemorar
                    Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();//Comemorar
                    Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();
                    Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();
                }

                return this.getNomeJogador() + " marcou o gol em " + g.getNomeJogador();
            } else {
                setMarcouGol(false);
                notificacao.exibirNotificacao(g);
                return g.getNomeJogador() + " defendeu o chute de " + this.getNomeJogador();
            }
        } else {
            setMarcouGol(false);
            notificacao.exibirNotificacao("Errooou", "Pelas barbas do profeta!", "goal-missed.png", true, 5, NotificationFactory.Location.SOUTHEAST);
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
