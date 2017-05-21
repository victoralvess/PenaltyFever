package br.com.livr.statics;

import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;

public abstract class Jogador implements IAmanteDoFutebol {

    private boolean cartaoAmarelo, cartaoVermelho;
    private String nomeJogador;
    private int numeroJogador;

    public Jogador() {
        this.cartaoAmarelo = false;
        this.cartaoVermelho = false;
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
    public void reclamar(String reclamacao) {        
    new Notificacao().exibirNotificacao(this.getNomeJogador(), "Disse: \n" + reclamacao, "reclamar.png", true, 4, NotificationFactory.Location.SOUTH);
    }

    @Override
    public void elogiar(String elogio) {
        new Notificacao().exibirNotificacao(this.getNomeJogador(), "Disse: \n" + elogio, "elogiar.png", true, 4, NotificationFactory.Location.SOUTH);
    }

    @Override
    public void comemorar(String comemoracao) {
        new Notificacao().exibirNotificacao(this.getNomeJogador(), "Disse: \n" + comemoracao, "comemorar.png", true, 4, NotificationFactory.Location.SOUTH);
    }

    @Override
    public void lamentar(String lamentacao) {
        new Notificacao().exibirNotificacao(this.getNomeJogador(), "Disse: \n" + lamentacao, "lamentar.png", true, 4, NotificationFactory.Location.SOUTH);
    }
}
