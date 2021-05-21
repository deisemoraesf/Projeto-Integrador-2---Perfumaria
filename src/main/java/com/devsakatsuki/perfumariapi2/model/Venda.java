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
    private List<ItemVenda> itensRemover;

    public Venda() {
        this.id = 0;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
        
    }

    public Venda(int id) {
        this.id = id;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
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

    public Double getValorTotal() {
        double total = 0;
        for(ItemVenda iv : itens){
            total += (iv.getValorUnitario() * iv.getQuantidade());
        }
        return total;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public List<ItemVenda> getItensRemover() {
        return itensRemover;
    }
    
    public void addItem(ItemVenda itemVenda) {
        itens.add(itemVenda);
    }

    public void removeItem(ItemVenda itemVenda) {
        itens.remove(itemVenda);
        if (itemVenda.getId()!= 0) {
            itensRemover.add(itemVenda);
        }
    }

    public int quantidadeItens() {
        return itens.size();
    }
    
}
