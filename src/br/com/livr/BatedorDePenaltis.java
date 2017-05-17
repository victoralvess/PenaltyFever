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

    private final int precisaoMinimaParaChutarAoGol = 0;
    private static boolean marcouGol;
    private int impacienciaTorcida;

    public BatedorDePenaltis(String nomeBatedor, int numeroJogador) {
        super();
        super.setNomeJogador(nomeBatedor);
        super.setNumeroJogador(numeroJogador);
    }

    public String baterPenalti(Equipe equipeDoBatedor) {
        setImpacienciaTorcida(-100);
        Notificacao notificacao = new Notificacao();
        Random r = new Random();
        int precisaoDoChute = r.nextInt(101);
        if (precisaoDoChute >= precisaoMinimaParaChutarAoGol) {
            Goleiro g = InGameWindowController.verificarEquipeDoGoleiro(equipeDoBatedor);
            if (!g.defender()) {
                setMarcouGol(true);
                boolean decisaoJuiz;
                decisaoJuiz = Sessao.getJuiz().roubar(Sessao.getJuiz().getNivelHonestidade(), isMarcouGol());
                if (decisaoJuiz == isMarcouGol()) {
                    notificacao.exibirNotificacao(this);
                    if (equipeDoBatedor.equals(Sessao.getEquipePlayer())) {
                        Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.EDUCADA).comemorar("Aeee que Gol Maravilhoso");
                        Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.MAL_EDUCADA).comemorar("Aeee Gol Porr*");
                        Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();
                        Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();
                    } else {
                        Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.EDUCADA).comemorar("Aeee que Gol Maravilhoso");
                        Sessao.getEquipeAdversaria().getTorcidas().get(TipoTorcida.MAL_EDUCADA).comemorar("Aeee Gol Porr*");
                        Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.EDUCADA).lamentar();
                        Sessao.getEquipePlayer().getTorcidas().get(TipoTorcida.MAL_EDUCADA).lamentar();
                    }

                    return this.getNomeJogador() + " marcou o gol em " + g.getNomeJogador();
                } else {
                    setMarcouGol(false);
                    
                    setImpacienciaTorcida(new Random().nextInt(101));
                    if(getImpacienciaTorcida() >= 95) { 
                        new Notificacao().exibirNotificacao("Invasão", "O Juizão roubou\n E a torcida invadiu o campo", "reclamar.png", true, 600, NotificationFactory.Location.NORTH);
                    }
                    
                    return "O juiz invalidou o gol roubando";
                }
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

    public int getImpacienciaTorcida() {
        return impacienciaTorcida;
    }

    public void setImpacienciaTorcida(int pacienciaTorcida) {
        this.impacienciaTorcida = pacienciaTorcida;
    }
}
