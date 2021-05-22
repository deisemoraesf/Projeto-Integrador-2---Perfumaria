package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ClienteDAO;
import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.model.Cliente;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JCliente2 extends javax.swing.JInternalFrame {

    //Variaveis globais
    ConexaoBD conexao = new ConexaoBD();
    ClienteDAO cli = new ClienteDAO(conexao.abrirConexao());

    /**
     * Creates new form JCliente2
     */
    public JCliente2() {
        initComponents();
        carregaTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboPesquisa = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbCliente = new javax.swing.JTable();
        jbtnNovo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jbtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cliente");
        setToolTipText("");
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(670, 500));
        setName("Cliente"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1008, 623));

        ComboPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Código", "Nome", "CPF", " " }));
        ComboPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPesquisaActionPerformed(evt);
            }
        });

        jTbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone"
            }
        ));
        jScrollPane2.setViewportView(jTbCliente);

        jbtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_file_16.png"))); // NOI18N
        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixeira.png"))); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jbtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar.png"))); // NOI18N
        jbtnPesquisar.setText("Pesquisar");
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPesquisar)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jbtnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPesquisaActionPerformed
        
    }//GEN-LAST:event_ComboPesquisaActionPerformed

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        JClienteInserir2 clienteInserir = new JClienteInserir2();
        clienteInserir.mostraTela(this);
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        if (ComboPesquisa.getSelectedItem().toString().equalsIgnoreCase("Código")) {
            try {
                Cliente c = cli.getClienteId(Integer.valueOf(txtPesquisa.getText()));
                if (c.getId() != 0) {                    
                    DefaultTableModel tblClientes = (DefaultTableModel) jTbCliente.getModel();

                    tblClientes.setNumRows(0);

                    tblClientes.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCpf(),
                        c.getTelefone()
                    });
                }else{
                    JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar cliente", ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        } else if (ComboPesquisa.getSelectedItem().toString().equalsIgnoreCase("Cpf")) {
            try {

                Cliente c = cli.getClienteCpf(txtPesquisa.getText());
                if (c.getCpf() != null) {
                    
                    DefaultTableModel tblClientes = (DefaultTableModel) jTbCliente.getModel();

                    tblClientes.setNumRows(0);

                    tblClientes.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCpf(),
                        c.getTelefone()
                    });
                }else{
                    JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar cliente", ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        } else if (ComboPesquisa.getSelectedItem().toString().equalsIgnoreCase("Nome")) {
            try {
                if (cli.getClienteNome(txtPesquisa.getText()).size() > 0) {
                    if(txtPesquisa.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o nome do cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);                         
                    }else{
                        DefaultTableModel tblClientes = (DefaultTableModel) jTbCliente.getModel();
                        tblClientes.setNumRows(0);

                        for (Cliente c : cli.getClienteNome(txtPesquisa.getText())) {
                            tblClientes.addRow(new Object[]{
                                c.getId(),
                                c.getNome(),
                                c.getCpf(),
                                c.getTelefone()
                            });
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar cliente", ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        } else {
            txtPesquisa.setText("Todos");
            carregaTabela();
        }
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        // TODO add your handling code here:
        int index = index = jTbCliente.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(this, "Deseja excluir cliente?", "Excluir Cliente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            System.out.print(escolha);

            if (escolha == 0) {
                Cliente c = new Cliente();

                c = cli.getClientes().get(index);

                cli.deletarCliente(c.getId());

                carregaTabela();
            }
        }

    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        Cliente c = new Cliente();
        int index = index = jTbCliente.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            c = cli.getClientes().get(index);
            JClienteInserir2 clienteInserir = new JClienteInserir2(c);
            clienteInserir.mostraTela(this);
        }

    }//GEN-LAST:event_jbtnEditarActionPerformed

    public void carregaTabela() {

        DefaultTableModel tblClientes = (DefaultTableModel) jTbCliente.getModel();

        tblClientes.setNumRows(0);

        for (Cliente c : cli.getClientes()) {
            tblClientes.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getTelefone()
            });
        }

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbCliente;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int MAXIMIZED_BOTH) {
        setExtendedState(MAXIMIZED_BOTH);
    }

    private void setExtendedState(boolean MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
