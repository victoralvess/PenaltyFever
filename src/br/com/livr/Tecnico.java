package br.com.livr;


import br.com.livr.statics.IAmanteDoFutebol;
import java.util.Random;
import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Tecnico implements IAmanteDoFutebol {

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
        return equipe.getBatedoresDePenaltis().get(numeroJogador);       
    }

    public boolean tirarParOuImpar(int numeroEscolhido, boolean par) {
        int numeroIA = new Random().nextInt(2);
        int resultado = numeroEscolhido + numeroIA;
        return ((resultado % 2 == 0) && par);
    }
    
    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public void reclamar(String reclamacao) {
       new Notificacao().exibirNotificacao("Reclamação", reclamacao, "reclamar.png", true, 3, NotificationFactory.Location.NORTHWEST);
    }

    @Override
    public void elogiar(String elogio) {
       new Notificacao().exibirNotificacao("Elogio", elogio, "elogiar.png", true, 3, NotificationFactory.Location.NORTHWEST);
    }

    @Override
    public void comemorar(String comemoracao) {
        new Notificacao().exibirNotificacao("Comemoração", comemoracao, "comemorar.png", true, 3, NotificationFactory.Location.NORTHWEST);
    }

    @Override
    public void lamentar(String lamentacao) {
        new Notificacao().exibirNotificacao("Lamentação", lamentacao, "lamentar.png", true, 3, NotificationFactory.Location.NORTHWEST);
    }
}
