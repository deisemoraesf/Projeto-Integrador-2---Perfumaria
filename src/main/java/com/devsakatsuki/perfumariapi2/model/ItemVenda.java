package com.devsakatsuki.perfumariapi2.model;

public class ItemVenda {
    
    private int id;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private Double valor;

    public ItemVenda() {
        this.id = 0;
        this.venda = new Venda();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valor = 0.0;   
    }

    public ItemVenda(int id) {
        this.id = id;
        this.venda = new Venda();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valor = 0.0;
    }

    public ItemVenda(int id, Venda venda, Produto produto, int quantidade, Double valor) {
        this.id = id;
        this.venda = new Venda();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valor = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getProduto().getNome();
    }
    
    
    
    
    
    


    
    
    
    


    
    
    
    
    
    
    
    
    
}
