package br.com.livr.statics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public abstract class Jogador implements ComponenteDoTime {

    private boolean cartaoAmarelo, cartaoVermelho;
    private String nomeJogador;
    private int numeroJogador;

    public Jogador() {
        this.cartaoAmarelo = false;
        this.cartaoVermelho = false;
    }

    public void obedecerAoTecnico() {
        System.out.println("Sim, senhor!");
    }

    public boolean getCartaoAmarelo() {
        return isCartaoAmarelo();
    }

    public void setCartaoAmarelo(boolean cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
    }

    public boolean getCartaoVermelho() {
        return isCartaoVermelho();
    }

    public void setCartaoVermelho(boolean cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
    }

    public boolean isCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public boolean isCartaoVermelho() {
        return cartaoVermelho;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getNumeroJogador() {
        return numeroJogador;
    }

    public void setNumeroJogador(int numeroJogador) {
        this.numeroJogador = numeroJogador;
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
