package br.com.livr;

import br.com.livr.statics.enums.TipoTorcida;
import java.util.HashMap;
import java.util.List;

public class Equipe {

    private List<BatedorDePenaltis> batedoresDePenaltis;
    private String nomeEquipe;
    private Tecnico tecnico;
    private Goleiro goleiro;
    private HashMap<TipoTorcida, Torcida> torcidas;
    public long id;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        id = System.nanoTime();
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

    public HashMap<TipoTorcida, Torcida> getTorcidas() {
        return torcidas;
    }

    public void setTorcidas(HashMap<TipoTorcida, Torcida> torcidas) {
        this.torcidas = torcidas;
    }
    
    @Override
    public boolean equals(Object equipe) {
        return (this.id == ((Equipe) equipe).id);
    }
}
