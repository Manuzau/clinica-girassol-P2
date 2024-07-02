/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.PacienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Paciente;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        initializePatients();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenusPanel = new javax.swing.JPanel();
        lbPaciente = new javax.swing.JLabel();
        lbConsulta = new javax.swing.JLabel();
        lbFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbConsulta1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jBtnCadastrarPaciente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jBtnCadastrarFuncionario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnAgendarConsulta = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Girassol");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenusPanel.setBackground(new java.awt.Color(118, 191, 172));
        MenusPanel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MenusPanel.setPreferredSize(new java.awt.Dimension(725, 49));

        lbPaciente.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        lbPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lbPaciente.setText("Paciente");
        lbPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPacienteMouseClicked(evt);
            }
        });

        lbConsulta.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        lbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lbConsulta.setText("Consulta");

        lbFuncionario.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        lbFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lbFuncionario.setText("Funcionários");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doctorIcon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pacienteIcon.png"))); // NOI18N

        lbConsulta1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbConsulta1.setForeground(new java.awt.Color(255, 255, 255));
        lbConsulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agendarIcon.png"))); // NOI18N

        javax.swing.GroupLayout MenusPanelLayout = new javax.swing.GroupLayout(MenusPanel);
        MenusPanel.setLayout(MenusPanelLayout);
        MenusPanelLayout.setHorizontalGroup(
            MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenusPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lbConsulta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPaciente)
                    .addComponent(lbFuncionario)
                    .addComponent(lbConsulta))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        MenusPanelLayout.setVerticalGroup(
            MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenusPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbPaciente)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFuncionario)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(MenusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbConsulta1)
                    .addComponent(lbConsulta))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        getContentPane().add(MenusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 167, 571));

        jTabbedPane1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(236, 243, 241));

        jTextField3.setBackground(new java.awt.Color(80, 97, 117));
        jTextField3.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jTextField3.setText("Pesquisar");

<<<<<<< HEAD
        jTable3.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 10)); // NOI18N
        jTable3.setForeground(new java.awt.Color(80, 97, 117));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
=======
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> f95986703361280c128a4689360aeb19a540af69
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Nº Bilhete", "Telefone ", "Nascido aos", "Genero", "Morada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePaciente.setShowGrid(false);
        jTablePaciente.getTableHeader().setResizingAllowed(false);
        jTablePaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTablePaciente);

<<<<<<< HEAD
        jBtnAgendarConsulta2.setBackground(new java.awt.Color(80, 97, 117));
        jBtnAgendarConsulta2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 10)); // NOI18N
        jBtnAgendarConsulta2.setText("Cadastrar Paciente");
        jBtnAgendarConsulta2.addActionListener(new java.awt.event.ActionListener() {
=======
        jBtnCadastrarPaciente.setText("Cadastrar Paceinte");
        jBtnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarPacienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pacientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> f95986703361280c128a4689360aeb19a540af69
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnAgendarConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
=======
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAgendarConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
        );

        jTabbedPane1.addTab("Pacientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(236, 243, 241));

        jTable2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nº Bilhete", "Telefone", "Morada", "Genero", "Nascido aos", "Cargo", "Função", "Salário", "Contratado aos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setShowGrid(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(9).setResizable(false);
            jTable2.getColumnModel().getColumn(10).setResizable(false);
        }

        jTextField2.setBackground(new java.awt.Color(80, 97, 117));
        jTextField2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jTextField2.setText("Pesquisar");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jBtnAgendarConsulta1.setBackground(new java.awt.Color(80, 97, 117));
        jBtnAgendarConsulta1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 10)); // NOI18N
        jBtnAgendarConsulta1.setText("Cadastrar Funcionario");
        jBtnAgendarConsulta1.addActionListener(new java.awt.event.ActionListener() {
=======
        jBtnCadastrarFuncionario.setText("Cadastrar Funcionario");
        jBtnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Funcionarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
=======
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> f95986703361280c128a4689360aeb19a540af69
                    .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(494, 494, 494)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnAgendarConsulta1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
=======
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAgendarConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
=======
                .addGap(18, 18, 18)
                .addComponent(jBtnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
>>>>>>> 812aa588c771fa2f52f76cee26f81eaad1814d5c
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

        jPanel3.setBackground(new java.awt.Color(236, 243, 241));

        jTable1.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Descrição", "Paciente", "Nº Bilhete", "Telefone ", "Médico", "Especialidade"
            }
        ));
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jBtnAgendarConsulta.setBackground(new java.awt.Color(80, 97, 117));
        jBtnAgendarConsulta.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 10)); // NOI18N
        jBtnAgendarConsulta.setText("Agendar consulta");
        jBtnAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgendarConsultaActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(80, 97, 117));
        jTextField1.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 12)); // NOI18N
        jTextField1.setText("Pesquisar");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Consultas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
=======
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
>>>>>>> f95986703361280c128a4689360aeb19a540af69
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(371, 371, 371)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializePatients() {
        PacienteDAO dao = new PacienteDAO(null);
        List<Paciente> lista = (ArrayList<Paciente>) dao.listDaoObject(); 
        for (int i = 0; i < lista.size(); i++) {
            tablePacientModel().addRow(lista.get(i).listPropieties());
        }
    }

    private DefaultTableModel tablePacientModel() {
        return (DefaultTableModel) jTablePaciente.getModel();
    }

    private void lbPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPacienteMouseClicked

    }//GEN-LAST:event_lbPacienteMouseClicked

    private void jBtnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarFuncionarioActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarFuncionario().setVisible(true);
        });
    }//GEN-LAST:event_jBtnCadastrarFuncionarioActionPerformed

    private void jBtnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarPacienteActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroPaciente().setVisible(true);
        });
    }//GEN-LAST:event_jBtnCadastrarPacienteActionPerformed

    private void jBtnAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgendarConsultaActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroConsulta().setVisible(true);
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAgendarConsultaActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenusPanel;
    private javax.swing.JButton jBtnAgendarConsulta;
    private javax.swing.JButton jBtnCadastrarFuncionario;
    private javax.swing.JButton jBtnCadastrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbConsulta;
    private javax.swing.JLabel lbConsulta1;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbPaciente;
    // End of variables declaration//GEN-END:variables
}
