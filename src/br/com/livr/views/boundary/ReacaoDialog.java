/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.boundary;

import br.com.livr.views.control.ReacaoDialogController;

/**
 *
 * @author victor
 */
public class ReacaoDialog extends javax.swing.JFrame {

    private final ReacaoDialogController reacaoDialogController = new ReacaoDialogController(this);
    private final InGameWindow inGameWindow;

    public ReacaoDialog(InGameWindow inGameWindow) {
       initComponents();
       this.inGameWindow = inGameWindow;
       super.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcoesReacaoButtonGroup = new javax.swing.ButtonGroup();
        panelHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        radioLamentar = new javax.swing.JRadioButton();
        radioComemorar = new javax.swing.JRadioButton();
        radioReclamar = new javax.swing.JRadioButton();
        radioElogiar = new javax.swing.JRadioButton();
        txtReacao = new de.craften.ui.swingmaterial.MaterialTextField();
        lblSuaReacao = new javax.swing.JLabel();
        btnReagir = new de.craften.ui.swingmaterial.MaterialButton();
        separator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelHeader.setBackground(new java.awt.Color(15, 89, 94));

        lblTitle.setFont(new java.awt.Font("ADAM.CG PRO", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("REAJA!");

        closeButton.setBackground(new java.awt.Color(15, 89, 94));
        closeButton.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.setOpaque(true);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        panelContent.setBackground(new java.awt.Color(255, 255, 255));

        radioLamentar.setBackground(new java.awt.Color(255, 255, 255));
        opcoesReacaoButtonGroup.add(radioLamentar);
        radioLamentar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        radioLamentar.setForeground(new java.awt.Color(35, 182, 132));
        radioLamentar.setSelected(true);
        radioLamentar.setText("Lamentar");

        radioComemorar.setBackground(new java.awt.Color(255, 255, 255));
        opcoesReacaoButtonGroup.add(radioComemorar);
        radioComemorar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        radioComemorar.setForeground(new java.awt.Color(35, 182, 132));
        radioComemorar.setText("Comemorar");

        radioReclamar.setBackground(new java.awt.Color(255, 255, 255));
        opcoesReacaoButtonGroup.add(radioReclamar);
        radioReclamar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        radioReclamar.setForeground(new java.awt.Color(35, 182, 132));
        radioReclamar.setText("Reclamar");

        radioElogiar.setBackground(new java.awt.Color(255, 255, 255));
        opcoesReacaoButtonGroup.add(radioElogiar);
        radioElogiar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        radioElogiar.setForeground(new java.awt.Color(35, 182, 132));
        radioElogiar.setText("Elogiar");

        txtReacao.setHint("Sua reação CURTA aqui...");

        lblSuaReacao.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        lblSuaReacao.setForeground(new java.awt.Color(35, 182, 132));
        lblSuaReacao.setText("Sua reação");

        btnReagir.setBackground(new java.awt.Color(15, 89, 94));
        btnReagir.setForeground(new java.awt.Color(255, 255, 255));
        btnReagir.setText("REAGIR");
        btnReagir.setType(de.craften.ui.swingmaterial.MaterialButton.Type.FLAT);
        btnReagir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReagirActionPerformed(evt);
            }
        });

        separator.setBackground(new java.awt.Color(35, 182, 132));
        separator.setForeground(new java.awt.Color(35, 182, 132));
        separator.setText(".");
        separator.setOpaque(true);

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnReagir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContentLayout.createSequentialGroup()
                        .addComponent(radioLamentar)
                        .addGap(18, 27, Short.MAX_VALUE)
                        .addComponent(radioComemorar)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(radioReclamar)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(radioElogiar))
                    .addComponent(lblSuaReacao, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(112, Short.MAX_VALUE))
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLamentar)
                    .addComponent(radioComemorar)
                    .addComponent(radioReclamar)
                    .addComponent(radioElogiar))
                .addGap(18, 18, 18)
                .addComponent(lblSuaReacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReacao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReagir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReagirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReagirActionPerformed
        reacaoDialogController.btnReagirOnClick();
    }//GEN-LAST:event_btnReagirActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    public ReacaoDialogController getReacaoDialogController() {
       return reacaoDialogController;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnReagir;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel lblSuaReacao;
    private javax.swing.JLabel lblTitle;
    private javax.swing.ButtonGroup opcoesReacaoButtonGroup;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JRadioButton radioComemorar;
    private javax.swing.JRadioButton radioElogiar;
    private javax.swing.JRadioButton radioLamentar;
    private javax.swing.JRadioButton radioReclamar;
    private javax.swing.JLabel separator;
    private de.craften.ui.swingmaterial.MaterialTextField txtReacao;
    // End of variables declaration//GEN-END:variables

    public InGameWindow getInGameWindow() {
        return inGameWindow;
    }

    public de.craften.ui.swingmaterial.MaterialTextField getTxtReacao() {
        return txtReacao;
    }

    public javax.swing.JRadioButton getRadioComemorar() {
        return radioComemorar;
    }

    public javax.swing.JRadioButton getRadioElogiar() {
        return radioElogiar;
    }

    public javax.swing.JRadioButton getRadioLamentar() {
        return radioLamentar;
    }

    public javax.swing.JRadioButton getRadioReclamar() {
        return radioReclamar;
    }
}
