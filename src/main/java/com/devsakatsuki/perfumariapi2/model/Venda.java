package com.devsakatsuki.perfumariapi2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Venda {
    
    private int id;
    private Cliente cliente;
    private Date dataVenda;
    private Double valorTotal;
    private List<ItemVenda> itens;
    

    public Venda() {
        this.id = 0;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();   
    }

    public Venda(int id) {
        this.id = id;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
      
    }

    public Venda(int id, Cliente cliente, Date dataVenda, Double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
    }

    public Venda(int id, Cliente cliente, Date dataVenda, Double valorTotal, List<ItemVenda> itens) {
        this.id = id;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.itens = itens;
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

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    

    public Double getValorTotal() {
        return valorTotal;
    }

    
    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    
    public void addItem(ItemVenda itemVenda) {
        itens.add(itemVenda);
    }

    public void removeItem(ItemVenda itemVenda) {
        itens.remove(itemVenda);
    }

    public int quantidadeItens() {
        return itens.size();
    }
    
    public Double calculaValorTotal() {
        double total = 0;
        for(ItemVenda iv : itens){
            total += (iv.getValorUnitario() * iv.getQuantidade());
        }
        return total;
    }
    
}
