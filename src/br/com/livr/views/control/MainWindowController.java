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
import br.com.livr.statics.enums.TipoTorcida;
import br.com.livr.views.boundary.ErrorDialog;
import br.com.livr.views.boundary.InGameWindow;
import br.com.livr.views.boundary.MainWindow;
import java.util.HashMap;
import javax.swing.JTextField;

public class MainWindowController {

    private final MainWindow mainWindow;

    public MainWindowController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public void btnLoginClick() {
        boolean erro = false;
        ErrorDialog dialogErro;

        if (!(verificarEntradaDe(mainWindow.getTxtNome()))) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Qual é seu nome?", "Treinador(a), informe seu nome.");
            dialogErro.setVisible(true);
        }

        if (!(verificarEntradaDe(mainWindow.getTxtEquipe()))) {
            erro = true;
            dialogErro = new ErrorDialog(null, true, "Qual é seu time?", "Treinador(a), coloque o nome do seu time.");
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
            createEquipes();
            createTecnico();
            setTorcidasNosTimes();
            new InGameWindow().setVisible(true);            
            mainWindow.dispose();
        }
    }

    private boolean verificarEntradaDe(JTextField textField) {
        return !(textField.getText().trim().isEmpty()); //Se length == 0, false
    }

    private void setTorcidasNosTimes() {
        HashMap<TipoTorcida, Torcida> torcidasPro = new HashMap<>();
        HashMap<TipoTorcida, Torcida> torcidasContra = new HashMap<>();

        Torcida torcidaProEducada = new Torcida();
        torcidaProEducada.setEducado(true);
        torcidaProEducada.setTime(getEquipePlayer());
        
        Torcida torcidaProMalEducada = new Torcida();
        torcidaProMalEducada.setEducado(false);
        torcidaProMalEducada.setTime(getEquipePlayer());
        
        torcidasPro.put(TipoTorcida.EDUCADA, torcidaProEducada);
        torcidasPro.put(TipoTorcida.MAL_EDUCADA, torcidaProMalEducada);
        getEquipePlayer().setTorcidas(torcidasPro);
        
        Torcida torcidaContraEducada = new Torcida();
        torcidaContraEducada.setEducado(true);
        torcidaContraEducada.setTime(getEquipeAdversaria());

        Torcida torcidaContraMalEducada = new Torcida();
        torcidaContraMalEducada.setEducado(false);
        torcidaContraMalEducada.setTime(getEquipeAdversaria());

        torcidasContra.put(TipoTorcida.EDUCADA, torcidaContraEducada);
        torcidasContra.put(TipoTorcida.MAL_EDUCADA, torcidaContraMalEducada);
        getEquipeAdversaria().setTorcidas(torcidasContra);

        Sessao.setTorcidaEducadaEquipeAdversaria(torcidaContraEducada);
        Sessao.setTorcidaEducadaEquipePlayer(torcidaProEducada);
        Sessao.setTorcidaMalEducadaEquipeAdversaria(torcidaContraMalEducada);
        Sessao.setTorcidaMalEducadaEquipePlayer(torcidaProMalEducada);

    }

    private void createTecnico() {
        String nomeTecnico = mainWindow.getTxtNome().getText();
        setTecnico(new Tecnico(nomeTecnico.substring(0, (12 > nomeTecnico.length()) ? nomeTecnico.length() : 12), getEquipePlayer()));
        getEquipePlayer().setTecnico(getTecnico());
    }

    private void createEquipes() {
        String nomeTime = mainWindow.getTxtEquipe().getText();
        setEquipePlayer(new Equipe(nomeTime.substring(0, (12 > nomeTime.length()) ? nomeTime.length() : 12)));
        getEquipePlayer().setGoleiro(getGoleiroEquipePlayer());
        getEquipePlayer().setBatedoresDePenaltis(getBatedoresEquipePlayer());

        MainWindowListController.cadastrarEquipeAdversaria();
        String nomeTimeAdv = new StringBuffer(nomeTime).reverse().toString();
        setEquipeAdversaria(new Equipe(nomeTimeAdv.substring(0, (12 > nomeTimeAdv.length()) ? nomeTimeAdv.length() : 12)));
        getEquipeAdversaria().setGoleiro(getGoleiroEquipeAdversaria());
        getEquipeAdversaria().setBatedoresDePenaltis(getBatedoresEquipeAdversaria());
        getEquipeAdversaria().setTecnico(new Tecnico("IA", getEquipeAdversaria()));
    }

    public void closeButtonOnClick() {
        System.exit(0);
    }
}
