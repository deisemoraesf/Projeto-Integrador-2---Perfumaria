
package com.devsakatsuki.perfumariapi2.dao;

import java.sql.Connection;
import com.devsakatsuki.perfumariapi2.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {
    
    Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }
    //id, codigo; nome; preco; categoria; String marca; quantidade;
    public void inserirProduto(Produto p) {
        String sql="insert into produto(codigo, nome, preco, categoria, marca, quantidade) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNome());
            ps.setDouble(3, p.getPreco());
            ps.setString(4, p.getCategoria());
            ps.setString(5, p.getMarca());
            ps.setInt(6, p.getQuantidade());
            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public List<Produto> getProdutos(){
        List<Produto> produtos = new ArrayList<Produto>();
        
        String sql="select * from produto";
        
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                 //id, codigo; nome; preco; categoria; String marca; quantidade;
                int id = rs.getInt("id");
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                String categoria = rs.getString("categoria");
                String marca = rs.getString("marca");
                int quantidade = rs.getInt("quantidade");
                                               
                Produto p = new Produto(id, codigo, nome, preco, categoria, marca, quantidade);
                
                produtos.add(p);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return produtos;
    }
    
    public void deletarProduto(int Id){
        String sql="delete from produto where id=?";
        PreparedStatement ps;
        
        try{
               
        ps = this.conexao.prepareStatement(sql);
        ps.setInt(1, Id);
        ps.execute();
            
        }catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void AtualizaProduto(Produto pro){
     
    //id, codigo; nome; preco; categoria; String marca; quantidade;
    String sql="update produto set codigo=?,nome=?,preco=?,categoria=?,marca=?,quantidade=? WHERE id=?";
    
    try{
    PreparedStatement ps;
    ps = this.conexao.prepareStatement(sql);
    
    ps.setInt(1, pro.getCodigo());
    ps.setString(2, pro.getNome());
    ps.setDouble(3, pro.getPreco());
    ps.setString(4, pro.getCategoria());
    ps.setString(5, pro.getMarca());
    ps.setInt(6, pro.getQuantidade());
    ps.setInt(7, pro.getId());
    ps.execute();
    
    }catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

                                
    }
    
    
}
