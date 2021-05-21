
package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.dao.ProdutoDAO;
import com.devsakatsuki.perfumariapi2.model.Produto;
import java.awt.Component;
import java.awt.Window;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JProdutoInserir2 extends javax.swing.JFrame {
    
    Locale br = new Locale("pt", "Brazil");
    NumberFormat nf = NumberFormat.getInstance(br);

    /**
     * Creates new form JProdutoInserir2
     */
    public JProdutoInserir2() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Para campo Id ficar oculto quando for inserir cliente
        if(ftxtId.getText().equals("")){
            lblId.setVisible(false);
            ftxtId.setVisible(false);
        }
    }
    public JProdutoInserir2(Produto p) {
        initComponents();
        setLocationRelativeTo(null);
        
        ftxtId.setText(String.valueOf(p.getId()));
        ftxtCodigo.setText(String.valueOf(p.getCodigo()));
        txtNome.setText(p.getNome());
        ftxtPreco.setText(nf.format(p.getPreco()));
        cmbCategoria.setSelectedItem(p.getCategoria());
        cmbMarca.setSelectedItem(p.getMarca());
        ftxtQuantidade.setText(String.valueOf(p.getQuantidade()));
        
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblPreco = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        ftxtPreco = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        ftxtQuantidade = new javax.swing.JFormattedTextField();
        ftxtCodigo = new javax.swing.JFormattedTextField();
        lblId = new javax.swing.JLabel();
        ftxtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produto");

        lblCodigo.setText("Codigo:");

        lblNome.setText("Nome:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalizar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblPreco.setText("Preço:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria:");

        lblMarca.setText("Marca:");

        lblQuantidade.setText("Quantidade:");

        ftxtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftxtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPrecoActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chanel", "Carolina Herrera", "Dior", "Giorgio Armani" }));

        ftxtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ftxtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblId.setText("Id:");

        ftxtId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ftxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(ftxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(ftxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    
    if (ftxtCodigo.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O campo Código é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }    
    
    if (txtNome.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O campo Nome é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (ftxtPreco.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O campo Preço é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (ftxtQuantidade.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O campo Quantidade é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try{
    
    ConexaoBD conexao = new ConexaoBD();
    ProdutoDAO pro = new ProdutoDAO(conexao.abrirConexao());    
    
    if(!ftxtId.getText().isEmpty()){
        int Id = Integer.valueOf(ftxtId.getText());
        int codigo = Integer.valueOf(ftxtCodigo.getText());
        String nome = txtNome.getText();
        String formataValor=ftxtPreco.getText().replace(".", "");
        double preco = Double.valueOf(formataValor.replaceAll(",", "."));
        String categoria = cmbCategoria.getSelectedItem().toString(); 
        String marca = cmbMarca.getSelectedItem().toString();
        int quantidade = Integer.valueOf(ftxtQuantidade.getText());

        Produto produto = new Produto(Id, codigo, nome, preco, categoria, marca, quantidade);

        pro.AtualizaProduto(produto);

        conexao.fecharConexao();

        JOptionPane.showMessageDialog(this, "Produto Salvo com Sucesso!");

        
         //Fecha tela de editar/Salvar
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
        
        executeMostraTela();
            
    }else{
        
        int codigo = Integer.valueOf(ftxtCodigo.getText());
        String nome = txtNome.getText();
        String formataValor=ftxtPreco.getText().replace(".", "");
        double preco = Double.valueOf(formataValor.replaceAll(",", "."));
        String categoria = cmbCategoria.getSelectedItem().toString(); 
        String marca = cmbMarca.getSelectedItem().toString();
        int quantidade = Integer.valueOf(ftxtQuantidade.getText());
        Produto produto = new Produto(codigo, nome, preco, categoria, marca, quantidade);

        pro.inserirProduto(produto);

        conexao.fecharConexao();

        JOptionPane.showMessageDialog(this, "Produto Salvo com Sucesso!");
        
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();

        executeMostraTela();
    }
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Erro ao salvar produto", ex.getMessage(), JOptionPane.WARNING_MESSAGE);
    }
    
   
    
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ftxtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtPrecoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(JProdutoInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JProdutoInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JProdutoInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JProdutoInserir2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JProdutoInserir2().setVisible(true);
            }
        });
    }
    
    //Metodos para refresh da tela ao salvar ou editar
    private JProduto2 produtoPrincipal;
    public void mostraTela(JProduto2 jc){
        this.produtoPrincipal = jc;
        setVisible(true);
    }
    
    public void executeMostraTela(){
        produtoPrincipal.carregaTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JFormattedTextField ftxtCodigo;
    private javax.swing.JTextField ftxtId;
    private javax.swing.JFormattedTextField ftxtPreco;
    private javax.swing.JFormattedTextField ftxtQuantidade;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
