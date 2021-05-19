
package com.devsakatsuki.perfumariapi2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Venda {
    
    private int id;
    private Cliente cliente;
    private Date dataVenda;
    private Double valorTotal;
    private Produto produto;
    private int quantidade;
    
    
    private List<Produto> itens;
    private List<Produto> itensRemover;

    public Venda() {
        this.id = 0;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.produto = new Produto();
        this.quantidade = 0;
        
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
    }

    public Venda(int id) {
        this.id = id;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.produto = new Produto();
        this.quantidade = 0;
        
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    

    public Double getValorTotal() {
        double total = 0;
        for (Produto item : itens){
            total += (item.getPreco()* item.getQuantidade());
        }
        return total ;
    }


    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }
    
    public void addItem(Produto itemVenda){
        itens.add(itemVenda);
    }
    
    public void removerItem(Produto itemVenda){
        itens.remove(itemVenda);
        if (itemVenda.getId() !=0){
            itensRemover.add(itemVenda);
        }
    }

    public int qtdItens(){
        return itens.size();
    }
    
    


    
    
    
    
    
    
    
    
    
    
    


    
    
    
    
    
    


    
    
}
