/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr;

import br.com.livr.statics.Arbitro;
import br.com.livr.statics.Jogador;

/**
 *
 * @author Aluno_2
 */
public class Juiz extends Arbitro {    
            
    
    private int nivelHonestidade;
    
    public Juiz(int nivelHonestidade) {
        this.nivelHonestidade = nivelHonestidade;
    }
    
    public boolean validarGol(boolean foiGol) {
        return roubar(getNivelHonestidade(), foiGol);
    }

    public boolean validarBatida(boolean batidaValida) {
       return roubar(getNivelHonestidade(), batidaValida);
    }
    
    public void penalizarJogador(Jogador jogador, String corCartao) {
        if (corCartao.equalsIgnoreCase("amarelo")) {
            if (jogador.getCartaoAmarelo()) {
                jogador.setCartaoVermelho(true);
            } else {
                jogador.setCartaoAmarelo(true);
            }
        } else if (corCartao.equalsIgnoreCase("vermelho")) {
            jogador.setCartaoVermelho(true);
        }
    }

    @Override
    public int getNivelHonestidade() {
        return nivelHonestidade;
    }

    @Override
    public void setNivelHonestidade(int nivelHonestidade) {
        this.nivelHonestidade = nivelHonestidade;
    }
}
