package br.com.livr;

import br.com.livr.views.boundary.Notificacao;
import br.com.livr.statics.IAmanteDoFutebol;
import br.com.livr.statics.Sessao;
import com.notification.NotificationFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Torcida implements IAmanteDoFutebol {

    private Equipe time;
    private boolean educado;

    public void invadirCampo() {
        new Notificacao().exibirNotificacao("Invasão", "O Juizão roubou\n E a torcida invadiu o campo", "reclamar.png", true, 600, NotificationFactory.Location.NORTH);
    }

    public void torcer() {
        new Notificacao().exibirNotificacao("Olê olê olê", "VAMO " + this.getEquipe().getNomeEquipe() + "!!!", "", true, 5, NotificationFactory.Location.EAST);
    }

    public Equipe getEquipe() {
        return time;
    }

    public void setTime(Equipe time) {
        this.time = time;
    }

    public boolean isEducado() {
        return educado;
    }
    
    public void setEducado(boolean educado) {
        this.educado = educado;
    }

    @Override
    public void reclamar(String reclamacao) {

    }

    @Override
    public void elogiar(String elogio) {

    }

    @Override
    public void comemorar(String comemoracao) {
        Notificacao notificacao = new Notificacao();
        NotificationFactory.Location location = null;
        boolean torceParaOPlayer = this.getEquipe().equals(Sessao.getEquipePlayer());

        if (isEducado()) {
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.NORTHWEST;
            } else {
                location = NotificationFactory.Location.SOUTHWEST;
            }
            notificacao.exibirNotificacao(this.getEquipe().getNomeEquipe(), comemoracao, "crying.png", true, 6, location);
        } else {
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.NORTHEAST;
            } else {
                location = NotificationFactory.Location.SOUTHEAST;
            }
            notificacao.exibirNotificacao(this.getEquipe().getNomeEquipe(), comemoracao, "angry.png", true, 6, location);
        }
    }

    @Override
    public void lamentar(String lamentacao) {
        Notificacao notificacao = new Notificacao();
        NotificationFactory.Location location = null;
        boolean torceParaOPlayer = this.getEquipe().equals(Sessao.getEquipePlayer());
        
        if (isEducado()) {
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.NORTHEAST;
            } else {
                location = NotificationFactory.Location.SOUTHEAST;
            }
            notificacao.exibirNotificacao(this.getEquipe().getNomeEquipe(), lamentacao, "crying.png", true, 6, location);
        } else {
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.NORTHWEST;
            } else {
                location = NotificationFactory.Location.SOUTHWEST;
            }
            notificacao.exibirNotificacao(this.getEquipe().getNomeEquipe(), lamentacao, "angry.png", true, 6, location);
        }
    }

}
