package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.dao.ProdutoDAO;
import com.devsakatsuki.perfumariapi2.model.Produto;
import com.devsakatsuki.perfumariapi2.tablemodel.ProdutoTableModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class JBuscarProduto extends javax.swing.JDialog {

    JInternalFrame parent;
     ConexaoBD conexao = new ConexaoBD();

    public JBuscarProduto(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        carregarGrade();
    }

    private void carregarGrade() {
        try {
            ProdutoDAO pdao = new ProdutoDAO(conexao.abrirConexao());
            ProdutoTableModel ptm = (ProdutoTableModel) tblProdutos.getModel();
            ptm.setDados(pdao.getProdutos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFiltro = new javax.swing.JPanel();
        lbFiltro = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca cliente");

        pnFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbFiltro.setText("Filtro:");
        pnFiltro.add(lbFiltro);

        tfFiltro.setColumns(30);
        tfFiltro.setToolTipText("Filtrar por Código, Nome ou Marca");
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });
        pnFiltro.add(tfFiltro);

        getContentPane().add(pnFiltro, java.awt.BorderLayout.PAGE_START);

        tblProdutos.setAutoCreateRowSorter(true);
        tblProdutos.setModel(new ProdutoTableModel());
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tblProdutos);

        getContentPane().add(spGrade, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(750, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        if (evt.getClickCount() == 2) {
            ProdutoTableModel ptm = (ProdutoTableModel) tblProdutos.getModel();
            int linhaSelecionada = tblProdutos.getRowSorter().convertRowIndexToModel(tblProdutos.getSelectedRow());
            Produto produto = ptm.getRowValue(linhaSelecionada);

            if (parent instanceof JVendas2) {
                JVendas2 lv = (JVendas2) parent;
                lv.setProdutoText(produto);
                dispose();
            }else {
                JOptionPane.showMessageDialog(this, "Campo de destino inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        TableRowSorter rs = (TableRowSorter) tblProdutos.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
    }//GEN-LAST:event_tfFiltroKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JPanel pnFiltro;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
