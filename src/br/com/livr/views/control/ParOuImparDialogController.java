/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.control;

import br.com.livr.Tecnico;
import static br.com.livr.statics.Sessao.getTecnico;
import br.com.livr.views.boundary.ParOuImparDialog;
import javax.swing.JRadioButton;

/**
 *
 * @author victor
 */
public class ParOuImparDialogController {

    private ParOuImparDialog parOuImparDialog;
    private boolean venceuParOuImpar;
    private boolean jogou;
    private String quemComeca;

    public ParOuImparDialogController(ParOuImparDialog parOuImparDialog) {
        this.parOuImparDialog = parOuImparDialog;
    }

    public void btnJogarActionPerformed() {
        for (JRadioButton rbtn : parOuImparDialog.getRbParEImpar()) {
            if (rbtn.isSelected()) {
                tirarParOuImpar(rbtn);
                break;
            }
        }
        
        parOuImparDialog.getBtnJogar().setEnabled(false);

        parOuImparDialog.getNotificacao().exibirNotificacao("Quem começa!?", getQuemComeca(), "shamrock.png", true, 3);

        parOuImparDialog.dispose();
    }

    public boolean isVenceuParOuImpar() {
        return venceuParOuImpar;
    }

    public boolean isJogou() {
        return jogou;
    }

    public void setVenceuParOuImpar(boolean venceuParOuImpar) {
        this.venceuParOuImpar = venceuParOuImpar;
    }

    public void setJogou(boolean jogou) {
        this.jogou = jogou;
    }

    public String getQuemComeca() {
        return quemComeca;
    }

    public void setQuemComeca(String quemComeca) {
        this.quemComeca = quemComeca;
    }

    private void tirarParOuImpar(JRadioButton radioButtonSelecionado) {
        Tecnico player1 = getTecnico();        
        if (radioButtonSelecionado.getText().equalsIgnoreCase("par")) {
            setVenceuParOuImpar(player1.tirarParOuImpar(parOuImparDialog.getSliderQuantidadeDedos().getValue(), true));
        } else {
            setVenceuParOuImpar(player1.tirarParOuImpar(parOuImparDialog.getSliderQuantidadeDedos().getValue(), false));
        }
        
        if (isVenceuParOuImpar()) {
            setQuemComeca("Você começa o jogo!");
        } else {
            setQuemComeca("A IA começa o jogo!");
        }
        setJogou(true);
    }

}
