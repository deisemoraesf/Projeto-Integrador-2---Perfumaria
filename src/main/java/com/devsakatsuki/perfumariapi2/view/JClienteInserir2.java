package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ClienteDAO;
import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.model.Cliente;
import java.awt.Component;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JClienteInserir2 extends javax.swing.JFrame {

    /**
     * Creates new form JClienteInserir2
     */
    public JClienteInserir2() {
        initComponents();
        setLocationRelativeTo(null);
        checkVenda.setVisible(false);

        //Para campo Id ficar oculto quando for inserir cliente
        if (txtId.getText().equals("")) {
            lblId.setVisible(false);
            txtId.setVisible(false);
        }

    }

    //Construtor para receber edica
    public JClienteInserir2(Cliente c) {
        initComponents();
        setLocationRelativeTo(null);
        checkVenda.setVisible(false);

        txtId.setText(String.valueOf(c.getId()));
        txtNome.setText(c.getNome());
        ftxtCPF.setText(c.getCpf());
        txtEndereco.setText(c.getEndereco());
        ftxtTelefone.setText(c.getTelefone());
        txtEmail.setText(c.getEmail());
        if (c.getSexo() != null) {
            if (c.getSexo().equals("Feminino")) {
                rbtnFeminino.setSelected(true);
            } else {
                rbtnMasculino.setSelected(true);
            }
        }
        cmbEstadoCivil.setSelectedItem(c.getEstadoCivil());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ftxtDataNascimento.setText(dateFormat.format(c.getDataNascimento()));

    }

    public JClienteInserir2(String venda) {
        initComponents();
        setLocationRelativeTo(null);
        checkVenda.setVisible(false);
        checkVenda.setSelected(true);
        //Para campo Id ficar oculto quando for inserir cliente
        if (txtId.getText().equals("")) {
            lblId.setVisible(false);
            txtId.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        lblCPF = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        ftxtCPF = new javax.swing.JFormattedTextField();
        ftxtDataNascimento = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        checkVenda = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");

        lblCPF.setText("CPF:");

        lblEndereco.setText("Endere??o:");

        btnGroupSexo.add(rbtnMasculino);
        rbtnMasculino.setSelected(true);
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoActionPerformed(evt);
            }
        });

        btnGroupSexo.add(rbtnFeminino);
        rbtnFeminino.setText("Feminino");
        rbtnFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemininoActionPerformed(evt);
            }
        });

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Vi??vo(a)" }));
        cmbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivilActionPerformed(evt);
            }
        });

        try {
            ftxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataNascimentoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalizar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone:");

        lblEmail.setText("E-mail:");

        lblSexo.setText("Sexo:");

        lblEstadoCivil.setText("Estado civil:");

        lblDataNascimento.setText("Data de nascimento:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblId.setText("Id:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        try {
            ftxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTelefoneActionPerformed(evt);
            }
        });

        checkVenda.setText("jCheckBox1");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoCivil)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataNascimento)
                            .addComponent(lblSexo)
                            .addComponent(lblNome)
                            .addComponent(lblCPF)
                            .addComponent(lblEndereco)
                            .addComponent(lblTelefone)
                            .addComponent(lblId)
                            .addComponent(lblEmail))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnFeminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnMasculino))
                                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkVenda))
                                            .addComponent(txtEndereco)
                                            .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkVenda))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rbtnFeminino)
                    .addComponent(rbtnMasculino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(ftxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoCivilActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome ?? obrigat??rio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (ftxtCPF.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "O campo CPF ?? obrigat??rio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Endere??o ?? obrigat??rio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (ftxtDataNascimento.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "O campo Data de Nascimento ?? obrigat??rio", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            ConexaoBD conexao = new ConexaoBD();
            ClienteDAO cli = new ClienteDAO(conexao.abrirConexao());

            if (!txtId.getText().isEmpty()) {
                int Id = Integer.valueOf(txtId.getText());
                String nome = txtNome.getText();
                String cpf = ftxtCPF.getText().replace(".", "").replace("-", "");
                String endereco = txtEndereco.getText();
                String telefone = ftxtTelefone.getText().replace("-", "");
                String email = txtEmail.getText();
                rbtnFeminino.setActionCommand("Feminino");
                rbtnMasculino.setActionCommand("Masculino");
                String sexo = btnGroupSexo.getSelection().getActionCommand();
                String estadoCivil = cmbEstadoCivil.getSelectedItem().toString();
                String[] data = ftxtDataNascimento.getText().split("/");
                Calendar calendar = Calendar.getInstance();
                calendar.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]));
                Date dataNasc = calendar.getTime();
                System.out.print(dataNasc);

                Cliente cliente = new Cliente(Id, nome, cpf, endereco, telefone, email, sexo, estadoCivil, dataNasc);

                cli.AtualizaCliente(cliente);

                conexao.fecharConexao();

                JOptionPane.showMessageDialog(this, "Cliente Salvo com Sucesso!");

                //Fecha tela de editar/Salvar
                Component comp = SwingUtilities.getRoot(this);
                ((Window) comp).dispose();

                executeMostraTela();

            } else {

                String nome = txtNome.getText();
                String cpf = ftxtCPF.getText().replace(".", "").replace("-", "");
                String endereco = txtEndereco.getText();
                String telefone = ftxtTelefone.getText().replace("-", "");
                String email = txtEmail.getText();
                rbtnFeminino.setActionCommand("Feminino");
                rbtnMasculino.setActionCommand("Masculino");
                String sexo = btnGroupSexo.getSelection().getActionCommand();
                String estadoCivil = cmbEstadoCivil.getSelectedItem().toString();
                String[] data = ftxtDataNascimento.getText().split("/");
                Calendar calendar = Calendar.getInstance();
                calendar.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]));
                Date dataNasc = calendar.getTime();
                System.out.print(dataNasc);

                Cliente pesquisaCliente = cli.getClienteCpf(cpf);
                if (pesquisaCliente.getId() != 0) {
                    JOptionPane.showMessageDialog(this, "Existe um cliente cadastrado com esse CPF.");

                    Component comp = SwingUtilities.getRoot(this);
                    ((Window) comp).dispose();

                    if (!checkVenda.isSelected()) {
                        executeMostraTela();
                    }
                } else {

                    Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email, sexo, estadoCivil, dataNasc);

                    cli.inserirCliente(cliente);

                    conexao.fecharConexao();

                    JOptionPane.showMessageDialog(this, "Cliente Salvo com Sucesso!");

                    Component comp = SwingUtilities.getRoot(this);
                    ((Window) comp).dispose();

                    if (!checkVenda.isSelected()) {
                        executeMostraTela();
                    }
                }

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar cliente", ex.getMessage(), JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void ftxtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtDataNascimentoActionPerformed

    private void rbtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void rbtnFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemininoActionPerformed

    private void ftxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JClienteInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JClienteInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JClienteInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JClienteInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JClienteInserir2().setVisible(true);
            }
        });
    }

    //Metodos para refresh da tela ao salvar ou editar
    private JCliente2 clientePrincipal;

    public void mostraTela(JCliente2 jc) {
        this.clientePrincipal = jc;
        setVisible(true);
        
    }

    public void executeMostraTela() {
        clientePrincipal.carregaTabela();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkVenda;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtDataNascimento;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
