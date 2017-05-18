/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr;

import br.com.livr.statics.Arbitro;
import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;

/**
 *
 * @author Aluno_2
 */
public class Bandeirinha extends Arbitro {

    boolean irregularidade;

    public Bandeirinha(int nivelHonestidade) {
        super.setNivelHonestidade(nivelHonestidade);
    }

    public boolean verificarIrregularidadeAoJuiz() {
        return roubar(getNivelHonestidade(), true);
    }
    
    public void comunicarIrregularidadeAoJuiz() {
        new Notificacao().exibirNotificacao("Bandeirinha", "É pra Cartão!", "flag.png", true, 4, NotificationFactory.Location.NORTHEAST);
    }

}
