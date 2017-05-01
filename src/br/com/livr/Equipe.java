package br.com.livr;

import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno_2
 */
public class Equipe {

    private List<BatedorDePenalti> jogadores;
    private String nomeTime;
    private Tecnico tecnico;
    private Goleiro goleiro;
    private HashMap<Boolean, Torcida> torcidas;

    public Equipe(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<BatedorDePenalti> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<BatedorDePenalti> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    /**
     * @return the goleiro
     */
    public Goleiro getGoleiro() {
        return goleiro;
    }

    /**
     * @param goleiro the goleiro to set
     */
    public void setGoleiro(Goleiro goleiro) {
        this.goleiro = goleiro;
    }

    public HashMap<Boolean, Torcida> getTorcidas() {
        return torcidas;
    }

    public void setTorcidas(HashMap<Boolean, Torcida> torcidas) {
        this.torcidas = torcidas;
    }
}
