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

    private int nivelHonestidade;
    boolean irregularidade;

    public Bandeirinha(int nivelHonestidade) {
        this.nivelHonestidade = nivelHonestidade;
    }

    public boolean comunicarGol(boolean foiGol) {
        if (foiGol) {
            return foiGol;
        } else {
            System.out.println("Gol Inválido!");
            return !foiGol;
        }
    }

    public boolean comunicarIrregularidade(boolean irregularidade) {
        if (!irregularidade) {
            System.out.println("Sem irregularidades.");
        } else {
            System.out.println("Gol impedido!");
        }
        return roubar(getNivelHonestidade(), irregularidade);
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
