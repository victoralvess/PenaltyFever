package br.com.livr.views.boundary;

import br.com.livr.views.control.InGameWindowController;

public class InGameWindow extends javax.swing.JFrame {

    public javax.swing.JButton getBtnSuaVez() {
        return btnSuaVez;
    }

    private final InGameWindowController inGameWindowController = new InGameWindowController(this);

    public InGameWindow() {
        initComponents();
        inGameWindowController.initListaJogadores();
        super.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContainer = new javax.swing.JPanel();
        lblEscolherBatedor = new javax.swing.JLabel();
        scrollPaneBatedores = new javax.swing.JScrollPane();
        listJogadoresTimePlayer = new javax.swing.JList<>();
        btnSuaVez = new javax.swing.JButton();
        btnReagir = new javax.swing.JButton();
        btnTirarParOuImpar = new javax.swing.JButton();
        lblAcoes = new javax.swing.JLabel();
        lblTituloPainelAcoes = new javax.swing.JLabel();
        lblTituloRelatorio = new javax.swing.JLabel();
        lblTituloPlacar = new javax.swing.JLabel();
        scrollPaneRelatorio = new javax.swing.JScrollPane();
        listRelatorio = new javax.swing.JList<>();
        lblPlacarTimePlayer = new javax.swing.JLabel();
        lblPlacarTimeIA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Playing...");
        setMinimumSize(new java.awt.Dimension(734, 523));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setLayout(new java.awt.GridBagLayout());

        lblEscolherBatedor.setBackground(new java.awt.Color(255, 255, 255));
        lblEscolherBatedor.setForeground(new java.awt.Color(255, 102, 102));
        lblEscolherBatedor.setText("Escolher Batedor da Vez");
        lblEscolherBatedor.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 0, 0, 0);
        pnlContainer.add(lblEscolherBatedor, gridBagConstraints);

        scrollPaneBatedores.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneBatedores.setBorder(null);

        listJogadoresTimePlayer.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        listJogadoresTimePlayer.setForeground(new java.awt.Color(255, 102, 102));
        listJogadoresTimePlayer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listJogadoresTimePlayer.setFocusable(false);
        listJogadoresTimePlayer.setSelectionBackground(new java.awt.Color(255, 51, 102));
        listJogadoresTimePlayer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneBatedores.setViewportView(listJogadoresTimePlayer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 183;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        pnlContainer.add(scrollPaneBatedores, gridBagConstraints);

        btnSuaVez.setBackground(new java.awt.Color(255, 102, 102));
        btnSuaVez.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSuaVez.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaVez.setText("SUA VEZ!");
        btnSuaVez.setBorderPainted(false);
        btnSuaVez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSuaVez.setFocusPainted(false);
        btnSuaVez.setFocusable(false);
        btnSuaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaVezActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        pnlContainer.add(btnSuaVez, gridBagConstraints);

        btnReagir.setBackground(new java.awt.Color(255, 102, 102));
        btnReagir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnReagir.setForeground(new java.awt.Color(255, 255, 255));
        btnReagir.setText("REAGIR");
        btnReagir.setBorderPainted(false);
        btnReagir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReagir.setFocusPainted(false);
        btnReagir.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        pnlContainer.add(btnReagir, gridBagConstraints);

        btnTirarParOuImpar.setBackground(new java.awt.Color(255, 102, 102));
        btnTirarParOuImpar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnTirarParOuImpar.setForeground(new java.awt.Color(255, 255, 255));
        btnTirarParOuImpar.setText("TIRAR PAR OU IMPAR");
        btnTirarParOuImpar.setBorderPainted(false);
        btnTirarParOuImpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTirarParOuImpar.setFocusPainted(false);
        btnTirarParOuImpar.setFocusable(false);
        btnTirarParOuImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarParOuImparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        pnlContainer.add(btnTirarParOuImpar, gridBagConstraints);

        lblAcoes.setBackground(new java.awt.Color(255, 255, 255));
        lblAcoes.setForeground(new java.awt.Color(255, 102, 102));
        lblAcoes.setText("Ações");
        lblAcoes.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 25, 0, 0);
        pnlContainer.add(lblAcoes, gridBagConstraints);

        lblTituloPainelAcoes.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloPainelAcoes.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTituloPainelAcoes.setForeground(new java.awt.Color(255, 102, 102));
        lblTituloPainelAcoes.setText("Painel de Ações do Treinador");
        lblTituloPainelAcoes.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        pnlContainer.add(lblTituloPainelAcoes, gridBagConstraints);

        lblTituloRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloRelatorio.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTituloRelatorio.setForeground(new java.awt.Color(255, 102, 102));
        lblTituloRelatorio.setText("Relatório");
        lblTituloRelatorio.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 25, 0, 0);
        pnlContainer.add(lblTituloRelatorio, gridBagConstraints);

        lblTituloPlacar.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloPlacar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTituloPlacar.setForeground(new java.awt.Color(255, 102, 102));
        lblTituloPlacar.setText("PLACAR");
        lblTituloPlacar.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 56, 0, 0);
        pnlContainer.add(lblTituloPlacar, gridBagConstraints);

        scrollPaneRelatorio.setBorder(null);

        listRelatorio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        listRelatorio.setForeground(new java.awt.Color(255, 102, 102));
        listRelatorio.setFocusable(false);
        listRelatorio.setSelectionBackground(new java.awt.Color(255, 51, 102));
        listRelatorio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneRelatorio.setViewportView(listRelatorio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 404;
        gridBagConstraints.ipady = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        pnlContainer.add(scrollPaneRelatorio, gridBagConstraints);

        lblPlacarTimePlayer.setBackground(new java.awt.Color(255, 255, 255));
        lblPlacarTimePlayer.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPlacarTimePlayer.setForeground(new java.awt.Color(255, 102, 102));
        lblPlacarTimePlayer.setText("0");
        lblPlacarTimePlayer.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        pnlContainer.add(lblPlacarTimePlayer, gridBagConstraints);

        lblPlacarTimeIA.setBackground(new java.awt.Color(255, 255, 255));
        lblPlacarTimeIA.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPlacarTimeIA.setForeground(new java.awt.Color(255, 102, 102));
        lblPlacarTimeIA.setText("0");
        lblPlacarTimeIA.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(18, 56, 0, 0);
        pnlContainer.add(lblPlacarTimeIA, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(pnlContainer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaVezActionPerformed
        inGameWindowController.btnSuaVezActionPerformed();
    }//GEN-LAST:event_btnSuaVezActionPerformed

    private void btnTirarParOuImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarParOuImparActionPerformed
        inGameWindowController.btnTirarParOuImparActionPerformed();        
    }//GEN-LAST:event_btnTirarParOuImparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReagir;
    private javax.swing.JButton btnSuaVez;
    private javax.swing.JButton btnTirarParOuImpar;
    private javax.swing.JLabel lblAcoes;
    private javax.swing.JLabel lblEscolherBatedor;
    private static javax.swing.JLabel lblPlacarTimeIA;
    private static javax.swing.JLabel lblPlacarTimePlayer;
    private javax.swing.JLabel lblTituloPainelAcoes;
    private javax.swing.JLabel lblTituloPlacar;
    private javax.swing.JLabel lblTituloRelatorio;
    private javax.swing.JList<String> listJogadoresTimePlayer;
    private javax.swing.JList<String> listRelatorio;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JScrollPane scrollPaneBatedores;
    private javax.swing.JScrollPane scrollPaneRelatorio;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JScrollPane getScrollPaneRelatorio() {
        return scrollPaneRelatorio;
    }

    public void setScrollPaneRelatorio(javax.swing.JScrollPane scrollPaneRelatorio) {
        this.scrollPaneRelatorio = scrollPaneRelatorio;
    }

    public javax.swing.JList<String> getListJogadoresTimePlayer() {
        return listJogadoresTimePlayer;
    }

    public javax.swing.JList<String> getListRelatorio() {
        return listRelatorio;
    }

    public static javax.swing.JLabel getLblPlacarTimeIA() {
        return lblPlacarTimeIA;
    }

    public static javax.swing.JLabel getLblPlacarTimePlayer() {
        return lblPlacarTimePlayer;
    }

    public javax.swing.JButton getBtnTirarParOuImpar() {
        return btnTirarParOuImpar;
    }

}
