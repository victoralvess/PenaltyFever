/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.control;

import br.com.livr.Equipe;
import br.com.livr.Tecnico;
import br.com.livr.Torcida;
import br.com.livr.statics.Sessao;
import static br.com.livr.statics.Sessao.getBatedoresEquipeAdversaria;
import static br.com.livr.statics.Sessao.getBatedoresEquipePlayer;
import static br.com.livr.statics.Sessao.getEquipeAdversaria;
import static br.com.livr.statics.Sessao.getEquipePlayer;
import static br.com.livr.statics.Sessao.getGoleiroEquipeAdversaria;
import static br.com.livr.statics.Sessao.getGoleiroEquipePlayer;
import static br.com.livr.statics.Sessao.getTecnico;
import static br.com.livr.statics.Sessao.setEquipeAdversaria;
import static br.com.livr.statics.Sessao.setEquipePlayer;
import static br.com.livr.statics.Sessao.setTecnico;
import br.com.livr.views.boundary.ErrorDialog;
import br.com.livr.views.boundary.InGameWindow;
import br.com.livr.views.boundary.MainWindow;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JTextField;

/**
 *
 * @author victor
 */
public class MainWindowController {

    private final MainWindow mainWindow;

    public MainWindowController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }
    
    public void btnLoginActionPerformed(ActionEvent evt) {
        boolean erro = false;
        ErrorDialog dialogErro;
        
        if (!(verificarEntradaDe(mainWindow.getTxfNomeEquipe()))) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Qual é seu time?", "Treinador(a), coloque o nome do seu time.");
            dialogErro.setVisible(true);
        }
        
        if (!(verificarEntradaDe(mainWindow.getTxfNomeTreinador()))) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Qual é seu nome?", "Treinador(a), informe seu nome.");
            dialogErro.setVisible(true);
        }
        
        if (getBatedoresEquipePlayer().size() != 4) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Sem escalação", "Selecione apenas 4 batedores de pênaltis.");
            dialogErro.setVisible(true);
        }
        
        if (getGoleiroEquipePlayer() == null) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Sem goleiro", "Selecione 1 goleiro.");
            dialogErro.setVisible(true);
        }

        if (!erro) {
            //Criação das Equipes     
            createEquipes();
            //Autenticação 
            createTecnico();
            //Criação das Torcidas
            setTorcidasNosTimes();
//

//            System.out.println(nomeTime);
//            equipePlayer.getJogadores().forEach((j) -> {
//                System.out.println(j.getNomeJogador());
//            });
//            
//            System.out.println(equipePlayer.getGoleiro().getNomeJogador() + "(GK)");
//            System.out.println(equipePlayer.getTecnico().getNome() + "(Coach)");
//            System.out.println(nomeTimeAdv);
//            equipeAdversaria.getJogadores().forEach((j) -> {
//                System.out.println(j.getNomeJogador());
//            });
//            
//            System.out.println(equipeAdversaria.getGoleiro().getNomeJogador() + "(GK)");
//            System.out.println(equipeAdversaria.getTecnico().getNome() + "(Coach)");
//
//            System.out.println();
            new InGameWindow().setVisible(true);
            mainWindow.dispose();
        }
    }

    private boolean verificarEntradaDe(JTextField textField) {
        return !(textField.getText().trim().isEmpty()); //Se length == 0, false
    }

    private void setTorcidasNosTimes() {
        HashMap<Boolean, Torcida> torcidasPro = new HashMap<>();
        HashMap<Boolean, Torcida> torcidasContra = new HashMap<>();

        //Torcidas do Time do Jogador
        //Educada
        Torcida torcidaProEducada = new Torcida();
        torcidaProEducada.setEducado(true);
        torcidaProEducada.setTime(getEquipePlayer());
        //Mal Educada
        Torcida torcidaProMalEducada = new Torcida();
        torcidaProEducada.setEducado(false);
        torcidaProEducada.setTime(getEquipePlayer());
        //Setando nos time do Jogador
        torcidasPro.put(Boolean.TRUE, torcidaProEducada);
        torcidasPro.put(Boolean.FALSE, torcidaProMalEducada);
        getEquipePlayer().setTorcidas(torcidasPro);
        //Mesmo processo para o time da IA
        Torcida torcidaContraEducada = new Torcida();
        torcidaContraEducada.setEducado(true);
        torcidaContraEducada.setTime(getEquipePlayer());

        Torcida torcidaContraMalEducada = new Torcida();
        torcidaContraMalEducada.setEducado(false);
        torcidaContraMalEducada.setTime(getEquipePlayer());

        torcidasContra.put(Boolean.TRUE, torcidaContraEducada);
        torcidasContra.put(Boolean.FALSE, torcidaContraMalEducada);
        getEquipeAdversaria().setTorcidas(torcidasContra);

        Sessao.setTorcidaEducadaEquipeAdversaria(torcidaContraEducada);
        Sessao.setTorcidaEducadaEquipePlayer(torcidaProEducada);
        Sessao.setTorcidaMalEducadaEquipeAdversaria(torcidaContraMalEducada);
        Sessao.setTorcidaMalEducadaEquipePlayer(torcidaProMalEducada);

    }

    private void createTecnico() {
        String nomeTecnico = mainWindow.getTxfNomeTreinador().getText();
        setTecnico(new Tecnico(nomeTecnico.substring(0, (19 > nomeTecnico.length()) ? nomeTecnico.length() : 19), getEquipePlayer()));
        getEquipePlayer().setTecnico(getTecnico());
    }

    private void createEquipes() {
        String nomeTime = mainWindow.getTxfNomeEquipe().getText();
        setEquipePlayer(new Equipe(nomeTime.substring(0, (19 > nomeTime.length()) ? nomeTime.length() : 19)));
        getEquipePlayer().setGoleiro(getGoleiroEquipePlayer());
        getEquipePlayer().setJogadores(getBatedoresEquipePlayer());

        MainWindowListController.cadastrarEquipeAdversaria();
        String nomeTimeAdv = new StringBuffer(nomeTime).reverse().toString();
        setEquipeAdversaria(new Equipe(nomeTimeAdv.substring(0, (19 > nomeTimeAdv.length()) ? nomeTimeAdv.length() : 19)));
        getEquipeAdversaria().setGoleiro(getGoleiroEquipeAdversaria());
        getEquipeAdversaria().setJogadores(getBatedoresEquipeAdversaria());
        getEquipeAdversaria().setTecnico(new Tecnico("IA", getEquipeAdversaria()));
    }
}
