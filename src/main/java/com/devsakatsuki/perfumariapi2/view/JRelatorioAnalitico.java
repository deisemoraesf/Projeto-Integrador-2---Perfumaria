package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.dao.VendaDAO;
import com.devsakatsuki.perfumariapi2.model.ItemVenda;
import com.devsakatsuki.perfumariapi2.model.Venda;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class JRelatorioAnalitico extends javax.swing.JInternalFrame {

    ConexaoBD conexao = new ConexaoBD();
    VendaDAO ven = new VendaDAO(conexao.abrirConexao());
    private final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    NumberFormat nfc = NumberFormat.getCurrencyInstance();

    /**
     * Creates new form JRelatorios
     */
    public JRelatorioAnalitico() {
        initComponents();
    }

    public JRelatorioAnalitico(List<Venda> vendas) {
        initComponents();

        lblAnalitico.setVisible(true);
        jScrollAnalitico.setVisible(true);
        TabelaAnalitico.setVisible(true);

        DefaultTableModel tblAnalitico = (DefaultTableModel) TabelaAnalitico.getModel();

        tblAnalitico.setNumRows(0);

        double valorTotalVendas = 0;
        for (Venda v : vendas) {
            tblAnalitico.addRow(new Object[]{
                v.getId(),
                SDF.format(v.getDataVenda()),
                v.getCliente().getNome(),
                "",
                "",
                "",
                nfc.format(v.getValorTotal())
            });
            for (ItemVenda iv : v.getItens()) {
                tblAnalitico.addRow(new Object[]{
                    "",
                    "",
                    "",
                    iv.getProduto().getNome(),
                    iv.getQuantidade(),
                    nfc.format(iv.getValorUnitario())
                });
            }
            valorTotalVendas += v.getValorTotal();
        }

        lblValor.setText(String.valueOf(nfc.format(valorTotalVendas)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnalitico = new javax.swing.JLabel();
        jScrollAnalitico = new javax.swing.JScrollPane();
        TabelaAnalitico = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Relatórios");

        lblAnalitico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnalitico.setText("Relatório Analítico de Vendas");

        TabelaAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Venda", "Data da venda", "Cliente", "Produtos", "Quantidade", "Preço Unitário", "Total Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollAnalitico.setViewportView(TabelaAnalitico);
        if (TabelaAnalitico.getColumnModel().getColumnCount() > 0) {
            TabelaAnalitico.getColumnModel().getColumn(0).setPreferredWidth(35);
            TabelaAnalitico.getColumnModel().getColumn(1).setPreferredWidth(35);
            TabelaAnalitico.getColumnModel().getColumn(3).setPreferredWidth(200);
            TabelaAnalitico.getColumnModel().getColumn(4).setPreferredWidth(35);
            TabelaAnalitico.getColumnModel().getColumn(5).setPreferredWidth(35);
            TabelaAnalitico.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("Total:");

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaAnalitico;
    private javax.swing.JScrollPane jScrollAnalitico;
    private javax.swing.JLabel lblAnalitico;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}