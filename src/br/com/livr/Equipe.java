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

    private List<BatedorDePenaltis> batedoresDePenaltis;
    private String nomeEquipe;
    private Tecnico tecnico;
    private Goleiro goleiro;
    private HashMap<Boolean, Torcida> torcidas;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public List<BatedorDePenaltis> getBatedoresDePenaltis() {
        return batedoresDePenaltis;
    }

    public void setBatedoresDePenaltis(List<BatedorDePenaltis> batedoresDePenaltis) {
        this.batedoresDePenaltis = batedoresDePenaltis;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public Goleiro getGoleiro() {
        return goleiro;
    }
    
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
