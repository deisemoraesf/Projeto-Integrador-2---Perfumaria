/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsakatsuki.perfumariapi2.model;

/**
 *
 * @author Pedrin
 */
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
