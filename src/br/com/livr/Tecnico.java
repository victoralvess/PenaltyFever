package br.com.livr;


import br.com.livr.statics.ComponenteDoTime;
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
public class Tecnico implements ComponenteDoTime {

    private String username;
    private Equipe equipe;
    
    public Tecnico(String username, Equipe equipe) {
        this.username = username;
        this.equipe = equipe;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BatedorDePenalti escolherBatedor(int numeroJogador) {
        return equipe.getJogadores().get(numeroJogador);       
    }

    public boolean tirarParOuImpar(int numero, boolean par) {
        int numeroIA = new Random().nextInt(2);
        int resultado = numero + numeroIA;
        return ((resultado % 2 == 0) && par);
    }

    public void escolherTime(Equipe time, BatedorDePenalti jogador) {
        time.getJogadores().add(jogador);
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
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
    }
    
    @Override
    public String darEntrevista(String textoEntrevista) {
        return textoEntrevista;
    }
}
