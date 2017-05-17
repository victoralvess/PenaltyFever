/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.control;

import br.com.livr.views.boundary.Notificacao;
import br.com.livr.views.boundary.ReacaoDialog;
import com.notification.NotificationFactory;
import javax.swing.JRadioButton;

/**
 *
 * @author victor
 */
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
        
        new Notificacao().exibirNotificacao(tipoReacao[selected], reacaoDialog.getTxtReacao().getText(), iconReacao[selected], true, 3, NotificationFactory.Location.NORTHWEST);
    }

    public void btnReagirOnClick() {

        this.showNotification();
        reacaoDialog.dispose();
        reacaoDialog.getInGameWindow().setVisible(true);
    }

}
