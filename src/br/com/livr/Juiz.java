/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr;

import br.com.livr.statics.Arbitro;
import br.com.livr.statics.enums.Cartao;
import br.com.livr.statics.Jogador;

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
    }
}
