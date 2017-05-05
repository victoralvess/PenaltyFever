package br.com.livr;


import java.util.Random;
import br.com.livr.statics.IComponenteDoTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Tecnico implements IComponenteDoTime {

    private String nome;
    private Equipe equipe;
    
    public Tecnico(String username, Equipe equipe) {
        this.nome = username;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BatedorDePenaltis escolherBatedor(int numeroJogador) {
        return equipe.getJogadores().get(numeroJogador);       
    }

    public boolean tirarParOuImpar(int numeroEscolhido, boolean par) {
        int numeroIA = new Random().nextInt(2);
        int resultado = numeroEscolhido + numeroIA;
        return ((resultado % 2 == 0) && par);
    }
    
//    public void escolherTime(Equipe time, BatedorDePenaltis jogador) {
//        time.getJogadores().add(jogador);
//    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public void darEntrevista(String discurso) {
        
    }

    @Override
    public void reclamar(String reclamacao) {
       
    }

    @Override
    public void elogiar(IComponenteDoTime componenteDoTime, String elogio) {
       
    }

    @Override
    public void comemorar(String comemoracao) {
        
    }

    @Override
    public void lamentar() {
       
    }
}
