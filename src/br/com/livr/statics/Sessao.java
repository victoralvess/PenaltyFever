/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.statics;

import br.com.livr.Bandeirinha;
import br.com.livr.BatedorDePenalti;
import br.com.livr.Equipe;
import br.com.livr.Gandula;
import br.com.livr.Goleiro;
import br.com.livr.Juiz;
import br.com.livr.Tecnico;
import br.com.livr.Torcida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor
 */
public abstract class Sessao {

    private static Equipe equipePlayer, equipeAdversaria;
    private static Goleiro goleiroEquipePlayer, goleiroEquipeAdversaria;
    private static List<Goleiro> goleirosParticipantes;
    private static List<BatedorDePenalti> batedoresParticipantes, batedoresEquipePlayer = new ArrayList<>(), batedoresEquipeAdversaria = new ArrayList<>();
    ;
    private static Tecnico tecnico;
    private static Gandula gandula;
    private static Bandeirinha bandeirinha;
    private static Juiz juiz;
    private static Torcida torcidaEducadaEquipePlayer, torcidaEducadaEquipeAdversaria, torcidaMalEducadaEquipePlayer, torcidaMalEducadaEquipeAdversaria;
    private static final int JOGADORES_POR_TIME = 4;
    private static final int GOLEIROS_POR_TIME = 1;
    private static final String[] nomesJogadores = new String[]{
        "Renan",
        "Leonardo",
        "Icaro",
        "Rafael",
        "José",
        "Mateus",
        "Raj",
        "Pão"};

    public static Equipe getEquipePlayer() {
        return equipePlayer;
    }

    public static Equipe getEquipeAdversaria() {
        return equipeAdversaria;
    }

    public static Goleiro getGoleiroEquipePlayer() {
        return goleiroEquipePlayer;
    }

    public static Goleiro getGoleiroEquipeAdversaria() {
        return goleiroEquipeAdversaria;
    }

    public static List<Goleiro> getGoleirosParticipantes() {
        return goleirosParticipantes;
    }

    public static List<BatedorDePenalti> getBatedoresParticipantes() {
        return batedoresParticipantes;
    }

    public static List<BatedorDePenalti> getBatedoresEquipePlayer() {
        return batedoresEquipePlayer;
    }

    public static List<BatedorDePenalti> getBatedoresEquipeAdversaria() {
        return batedoresEquipeAdversaria;
    }

    public static Tecnico getTecnico() {
        return tecnico;
    }

    public static Gandula getGandula() {
        return gandula;
    }

    public static Bandeirinha getBandeirinha() {
        return bandeirinha;
    }

    public static Juiz getJuiz() {
        return juiz;
    }

    public static int getJogadoresPorTime() {
        return JOGADORES_POR_TIME;
    }

    public static int getGoleirosPorTime() {
        return GOLEIROS_POR_TIME;
    }

    public static void setEquipePlayer(Equipe aEquipePlayer) {
        equipePlayer = aEquipePlayer;
    }

    public static void setEquipeAdversaria(Equipe aEquipeAdversaria) {
        equipeAdversaria = aEquipeAdversaria;
    }

    public static void setGoleiroEquipePlayer(Goleiro aGoleiroEquipePlayer) {
        goleiroEquipePlayer = aGoleiroEquipePlayer;
    }

    public static void setGoleiroEquipeAdversaria(Goleiro aGoleiroEquipeAdversaria) {
        goleiroEquipeAdversaria = aGoleiroEquipeAdversaria;
    }

    public static void setGoleirosParticipantes(List<Goleiro> aGoleirosParticipantes) {
        goleirosParticipantes = aGoleirosParticipantes;
    }

    public static void setBatedoresParticipantes(List<BatedorDePenalti> aBatedoresParticipantes) {
        batedoresParticipantes = aBatedoresParticipantes;
    }

    public static void setBatedoresEquipePlayer(List<BatedorDePenalti> aBatedoresEquipePlayer) {
        batedoresEquipePlayer = aBatedoresEquipePlayer;
    }

    public static void setBatedoresEquipeAdversaria(List<BatedorDePenalti> aBatedoresEquipeAdversaria) {
        batedoresEquipeAdversaria = aBatedoresEquipeAdversaria;
    }

    public static void setTecnico(Tecnico aTecnico) {
        tecnico = aTecnico;
    }

    public static void setGandula(Gandula aGandula) {
        gandula = aGandula;
    }

    public static void setBandeirinha(Bandeirinha aBandeirinha) {
        bandeirinha = aBandeirinha;
    }

    public static void setJuiz(Juiz aJuiz) {
        juiz = aJuiz;
    }

    public static String[] getNomesJogadores() {
        return nomesJogadores;
    }

    public static Torcida getTorcidaEducadaEquipePlayer() {
        return torcidaEducadaEquipePlayer;
    }

    public static Torcida getTorcidaEducadaEquipeAdversaria() {
        return torcidaEducadaEquipeAdversaria;
    }

    public static Torcida getTorcidaMalEducadaEquipePlayer() {
        return torcidaMalEducadaEquipePlayer;
    }

    public static Torcida getTorcidaMalEducadaEquipeAdversaria() {
        return torcidaMalEducadaEquipeAdversaria;
    }

    public static void setTorcidaEducadaEquipePlayer(Torcida aTorcidaEducadaEquipePlayer) {
        torcidaEducadaEquipePlayer = aTorcidaEducadaEquipePlayer;
    }

    public static void setTorcidaEducadaEquipeAdversaria(Torcida aTorcidaEducadaEquipeAdversaria) {
        torcidaEducadaEquipeAdversaria = aTorcidaEducadaEquipeAdversaria;
    }

    public static void setTorcidaMalEducadaEquipePlayer(Torcida aTorcidaMalEducadaEquipePlayer) {
        torcidaMalEducadaEquipePlayer = aTorcidaMalEducadaEquipePlayer;
    }

    public static void setTorcidaMalEducadaEquipeAdversaria(Torcida aTorcidaMalEducadaEquipeAdversaria) {
        torcidaMalEducadaEquipeAdversaria = aTorcidaMalEducadaEquipeAdversaria;
    }
}
