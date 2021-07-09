/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.entidades;

import java.math.BigDecimal;

/**
 *
 * @author quitumba
 */
public class VendaDetalhes {
    
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private BigDecimal desconto;
    private BigDecimal total;

    public VendaDetalhes() {
    }

    public VendaDetalhes(Venda venda, Produto produto, int quantidade, BigDecimal desconto, BigDecimal total) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.total = total;
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

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    
    
    
}
