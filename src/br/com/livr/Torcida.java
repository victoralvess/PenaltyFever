package br.com.livr;

import br.com.livr.views.boundary.Notificacao;
import br.com.livr.statics.IAmanteDoFutebol;
import br.com.livr.statics.IComponenteDoTime;
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
        new Notificacao().exibirNotificacao("Campo Invadido", "A torcida invadiu o campo", "", true, 5, NotificationFactory.Location.NORTH);
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

    /**
     * @return the educado
     */
    public boolean isEducado() {
        return educado;
    }

    /**
     * @param educado the educado to set
     */
    public void setEducado(boolean educado) {
        this.educado = educado;
    }

    @Override
    public void reclamar(String reclamacao) {

    }

    @Override
    public void elogiar(IComponenteDoTime componenteDoTime, String elogio) {

    }

    @Override
    public void comemorar(String comemoracao) {

    }

    @Override
    public void lamentar() {
        Notificacao notificacao = new Notificacao();
        NotificationFactory.Location location = null;
        boolean torceParaOPlayer = this.getEquipe().equals(Sessao.getEquipePlayer());
        System.err.println(this.getEquipe().id);
        System.err.println(Sessao.getEquipePlayer().id);
        System.err.println(Sessao.getEquipeAdversaria().id);
        if (isEducado()) {
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.NORTHEAST;
            } else {
                location = NotificationFactory.Location.NORTHWEST;
            }
            notificacao.exibirNotificacao("Que peninha!", "Torcida de " + this.getEquipe().getNomeEquipe() + ":\nPelo menos o goleiro tentou.", "crying.png", true, 3, location);
        } else {            
            if (torceParaOPlayer) {
                location = NotificationFactory.Location.SOUTHEAST;
            } else {
                location = NotificationFactory.Location.SOUTHWEST;
            }
            notificacao.exibirNotificacao("QUE POR**! -" + ((torceParaOPlayer) ? "T P1": "T IA"), "Vai todo mundo se ...", "angry.png", true, 3, location);
        }
    }

}
