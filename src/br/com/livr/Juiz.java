/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr;

import br.com.livr.statics.Arbitro;
import br.com.livr.statics.enums.Cartao;
import br.com.livr.statics.Jogador;
import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;

/**
 *
 * @author Aluno_2
 */
public class Juiz extends Arbitro {    
    
    public Juiz(int nivelHonestidade) {
        super.setNivelHonestidade(nivelHonestidade);
    }
    
    public void penalizar(Jogador jogador, Cartao corCartao) {
        if (corCartao.equals(Cartao.AMARELO)) {
            if (jogador.getCartaoAmarelo()) {
                jogador.setCartaoVermelho(true);
            } else {
                jogador.setCartaoAmarelo(true);
            }
        } else if (corCartao.equals(Cartao.VERMELHO)) {
            jogador.setCartaoVermelho(true);
        }
        
        new Notificacao().exibirNotificacao("Juiz", "Cartão!", "card.png", true, 4, NotificationFactory.Location.EAST);
    }

    public void autorizarBatida() {
        new Notificacao().exibirNotificacao("Juiz", "Autorizado!", "whistle.png", true, 3, NotificationFactory.Location.NORTH);
    }
}
