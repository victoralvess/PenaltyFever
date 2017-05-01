package br.com.livr;

import br.com.livr.Equipe;
import br.com.livr.statics.AmanteDoFutebol;
import br.com.livr.statics.ComponenteDoTime;
import br.com.livr.views.Notificacao;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Torcida implements AmanteDoFutebol {

    private Equipe time;
    private boolean educado;

    public void invadirCampo() {
        new Notificacao().exibirNotificacao("Campo Invadido", "A torcida invadiu o campo", "", true, 5);
    }

    public void torcer() {
        new Notificacao().exibirNotificacao("Olê olê olê", "VAMO " + this.getTime().getNomeTime() + "!!!", "", true, 5);
    }

    public Equipe getTime() {
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
    public String reclamar(String reclamacao) {
        return reclamacao;
    }

    @Override
    public String elogiar(ComponenteDoTime componenteDoTime, String elogio) {
        return elogio;
    }

    @Override
    public String comemorar(String comemoracao) {
        return comemoracao;
    }

    @Override
    public void lamentar() {
        Notificacao notificacao = new Notificacao();
        if (isEducado()) {
            notificacao.exibirNotificacao("Que peninha!", "Na próxima ganhamos", "crying.png", true, 5);
        } else {
            notificacao.exibirNotificacao("QUE POR**!", "Vai todo mundo se ...", "angry.png", true, 5);
        }
    }

}
