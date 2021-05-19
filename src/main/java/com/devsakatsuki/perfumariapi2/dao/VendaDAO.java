
package com.devsakatsuki.perfumariapi2.dao;

import com.devsakatsuki.perfumariapi2.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendaDAO {
    
    Connection conexao;
    
    public VendaDAO(Connection conexao) {
    this.conexao = conexao;
    }
    
    
    public void gravarVenda(Venda venda) {
        String sql="insert into produto(codigo, nome, preco, categoria, marca, quantidade) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, venda.getId());
                ps.setInt(6, venda.getQuantidade());
            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
}
