package com.devsakatsuki.perfumariapi2.dao;

import com.devsakatsuki.perfumariapi2.model.ItemVenda;
import com.devsakatsuki.perfumariapi2.model.Produto;
import com.devsakatsuki.perfumariapi2.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 55119
 */
public class ItemVendaDAO {

    Connection conexao;

    public ItemVendaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public List<ItemVenda> getItensVenda(int idVenda) {
        ConexaoBD conexao2 = new ConexaoBD();
        VendaDAO ven = new VendaDAO(conexao2.abrirConexao());
        ProdutoDAO pro = new ProdutoDAO(conexao2.abrirConexao());

        List<ItemVenda> itensVenda = new ArrayList<ItemVenda>();

        String sql = "select * from item_venda where idvenda=?";

        try {
            PreparedStatement ps;
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, idVenda);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                int idProduto = rs.getInt("idProduto");
                int idVenda2 = rs.getInt("idvenda");
                int quantidade = rs.getInt("quantidade");
                double valorUnitario = rs.getDouble("valorunitario");

                Produto produto = pro.getProdutoId(idProduto);
                Venda venda = ven.getVendaId(idVenda2);

                ItemVenda iv = new ItemVenda(id, venda, produto, quantidade, valorUnitario);

                itensVenda.add(iv);

                //conexao2.fecharConexao();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return itensVenda;
    }

}
