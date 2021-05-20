
package com.devsakatsuki.perfumariapi2.dao;

import com.devsakatsuki.perfumariapi2.model.Cliente;
import com.devsakatsuki.perfumariapi2.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    
    public List<Venda> getRelatorios(Date ini, Date fim){
        List<Venda> vendas = new ArrayList<Venda>();
        
        String sql= "select * from venda where data between ? AND ?";
        
        try {
            PreparedStatement ps;
            ps = this.conexao.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(ini.getTime()));
            ps.setDate(1, new java.sql.Date(fim.getTime()));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                /*int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("estado_civil");
                Date dtNasc = rs.getDate("data_nascimento");
                                
                Cliente c = new Cliente(id, nome, cpf, endereco, telefone, email, sexo, estadoCivil, dtNasc);
                
                vendas.add(c);*/
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return vendas;
    }
    
    
}
