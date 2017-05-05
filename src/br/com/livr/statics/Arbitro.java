/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.statics;

import br.com.livr.views.boundary.Notificacao;
import java.util.Random;

/**
 *
 * @author Aluno_2
 */
public abstract class Arbitro {
    
    private int nivelHonestidade;

    public int getNivelHonestidade() {
        return nivelHonestidade;
    }

    public void setNivelHonestidade(int aNivelHonestidade) {
        nivelHonestidade = aNivelHonestidade;
    }

    public boolean roubar(int nivelHonestidade, boolean decisaoCerta) {
        Random r = new Random();
        int valor = r.nextInt(100) + 1;

        if (valor < 90 && nivelHonestidade >= 50) {
            return decisaoCerta;
        }
        return !decisaoCerta;
    }

    public void explicarRegras() {
        new Notificacao().exibirNotificacao("Regras", "Vale quase tudo!", "angry.png", true, 5);
    }
}
