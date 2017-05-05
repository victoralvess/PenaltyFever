/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr;

import br.com.livr.statics.Arbitro;

/**
 *
 * @author Aluno_2
 */
public class Bandeirinha extends Arbitro {

    boolean irregularidade;

    public Bandeirinha(int nivelHonestidade) {
        super.setNivelHonestidade(nivelHonestidade);
    }

    public boolean comunicarIrregularidadeAoJuiz() {
        return roubar(getNivelHonestidade(), true);
    }

}
