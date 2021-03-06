package br.com.livr.views.boundary;

import br.com.livr.views.control.ParOuImparDialogController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ParOuImparDialog extends javax.swing.JDialog {

    private List<JRadioButton> rbParEImpar = new ArrayList<>();     
    private final Notificacao notificacao = new Notificacao();
    private final ParOuImparDialogController parOuImparDialogController = new ParOuImparDialogController(this);

    public ParOuImparDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rbParEImpar.add(rbPar);
        rbParEImpar.add(rbImpar);
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupParOuImpar = new javax.swing.ButtonGroup();
        pnlContent = new javax.swing.JPanel();
        lblTituloParOuImpar = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sliderQuantidadeDedos = new javax.swing.JSlider();
        lblDedos = new javax.swing.JLabel();
        rbPar = new javax.swing.JRadioButton();
        rbImpar = new javax.swing.JRadioButton();
        btnJogar = new de.craften.ui.swingmaterial.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(585, 240));
        setUndecorated(true);
        setResizable(false);

        pnlContent.setBackground(new java.awt.Color(15, 89, 94));
        pnlContent.setPreferredSize(new java.awt.Dimension(885, 286));

        lblTituloParOuImpar.setBackground(new java.awt.Color(15, 89, 94));
        lblTituloParOuImpar.setFont(new java.awt.Font("ADAM.CG PRO", 1, 48)); // NOI18N
        lblTituloParOuImpar.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloParOuImpar.setText("Quem começa?");
        lblTituloParOuImpar.setOpaque(true);

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

        separator.setBackground(new java.awt.Color(35, 182, 132));
        separator.setForeground(new java.awt.Color(35, 182, 132));
        separator.setText(".");
        separator.setOpaque(true);

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(lblTituloParOuImpar)
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(closeButton)
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(79, 79, 79)
                .addComponent(lblTituloParOuImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sliderQuantidadeDedos.setBackground(new java.awt.Color(255, 255, 255));
        sliderQuantidadeDedos.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        sliderQuantidadeDedos.setForeground(new java.awt.Color(35, 182, 132));
        sliderQuantidadeDedos.setMajorTickSpacing(1);
        sliderQuantidadeDedos.setMaximum(5);
        sliderQuantidadeDedos.setMinorTickSpacing(1);
        sliderQuantidadeDedos.setPaintLabels(true);
        sliderQuantidadeDedos.setValue(0);

        lblDedos.setBackground(new java.awt.Color(255, 255, 255));
        lblDedos.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        lblDedos.setForeground(new java.awt.Color(35, 182, 132));
        lblDedos.setText("Número");
        lblDedos.setOpaque(true);

        rbPar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupParOuImpar.add(rbPar);
        rbPar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        rbPar.setForeground(new java.awt.Color(35, 182, 132));
        rbPar.setSelected(true);
        rbPar.setText("Par");

        rbImpar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupParOuImpar.add(rbImpar);
        rbImpar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        rbImpar.setForeground(new java.awt.Color(35, 182, 132));
        rbImpar.setText("Ímpar");

        btnJogar.setBackground(new java.awt.Color(15, 89, 94));
        btnJogar.setForeground(new java.awt.Color(255, 255, 255));
        btnJogar.setText("JOGAR");
        btnJogar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        btnJogar.setType(de.craften.ui.swingmaterial.MaterialButton.Type.RAISED);
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDedos)
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderQuantidadeDedos, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(btnJogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbImpar)
                    .addComponent(rbPar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDedos)
                            .addComponent(sliderQuantidadeDedos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rbPar)
                        .addGap(44, 44, 44)
                        .addComponent(rbImpar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        parOuImparDialogController.closeButtonOnClick();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        parOuImparDialogController.btnJogarActionPerformed();
    }//GEN-LAST:event_btnJogarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupParOuImpar;
    private de.craften.ui.swingmaterial.MaterialButton btnJogar;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDedos;
    private javax.swing.JLabel lblTituloParOuImpar;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JRadioButton rbImpar;
    private javax.swing.JRadioButton rbPar;
    private javax.swing.JLabel separator;
    private javax.swing.JSlider sliderQuantidadeDedos;
    // End of variables declaration//GEN-END:variables

    public List<JRadioButton> getRbParEImpar() {
        return rbParEImpar;
    }
    
    public void setRbParEImpar(List<JRadioButton> rbParEImpar) {
        this.rbParEImpar = rbParEImpar;
    }    

    public Notificacao getNotificacao() {
        return notificacao;
    }

    public javax.swing.JSlider getSliderQuantidadeDedos() {
        return sliderQuantidadeDedos;
    }

    public javax.swing.JButton getBtnJogar() {
        return btnJogar;
    }

    public ParOuImparDialogController getParOuImparDialogController() {
        return parOuImparDialogController;
    }
}
