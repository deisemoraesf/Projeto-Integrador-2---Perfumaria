
package com.devsakatsuki.perfumariapi2.view;

import com.devsakatsuki.perfumariapi2.dao.ConexaoBD;
import com.devsakatsuki.perfumariapi2.dao.VendaDAO;
import com.devsakatsuki.perfumariapi2.model.Venda;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class JRelatorioSintetico extends javax.swing.JInternalFrame {
    
    ConexaoBD conexao = new ConexaoBD();
    VendaDAO ven = new VendaDAO(conexao.abrirConexao());
    private final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    NumberFormat nfc = NumberFormat.getCurrencyInstance();

    /**
     * Creates new form JRelatorios
     */
    public JRelatorioSintetico() {
        initComponents();
    }
    
    public JRelatorioSintetico(List<Venda> vendas) {
        initComponents();
       
            lblSintetico.setVisible(true);
            jScrollSintetico.setVisible(true);
            TabelaSintetico.setVisible(true);
                        
        DefaultTableModel tblSintetico = (DefaultTableModel)TabelaSintetico.getModel();
               
        tblSintetico.setNumRows(0);
        
        double valorTotalVendas =0;
        for(Venda v: vendas){
            tblSintetico.addRow(new Object []{
                v.getId(),
                SDF.format(v.getDataVenda()),
                v.getCliente().getNome(),
                nfc.format(v.getValorTotal())
            });
            valorTotalVendas +=v.getValorTotal();
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

        lblSintetico = new javax.swing.JLabel();
        jScrollSintetico = new javax.swing.JScrollPane();
        TabelaSintetico = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Relatório de Venda");

        lblSintetico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSintetico.setText("Relatório Sintético de Vendas");

        TabelaSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Venda", "Data da Venda", "Cliente", "Valor Total"
            }
        ));
        jScrollSintetico.setViewportView(TabelaSintetico);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("Total:");

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(lblSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollSintetico))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollSintetico, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaSintetico;
    private javax.swing.JScrollPane jScrollSintetico;
    private javax.swing.JLabel lblSintetico;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}
