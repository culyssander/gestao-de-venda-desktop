/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.modelo.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author quitumba
 */
public class Venda {
    
    private Long id;
    private Cliente cliente;
    private Usuario usuario;
    private BigDecimal totalVenda;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private BigDecimal desconto;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaActualizacao;
    private HashMap<String, VendaDetalhes> vendasDetalhes;

    public Venda() {
    }

    public Venda(Long id, Cliente cliente, Usuario usuario, BigDecimal totalVenda, BigDecimal valorPago, BigDecimal troco, BigDecimal desconto, LocalDateTime dataHoraCriacao, LocalDateTime ultimaActualizacao, HashMap<String, VendaDetalhes> vendasDetalhes) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.totalVenda = totalVenda;
        this.valorPago = valorPago;
        this.troco = troco;
        this.desconto = desconto;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaActualizacao = ultimaActualizacao;
        this.vendasDetalhes = vendasDetalhes;
    }       

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaActualizacao() {
        return ultimaActualizacao;
    }

    public void setUltimaActualizacao(LocalDateTime ultimaActualizacao) {
        this.ultimaActualizacao = ultimaActualizacao;
    }

    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(BigDecimal totalVenda) {
        this.totalVenda = totalVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public HashMap<String, VendaDetalhes> getVendasDetalhes() {
        return vendasDetalhes;
    }

    public void setVendasDetalhes(HashMap<String, VendaDetalhes> vendasDetalhes) {
        this.vendasDetalhes = vendasDetalhes;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", usuario=" + usuario + ", totalVenda=" + totalVenda + ", valorPago=" + valorPago + ", troco=" + troco + ", desconto=" + desconto + ", dataHoraCriacao=" + dataHoraCriacao + ", ultimaActualizacao=" + ultimaActualizacao + ", vendasDetalhes=" + vendasDetalhes + '}';
    }
    
}
