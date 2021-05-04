
package com.devsakatsuki.perfumariapi2.dao;

import java.sql.Connection;
import com.devsakatsuki.perfumariapi2.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
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
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("estado_civil");
                Date dtNasc = rs.getDate("data_nascimento");
                                
                Cliente c = new Cliente(id, nome, cpf, endereco, telefone, email, sexo, estadoCivil, dtNasc);
                
                clientes.add(c);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return clientes;
    }
    
    public Cliente getClientes(int Id){
        String sql="select id_cliente, nome_cliente, cpf, veiculo, placa from cliente where id_cliente=?";
        Cliente cliente = new Cliente();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
                       
                //nome, cpf, endereco, telefone, email, sexo, estado_civil, data_nascimento
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEstadoCivil(rs.getString("estado_civil"));
                cliente.setDataNascimento(rs.getDate("data_nascimento"));
                                
                    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cliente;
    
    }
    
    public void deletarCliente(int Id){
        String sql="delete from cliente where id=?";
        PreparedStatement ps;
        
        try{
               
        ps = this.conexao.prepareStatement(sql);
        ps.setInt(1, Id);
        ps.execute();
            
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void AtualizaCliente(Cliente cli){
    String sql="update cliente set nome=?,cpf=?,endereco=?,telefone=?,email=?,sexo=?,estado_civil=?,data_nascimento=? WHERE id=?";
    
    try{
    PreparedStatement ps;
    ps = this.conexao.prepareStatement(sql);
    
    ps.setString(1, cli.getNome());
    ps.setString(2, cli.getCpf());
    ps.setString(3, cli.getEndereco());
    ps.setString(4, cli.getTelefone());
    ps.setString(5, cli.getEmail());
    ps.setString(6, cli.getSexo());
    ps.setString(7, cli.getEstadoCivil());
    ps.setDate(8, new java.sql.Date(cli.getDataNascimento().getTime()));
    ps.setInt(9, cli.getId());
    ps.execute();
    
    }catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

                                
    }
}
