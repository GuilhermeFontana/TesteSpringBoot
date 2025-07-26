package com.teste.springboot.projeto.springboot.VendasDTO;


public class VendasDTO {

    private Long id;
    private String produto;
    private double valor;

    public VendasDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
