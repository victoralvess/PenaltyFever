package br.com.livr.views.control;

import br.com.livr.statics.Sessao;
import br.com.livr.views.boundary.ReacaoDialog;
import javax.swing.JRadioButton;

public class ReacaoDialogController {

    private ReacaoDialog reacaoDialog;
    JRadioButton[] botoesReacaoDialog;
    final String[] tipoReacao = {"Lamentação", "Comemoração", "Elogio", "Reclamação"};
    final String[] iconReacao = {"lamentar.png", "comemorar.png", "elogiar.png", "reclamar.png"};

    public ReacaoDialogController(ReacaoDialog reacaoDialog) {
        this.reacaoDialog = reacaoDialog;
    }

    public void showNotification() {
        int selected = 0;
        botoesReacaoDialog = new JRadioButton[]{
            reacaoDialog.getRadioLamentar(),
            reacaoDialog.getRadioComemorar(),
            reacaoDialog.getRadioElogiar(),
            reacaoDialog.getRadioReclamar()};

        int size = botoesReacaoDialog.length;

        for (selected = 0; selected < size; selected++) {
            if (botoesReacaoDialog[selected].isSelected()) {
                break;
            }
        }

        switch (selected) {
            case 0:
                Sessao.getTecnico().lamentar(reacaoDialog.getTxtReacao().getText());
                break;
            case 1:
                Sessao.getTecnico().comemorar(reacaoDialog.getTxtReacao().getText());
                break;
            case 2:
                Sessao.getTecnico().elogiar(reacaoDialog.getTxtReacao().getText());
                break;
            case 3:
                Sessao.getTecnico().reclamar(reacaoDialog.getTxtReacao().getText());
        }       
    }

    public void btnReagirOnClick() {

        this.showNotification();
        reacaoDialog.dispose();
        reacaoDialog.getInGameWindow().setVisible(true);
    }

}
