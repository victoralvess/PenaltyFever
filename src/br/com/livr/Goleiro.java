package br.com.livr;

import br.com.livr.statics.Jogador;
import java.util.Random;

public class Goleiro extends Jogador {

    private final int precisaoMinimaParaDefender = 85;
    public Goleiro(String nomeGoleiro) {
        super();
        super.setNomeJogador(nomeGoleiro);
    }

    public boolean defender() {
        boolean defendeu = false;
        Random r = new Random();
        int precisaoDefesa = r.nextInt(101);
        if (precisaoDefesa >= precisaoMinimaParaDefender) {
            return defendeu;
        } else {
            return !defendeu;
        }
    }

}
