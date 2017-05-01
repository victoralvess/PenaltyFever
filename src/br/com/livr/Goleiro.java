package br.com.livr;

import br.com.livr.statics.Jogador;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Goleiro extends Jogador {

    private final int valorMinimoParaDefender = 65;
    public Goleiro(String nomeGoleiro) {
        super();
        super.setNomeJogador(nomeGoleiro);
    }

    public boolean tentarDefender() {
        boolean defendeu = false;
        Random r = new Random();
        int chanceDeDefender = r.nextInt(101);
        System.out.println(chanceDeDefender);
        if (chanceDeDefender >= valorMinimoParaDefender) {
            return defendeu;
        } else {
            return !defendeu;
        }
    }

    public String provocarBatedor(String provocacao) {
        return provocacao;
    }

}
