package br.com.livr.views.boundary;

import javax.swing.JFrame;

public class ErrorDialog extends javax.swing.JDialog {

    public ErrorDialog(JFrame parent, boolean modal, String titulo, String mensagemErro) {
        super(parent, modal);
        initComponents();
        lblTitulo.setText(titulo);
        lblMensagemErro.setText(mensagemErro);
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lblMensagemErro = new javax.swing.JLabel();
        btnCorrigir = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 200));
        setModal(true);
        setUndecorated(true);
        setResizable(false);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        lblMensagemErro.setBackground(new java.awt.Color(255, 255, 255));
        lblMensagemErro.setFont(new java.awt.Font("PT Sans", 0, 24)); // NOI18N
        lblMensagemErro.setForeground(new java.awt.Color(35, 182, 132));
        lblMensagemErro.setOpaque(true);

        btnCorrigir.setBackground(new java.awt.Color(15, 89, 94));
        btnCorrigir.setForeground(new java.awt.Color(255, 255, 255));
        btnCorrigir.setText("CORRIGIR");
        btnCorrigir.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        btnCorrigir.setType(de.craften.ui.swingmaterial.MaterialButton.Type.FLAT);
        btnCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(15, 89, 94));

        lblTitulo.setBackground(new java.awt.Color(15, 89, 94));
        lblTitulo.setFont(new java.awt.Font("PT Sans", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setOpaque(true);

        separator.setBackground(new java.awt.Color(35, 182, 132));
        separator.setForeground(new java.awt.Color(35, 182, 132));
        separator.setText(".");
        separator.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(318, Short.MAX_VALUE))
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(lblMensagemErro)
                .addContainerGap(330, Short.MAX_VALUE))
            .addComponent(btnCorrigir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensagemErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCorrigirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnCorrigir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensagemErro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JLabel separator;
    // End of variables declaration//GEN-END:variables
}
