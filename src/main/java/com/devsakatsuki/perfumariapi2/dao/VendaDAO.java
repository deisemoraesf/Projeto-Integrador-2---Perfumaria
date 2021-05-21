package com.devsakatsuki.perfumariapi2.dao;

import com.devsakatsuki.perfumariapi2.model.ItemVenda;
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
    
public void inserirVenda(Venda venda) {
    
    String sql = "INSERT INTO venda (idcliente, datavenda ,valortotal) VALUES (?, ?, ?)";
    PreparedStatement ps;
    
    try {
        ps = this.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, venda.getCliente().getId());
        ps.setDate(2, new java.sql.Date(venda.getDataVenda().getTime()));
        ps.setDouble(3, venda.getValorTotal());
        ps.execute();
        
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        int idVenda = rs.getInt(1);
        
        for (ItemVenda iv : venda.getItens()){
            sql = "INSERT INTO item_venda (idproduto, idvenda, quantidade, valorunitario) VALUES (?, ?, ?, ?)";
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, iv.getProduto().getCodigo());
            ps.setInt(2, idVenda);
            ps.setInt(3, iv.getQuantidade());
            ps.setDouble(4, iv.getValorUnitario());
            ps.execute();
        }
                
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
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return vendas;
    }
    
    
}
