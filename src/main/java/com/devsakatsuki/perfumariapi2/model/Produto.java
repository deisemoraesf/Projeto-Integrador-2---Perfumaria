package com.devsakatsuki.perfumariapi2.model;


public class Produto {
    
    private int id;
    private int codigo;
    private String nome;
    private double preco;
    private String categoria;
    private String marca;
    private int quantidade;
    
    public Produto(){
    }

    public Produto(int id, int codigo, String nome, double preco, String categoria, String marca, int quantidade) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, double preco, String categoria, String marca, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.quantidade = quantidade;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   

   
        
}
