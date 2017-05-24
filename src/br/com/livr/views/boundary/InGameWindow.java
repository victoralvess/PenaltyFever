package br.com.livr.views.boundary;

import br.com.livr.statics.Sessao;
import br.com.livr.views.control.InGameWindowController;

public class InGameWindow extends javax.swing.JFrame {

    private final InGameWindowController inGameWindowController = new InGameWindowController(this);

    public InGameWindow() {
        initComponents();
        inGameWindowController.initListaJogadores();
        inGameWindowController.setarNomeEquipe(lblNomeEquipePlayer, Sessao.getEquipePlayer().getNomeEquipe());
        inGameWindowController.setarNomeEquipe(lblNomeEquipeIA, Sessao.getEquipeAdversaria().getNomeEquipe());
        btnPlayAgain.setVisible(false);
        super.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        lblRelatorioTitle = new javax.swing.JLabel();
        lblBatedoresDePenaltisList = new javax.swing.JLabel();
        scrollPaneBatedores = new javax.swing.JScrollPane();
        listJogadoresTimePlayer = new javax.swing.JList<>();
        btnSuaVez = new de.craften.ui.swingmaterial.MaterialButton();
        scrollPaneRelatorio = new javax.swing.JScrollPane();
        listRelatorio = new javax.swing.JList<>();
        btnPlayAgain = new de.craften.ui.swingmaterial.MaterialButton();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        jogarSectionTitle = new javax.swing.JLabel();
        selectedIndicator = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        btnTirarParOuImpar = new javax.swing.JLabel();
        btnReagir = new javax.swing.JLabel();
        lblPlacarTimePlayer = new javax.swing.JLabel();
        lblPlacarTimeIA = new javax.swing.JLabel();
        lblNomeEquipeIA = new javax.swing.JLabel();
        lblNomeEquipePlayer = new javax.swing.JLabel();
        separadorPlacar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penalty Fever");
        setUndecorated(true);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(4, 61, 93));
        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblRelatorioTitle.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        lblRelatorioTitle.setForeground(new java.awt.Color(35, 182, 132));
        lblRelatorioTitle.setText("O que aconteceu !?");

        lblBatedoresDePenaltisList.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        lblBatedoresDePenaltisList.setForeground(new java.awt.Color(35, 182, 132));
        lblBatedoresDePenaltisList.setText("Batedores de Pênaltis");

        scrollPaneBatedores.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneBatedores.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listJogadoresTimePlayer.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        listJogadoresTimePlayer.setForeground(new java.awt.Color(35, 182, 132));
        listJogadoresTimePlayer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listJogadoresTimePlayer.setFocusable(false);
        listJogadoresTimePlayer.setMaximumSize(new java.awt.Dimension(50, 57));
        listJogadoresTimePlayer.setMinimumSize(new java.awt.Dimension(50, 57));
        listJogadoresTimePlayer.setPreferredSize(new java.awt.Dimension(50, 57));
        listJogadoresTimePlayer.setSelectionBackground(new java.awt.Color(35, 182, 132));
        listJogadoresTimePlayer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listJogadoresTimePlayer.setVisibleRowCount(1);
        scrollPaneBatedores.setViewportView(listJogadoresTimePlayer);

        btnSuaVez.setBackground(new java.awt.Color(35, 182, 132));
        btnSuaVez.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaVez.setText("SUA VEZ!");
        btnSuaVez.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        btnSuaVez.setType(de.craften.ui.swingmaterial.MaterialButton.Type.FLAT);
        btnSuaVez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaVezActionPerformed(evt);
            }
        });

        listRelatorio.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        listRelatorio.setForeground(new java.awt.Color(35, 182, 132));
        listRelatorio.setFocusable(false);
        listRelatorio.setSelectionBackground(new java.awt.Color(35, 182, 132));
        listRelatorio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneRelatorio.setViewportView(listRelatorio);

        btnPlayAgain.setBackground(new java.awt.Color(35, 182, 132));
        btnPlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayAgain.setText("JOGAR NOVAMENTE");
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollPaneBatedores, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblBatedoresDePenaltisList, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnSuaVez, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(lblRelatorioTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(scrollPaneRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlayAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRelatorioTitle)
                    .addComponent(lblBatedoresDePenaltisList))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(scrollPaneBatedores, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaVez, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(35, 182, 132));

        title.setFont(new java.awt.Font("ADAM.CG PRO", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("JOGUE!");

        separator.setBackground(new java.awt.Color(15, 89, 94));
        separator.setForeground(new java.awt.Color(15, 89, 94));
        separator.setText(".");
        separator.setOpaque(true);

        jogarSectionTitle.setFont(new java.awt.Font("ADAM.CG PRO", 1, 18)); // NOI18N
        jogarSectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        jogarSectionTitle.setText("JOGAR");
        jogarSectionTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogarSectionTitleMouseClicked(evt);
            }
        });

        selectedIndicator.setBackground(new java.awt.Color(15, 89, 94));
        selectedIndicator.setForeground(new java.awt.Color(15, 89, 94));
        selectedIndicator.setText(".");
        selectedIndicator.setOpaque(true);

        closeButton.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        btnTirarParOuImpar.setBackground(new java.awt.Color(35, 182, 132));
        btnTirarParOuImpar.setFont(new java.awt.Font("ADAM.CG PRO", 1, 18)); // NOI18N
        btnTirarParOuImpar.setForeground(new java.awt.Color(255, 255, 255));
        btnTirarParOuImpar.setText("TIRAR PAR OU IMPAR");
        btnTirarParOuImpar.setOpaque(true);
        btnTirarParOuImpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTirarParOuImparMouseClicked(evt);
            }
        });

        btnReagir.setFont(new java.awt.Font("ADAM.CG PRO", 1, 18)); // NOI18N
        btnReagir.setForeground(new java.awt.Color(255, 255, 255));
        btnReagir.setText("REAGIR");
        btnReagir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReagirMouseClicked(evt);
            }
        });

        lblPlacarTimePlayer.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        lblPlacarTimePlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacarTimePlayer.setText("00");

        lblPlacarTimeIA.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        lblPlacarTimeIA.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacarTimeIA.setText("00");

        lblNomeEquipeIA.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        lblNomeEquipeIA.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEquipeIA.setText("1234567890");

        lblNomeEquipePlayer.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        lblNomeEquipePlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEquipePlayer.setText("1234567890");

        separadorPlacar.setFont(new java.awt.Font("ADAM.CG PRO", 1, 24)); // NOI18N
        separadorPlacar.setForeground(new java.awt.Color(255, 255, 255));
        separadorPlacar.setText("X");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jogarSectionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnTirarParOuImpar)
                .addGap(18, 18, 18)
                .addComponent(btnReagir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(468, 468, 468))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeEquipePlayer)
                .addGap(18, 18, 18)
                .addComponent(lblPlacarTimePlayer)
                .addGap(18, 18, 18)
                .addComponent(separadorPlacar)
                .addGap(18, 18, 18)
                .addComponent(lblPlacarTimeIA)
                .addGap(18, 18, 18)
                .addComponent(lblNomeEquipeIA)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(40, 40, 40)
                .addComponent(title)
                .addGap(48, 48, 48)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEquipeIA)
                    .addComponent(lblNomeEquipePlayer)
                    .addComponent(lblPlacarTimePlayer)
                    .addComponent(separadorPlacar)
                    .addComponent(lblPlacarTimeIA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogarSectionTitle)
                    .addComponent(btnTirarParOuImpar)
                    .addComponent(btnReagir))
                .addGap(0, 0, 0)
                .addComponent(selectedIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaVezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaVezActionPerformed
        inGameWindowController.btnSuaVezOnClick();
    }//GEN-LAST:event_btnSuaVezActionPerformed

    private void jogarSectionTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogarSectionTitleMouseClicked
        selectedIndicator.setBounds(jogarSectionTitle.getX(), selectedIndicator.getY(), jogarSectionTitle.getWidth(), selectedIndicator.getHeight());
    }//GEN-LAST:event_jogarSectionTitleMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        inGameWindowController.closeButtonOnClick();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void btnTirarParOuImparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTirarParOuImparMouseClicked
        if(!btnTirarParOuImpar.isEnabled()) return;
        selectedIndicator.setBounds(btnTirarParOuImpar.getX(), selectedIndicator.getY(), btnTirarParOuImpar.getWidth(), selectedIndicator.getHeight());
        inGameWindowController.btnTirarParOuImparOnClick();
    }//GEN-LAST:event_btnTirarParOuImparMouseClicked

    private void btnReagirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReagirMouseClicked
        selectedIndicator.setBounds(btnReagir.getX(), selectedIndicator.getY(), btnReagir.getWidth(), selectedIndicator.getHeight());
        inGameWindowController.btnReagirMouseClicked();
    }//GEN-LAST:event_btnReagirMouseClicked

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnPlayAgain;
    private javax.swing.JLabel btnReagir;
    private de.craften.ui.swingmaterial.MaterialButton btnSuaVez;
    private javax.swing.JLabel btnTirarParOuImpar;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jogarSectionTitle;
    private javax.swing.JLabel lblBatedoresDePenaltisList;
    private javax.swing.JLabel lblNomeEquipeIA;
    private javax.swing.JLabel lblNomeEquipePlayer;
    private javax.swing.JLabel lblPlacarTimeIA;
    private javax.swing.JLabel lblPlacarTimePlayer;
    private javax.swing.JLabel lblRelatorioTitle;
    private javax.swing.JList<String> listJogadoresTimePlayer;
    private javax.swing.JList<String> listRelatorio;
    private javax.swing.JScrollPane scrollPaneBatedores;
    private javax.swing.JScrollPane scrollPaneRelatorio;
    private javax.swing.JLabel selectedIndicator;
    private javax.swing.JLabel separadorPlacar;
    private javax.swing.JLabel separator;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getBtnReagir() {
        return btnReagir;
    }

    public javax.swing.JButton getBtnSuaVez() {
        return btnSuaVez;
    }

    public javax.swing.JLabel getBtnTirarParOuImpar() {
        return btnTirarParOuImpar;
    }

    public javax.swing.JScrollPane getScrollPaneRelatorio() {
        return scrollPaneRelatorio;
    }

    public javax.swing.JList<String> getListJogadoresTimePlayer() {
        return listJogadoresTimePlayer;
    }

    public javax.swing.JList<String> getListRelatorio() {
        return listRelatorio;
    }

    public javax.swing.JLabel getLblPlacarTimeIA() {
        return lblPlacarTimeIA;
    }

    public javax.swing.JLabel getLblPlacarTimePlayer() {
        return lblPlacarTimePlayer;
    }

    public de.craften.ui.swingmaterial.MaterialButton getBtnPlayAgain() {
        return btnPlayAgain;
    }
}
