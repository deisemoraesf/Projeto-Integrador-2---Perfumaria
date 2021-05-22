package com.devsakatsuki.perfumariapi2.model;


public class ItemVenda {
    
    private int id;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private Double valorUnitario;

    public ItemVenda() {
        this.id = 0;
        this.venda = new Venda();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }

    public ItemVenda(int id) {
        this.id = id;
        this.venda = new Venda();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }

    public ItemVenda(int id, Venda venda, Produto produto, int quantidade, Double valorUnitario) {
        this.id = id;
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
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

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return getProduto().getNome();
    }
       
    
}
