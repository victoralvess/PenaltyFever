package br.com.livr.views.boundary;

import static br.com.livr.statics.Sessao.getGoleirosPorTime;
import static br.com.livr.statics.Sessao.getJogadoresPorTime;
import br.com.livr.views.control.MainWindowController;
import br.com.livr.views.control.MainWindowListController;

public class MainWindow extends javax.swing.JFrame {

    private final MainWindowController mainWindowController = new MainWindowController(this);

    public MainWindow() {
        initComponents();
        MainWindowListController.initListasJogadores();
        listBatedoresPenaltis.setListData(MainWindowListController.getNomesBatedoresPenaltis());
        listBatedoresPenaltis.addListSelectionListener(new MainWindowListController(getJogadoresPorTime()));
        listGoleiros.setListData(MainWindowListController.getNomesGoleiros());
        listGoleiros.addListSelectionListener(new MainWindowListController(getGoleirosPorTime()));
        super.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContent = new javax.swing.JPanel();
        linhaTextFieldNomeEquipe = new javax.swing.JSeparator();
        lblNomeTreinador = new javax.swing.JLabel();
        txfNomeTreinador = new javax.swing.JTextField();
        linhaTextFieldNomeTreinador = new javax.swing.JSeparator();
        lblNomeEquipe = new javax.swing.JLabel();
        txfNomeEquipe = new javax.swing.JTextField();
        lblTituloSecao1 = new javax.swing.JLabel();
        lblTituloSecao2 = new javax.swing.JLabel();
        scrollPaneListaGoleiros = new javax.swing.JScrollPane();
        listGoleiros = new javax.swing.JList<>();
        lblAvisoQuantidadeBatedoresPenaltis = new javax.swing.JLabel();
        scrollPaneListaBatedoresPenaltis = new javax.swing.JScrollPane();
        listBatedoresPenaltis = new javax.swing.JList<>();
        lblAvisoQuantidadeGoleiros = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");
        setBackground(new java.awt.Color(63, 81, 181));
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setForeground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new java.awt.GridBagLayout());

        linhaTextFieldNomeEquipe.setBackground(new java.awt.Color(255, 64, 129));
        linhaTextFieldNomeEquipe.setForeground(new java.awt.Color(255, 102, 102));
        linhaTextFieldNomeEquipe.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 64, 129)));
        linhaTextFieldNomeEquipe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        linhaTextFieldNomeEquipe.setPreferredSize(new java.awt.Dimension(0, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        pnlContent.add(linhaTextFieldNomeEquipe, gridBagConstraints);

        lblNomeTreinador.setBackground(java.awt.Color.white);
        lblNomeTreinador.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeTreinador.setForeground(new java.awt.Color(255, 102, 102));
        lblNomeTreinador.setText("Nome do Treinador");
        lblNomeTreinador.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        pnlContent.add(lblNomeTreinador, gridBagConstraints);

        txfNomeTreinador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txfNomeTreinador.setForeground(new java.awt.Color(255, 102, 102));
        txfNomeTreinador.setBorder(null);
        txfNomeTreinador.setCaretColor(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 15);
        pnlContent.add(txfNomeTreinador, gridBagConstraints);

        linhaTextFieldNomeTreinador.setBackground(new java.awt.Color(255, 64, 129));
        linhaTextFieldNomeTreinador.setForeground(new java.awt.Color(255, 102, 102));
        linhaTextFieldNomeTreinador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 64, 129)));
        linhaTextFieldNomeTreinador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        linhaTextFieldNomeTreinador.setPreferredSize(new java.awt.Dimension(0, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        pnlContent.add(linhaTextFieldNomeTreinador, gridBagConstraints);

        lblNomeEquipe.setBackground(java.awt.Color.white);
        lblNomeEquipe.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeEquipe.setForeground(new java.awt.Color(255, 102, 102));
        lblNomeEquipe.setText("Nome da Equipe");
        lblNomeEquipe.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        pnlContent.add(lblNomeEquipe, gridBagConstraints);

        txfNomeEquipe.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txfNomeEquipe.setForeground(new java.awt.Color(255, 102, 102));
        txfNomeEquipe.setBorder(null);
        txfNomeEquipe.setCaretColor(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 15);
        pnlContent.add(txfNomeEquipe, gridBagConstraints);

        lblTituloSecao1.setBackground(java.awt.Color.white);
        lblTituloSecao1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblTituloSecao1.setForeground(new java.awt.Color(255, 102, 102));
        lblTituloSecao1.setText("Cadastro");
        lblTituloSecao1.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnlContent.add(lblTituloSecao1, gridBagConstraints);

        lblTituloSecao2.setBackground(java.awt.Color.white);
        lblTituloSecao2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTituloSecao2.setForeground(new java.awt.Color(255, 102, 102));
        lblTituloSecao2.setText("Escalação");
        lblTituloSecao2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        pnlContent.add(lblTituloSecao2, gridBagConstraints);

        scrollPaneListaGoleiros.setBackground(java.awt.Color.white);
        scrollPaneListaGoleiros.setBorder(null);

        listGoleiros.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        listGoleiros.setForeground(new java.awt.Color(255, 102, 102));
        listGoleiros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listGoleiros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listGoleiros.setFocusable(false);
        listGoleiros.setSelectionBackground(new java.awt.Color(255, 51, 102));
        listGoleiros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneListaGoleiros.setViewportView(listGoleiros);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        pnlContent.add(scrollPaneListaGoleiros, gridBagConstraints);

        lblAvisoQuantidadeBatedoresPenaltis.setBackground(java.awt.Color.white);
        lblAvisoQuantidadeBatedoresPenaltis.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        lblAvisoQuantidadeBatedoresPenaltis.setForeground(new java.awt.Color(0, 0, 0));
        lblAvisoQuantidadeBatedoresPenaltis.setText("* Selecione 4 Batedores de Pênaltis");
        lblAvisoQuantidadeBatedoresPenaltis.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        pnlContent.add(lblAvisoQuantidadeBatedoresPenaltis, gridBagConstraints);

        scrollPaneListaBatedoresPenaltis.setBackground(java.awt.Color.white);
        scrollPaneListaBatedoresPenaltis.setBorder(null);

        listBatedoresPenaltis.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        listBatedoresPenaltis.setForeground(new java.awt.Color(255, 102, 102));
        listBatedoresPenaltis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBatedoresPenaltis.setFocusable(false);
        listBatedoresPenaltis.setSelectionBackground(new java.awt.Color(255, 51, 102));
        listBatedoresPenaltis.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneListaBatedoresPenaltis.setViewportView(listBatedoresPenaltis);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        pnlContent.add(scrollPaneListaBatedoresPenaltis, gridBagConstraints);

        lblAvisoQuantidadeGoleiros.setBackground(java.awt.Color.white);
        lblAvisoQuantidadeGoleiros.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        lblAvisoQuantidadeGoleiros.setForeground(new java.awt.Color(0, 0, 0));
        lblAvisoQuantidadeGoleiros.setText("* Selecione 1 Goleiro");
        lblAvisoQuantidadeGoleiros.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        pnlContent.add(lblAvisoQuantidadeGoleiros, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(255, 102, 102));
        btnLogin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pnlContent.add(btnLogin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.3;
        getContentPane().add(pnlContent, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        mainWindowController.btnLoginClick();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblAvisoQuantidadeBatedoresPenaltis;
    private javax.swing.JLabel lblAvisoQuantidadeGoleiros;
    private javax.swing.JLabel lblNomeEquipe;
    private javax.swing.JLabel lblNomeTreinador;
    private javax.swing.JLabel lblTituloSecao1;
    private javax.swing.JLabel lblTituloSecao2;
    private javax.swing.JSeparator linhaTextFieldNomeEquipe;
    private javax.swing.JSeparator linhaTextFieldNomeTreinador;
    private javax.swing.JList<String> listBatedoresPenaltis;
    private javax.swing.JList<String> listGoleiros;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JScrollPane scrollPaneListaBatedoresPenaltis;
    private javax.swing.JScrollPane scrollPaneListaGoleiros;
    private javax.swing.JTextField txfNomeEquipe;
    private javax.swing.JTextField txfNomeTreinador;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxfNomeEquipe() {
        return txfNomeEquipe;
    }

    public javax.swing.JTextField getTxfNomeTreinador() {
        return txfNomeTreinador;
    }

}
