package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ClienteDAO;
import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.model.Cliente;
import com.devsakatsuki.perfumariapi2.tablemodel.ClienteTableModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class JBuscarCliente extends javax.swing.JDialog {

    JInternalFrame parent;
    ConexaoBD conexao = new ConexaoBD();

    public JBuscarCliente(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        carregarGrade();
    }

    private void carregarGrade() {
        try {
            ClienteDAO cdao = new ClienteDAO(conexao.abrirConexao());
            ClienteTableModel ctm = (ClienteTableModel) tblCliente.getModel();
            ctm.setDados(cdao.getClientes());
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
        tblCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca cliente");

        pnFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbFiltro.setText("Filtro:");
        pnFiltro.add(lbFiltro);

        tfFiltro.setColumns(30);
        tfFiltro.setToolTipText("Pesquisar pelo Nome ou CPF");
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });
        pnFiltro.add(tfFiltro);

        getContentPane().add(pnFiltro, java.awt.BorderLayout.PAGE_START);

        tblCliente.setAutoCreateRowSorter(true);
        tblCliente.setModel(new ClienteTableModel());
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tblCliente);

        getContentPane().add(spGrade, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(500, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if (evt.getClickCount() == 2) {
            ClienteTableModel ctm = (ClienteTableModel) tblCliente.getModel();
            int linhaSelecionada = tblCliente.getRowSorter().convertRowIndexToModel(tblCliente.getSelectedRow());
            Cliente cliente = ctm.getRowValue(linhaSelecionada);

            if (parent instanceof JVendas2) {
                JVendas2 lv = (JVendas2) parent;
                lv.setClienteText(cliente);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Campo de destino inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        TableRowSorter rs = (TableRowSorter) tblCliente.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
    }//GEN-LAST:event_tfFiltroKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JPanel pnFiltro;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
