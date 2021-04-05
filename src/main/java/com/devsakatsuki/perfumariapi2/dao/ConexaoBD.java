package com.devsakatsuki.perfumariapi2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
    
    private Connection conexao;
    
    public Connection abrirConexao(){
        String url = "jdbc:mysql://localhost:3306/pi2perfumaria?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "Mudar123";
        
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexao;
    }
    
    public void fecharConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
