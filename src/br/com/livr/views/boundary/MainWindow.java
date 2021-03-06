package br.com.livr.views.boundary;

import br.com.livr.statics.Sessao;
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
        Sessao.getJuiz().explicarRegras();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        cadastroSectionTitle = new javax.swing.JLabel();
        selectedIndicator = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        scrollPaneListaGoleiros = new javax.swing.JScrollPane();
        listGoleiros = new javax.swing.JList<>();
        lblGoleirosList = new javax.swing.JLabel();
        lblQuantidadeGoleiros = new javax.swing.JLabel();
        lblBatedoresDePenaltisList = new javax.swing.JLabel();
        scrollPaneListaBatedoresPenaltis = new javax.swing.JScrollPane();
        listBatedoresPenaltis = new javax.swing.JList<>();
        lblQuantidadeBatedoresDePenaltis = new javax.swing.JLabel();
        txtNome = new de.craften.ui.swingmaterial.MaterialTextField();
        txtEquipe = new de.craften.ui.swingmaterial.MaterialTextField();
        btnJogar = new de.craften.ui.swingmaterial.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penalty Fever");
        setBackground(new java.awt.Color(15, 89, 94));
        setUndecorated(true);

        header.setBackground(new java.awt.Color(35, 182, 132));

        title.setFont(new java.awt.Font("ADAM.CG PRO", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Inscreva seu time");

        separator.setBackground(new java.awt.Color(15, 89, 94));
        separator.setForeground(new java.awt.Color(15, 89, 94));
        separator.setText(".");
        separator.setOpaque(true);

        cadastroSectionTitle.setFont(new java.awt.Font("ADAM.CG PRO", 1, 18)); // NOI18N
        cadastroSectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        cadastroSectionTitle.setText("CADASTRO");

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
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSectionTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(40, 40, 40)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(cadastroSectionTitle)
                .addGap(0, 0, 0)
                .addComponent(selectedIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(4, 61, 93));
        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        scrollPaneListaGoleiros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneListaGoleiros.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listGoleiros.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        listGoleiros.setForeground(new java.awt.Color(35, 182, 132));
        listGoleiros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listGoleiros.setFocusable(false);
        listGoleiros.setMaximumSize(new java.awt.Dimension(50, 57));
        listGoleiros.setMinimumSize(new java.awt.Dimension(50, 57));
        listGoleiros.setPreferredSize(new java.awt.Dimension(50, 57));
        listGoleiros.setSelectionBackground(new java.awt.Color(35, 182, 132));
        listGoleiros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listGoleiros.setVisibleRowCount(1);
        scrollPaneListaGoleiros.setViewportView(listGoleiros);

        lblGoleirosList.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        lblGoleirosList.setForeground(new java.awt.Color(35, 182, 132));
        lblGoleirosList.setText("Goleiros");

        lblQuantidadeGoleiros.setFont(new java.awt.Font("PT Sans", 1, 10)); // NOI18N
        lblQuantidadeGoleiros.setForeground(new java.awt.Color(35, 182, 132));
        lblQuantidadeGoleiros.setText("*Selecione um goleiro");

        lblBatedoresDePenaltisList.setFont(new java.awt.Font("PT Sans", 1, 16)); // NOI18N
        lblBatedoresDePenaltisList.setForeground(new java.awt.Color(35, 182, 132));
        lblBatedoresDePenaltisList.setText("Batedores de Pênaltis");

        scrollPaneListaBatedoresPenaltis.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneListaBatedoresPenaltis.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listBatedoresPenaltis.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        listBatedoresPenaltis.setForeground(new java.awt.Color(35, 182, 132));
        listBatedoresPenaltis.setFocusable(false);
        listBatedoresPenaltis.setMaximumSize(new java.awt.Dimension(50, 57));
        listBatedoresPenaltis.setMinimumSize(new java.awt.Dimension(50, 57));
        listBatedoresPenaltis.setPreferredSize(new java.awt.Dimension(50, 57));
        listBatedoresPenaltis.setSelectionBackground(new java.awt.Color(35, 182, 132));
        listBatedoresPenaltis.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listBatedoresPenaltis.setVisibleRowCount(1);
        scrollPaneListaBatedoresPenaltis.setViewportView(listBatedoresPenaltis);

        lblQuantidadeBatedoresDePenaltis.setFont(new java.awt.Font("PT Sans", 1, 10)); // NOI18N
        lblQuantidadeBatedoresDePenaltis.setForeground(new java.awt.Color(35, 182, 132));
        lblQuantidadeBatedoresDePenaltis.setText("*Selecione quatro batedores de pênaltis");

        txtNome.setForeground(new java.awt.Color(35, 182, 132));
        txtNome.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        txtNome.setHint("Nome");

        txtEquipe.setForeground(new java.awt.Color(35, 182, 132));
        txtEquipe.setFont(new java.awt.Font("PT Sans", 0, 16)); // NOI18N
        txtEquipe.setHint("Time");

        btnJogar.setBackground(new java.awt.Color(35, 182, 132));
        btnJogar.setForeground(new java.awt.Color(255, 255, 255));
        btnJogar.setText("JOGAR");
        btnJogar.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        btnJogar.setType(de.craften.ui.swingmaterial.MaterialButton.Type.FLAT);
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
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
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGoleirosList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneListaGoleiros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidadeGoleiros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBatedoresDePenaltisList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneListaBatedoresPenaltis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidadeBatedoresDePenaltis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(lblBatedoresDePenaltisList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneListaBatedoresPenaltis, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuantidadeBatedoresDePenaltis))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(lblGoleirosList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPaneListaGoleiros, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeGoleiros)
                            .addComponent(txtEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
          mainWindowController.closeButtonOnClick();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        mainWindowController.btnLoginClick();
    }//GEN-LAST:event_btnJogarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnJogar;
    private javax.swing.JLabel cadastroSectionTitle;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lblBatedoresDePenaltisList;
    private javax.swing.JLabel lblGoleirosList;
    private javax.swing.JLabel lblQuantidadeBatedoresDePenaltis;
    private javax.swing.JLabel lblQuantidadeGoleiros;
    private javax.swing.JList<String> listBatedoresPenaltis;
    private javax.swing.JList<String> listGoleiros;
    private javax.swing.JScrollPane scrollPaneListaBatedoresPenaltis;
    private javax.swing.JScrollPane scrollPaneListaGoleiros;
    private javax.swing.JLabel selectedIndicator;
    private javax.swing.JLabel separator;
    private javax.swing.JLabel title;
    private de.craften.ui.swingmaterial.MaterialTextField txtEquipe;
    private de.craften.ui.swingmaterial.MaterialTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxtEquipe() {
        return txtEquipe;
    }

    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }
}
