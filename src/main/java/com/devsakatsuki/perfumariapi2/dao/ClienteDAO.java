
package com.devsakatsuki.perfumariapi2.dao;

import java.sql.Connection;
import com.devsakatsuki.perfumariapi2.model.Cliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    
    Connection conexao;

    public ClienteDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserirCliente(Cliente c) {
        String sql="insert into cliente(nome, cpf, endereco, telefone, email, sexo, estado_civil, data_nascimento) values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setFloat(2, c.getCpf());
            ps.setString(3, c.getEndereco());
            ps.setFloat(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getSexo());
            ps.setString(7, c.getEstadoCivil());
            ps.setDate(8, new java.sql.Date(c.getDataNascimento().getTime()));
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public List<Cliente> getClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        String sql="select * from cliente";
        
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                //nome, cpf, endereco, telefone, email, sexo, estado_civil, data_nascimento
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Float cpf = rs.getFloat("cpf");
                String endereco = rs.getString("endereco");
                Float telefone = rs.getFloat("telefone");
                String email = rs.getString("email");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("estado_civil");
                Date dtNasc = rs.getDate("data_nascimento");
                
                Cliente c = new Cliente(id, nome, cpf, endereco, telefone, email, sexo, estadoCivil);
                
                clientes.add(c);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return clientes;
    }
    
}
