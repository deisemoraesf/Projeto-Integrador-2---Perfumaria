
package com.devsakatsuki.perfumariapi2.model;

public class Vendas {
    
    private double quantidadePedido;
    private double totalVenda;
    
    
    public Vendas(){}

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }


    public double getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(double quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }
    
    
}
