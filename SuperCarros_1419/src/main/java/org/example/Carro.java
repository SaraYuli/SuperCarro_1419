package org.example;

public class Carro {

    // primitivo vs wrapper class

    private String cor;
    private String marca;
    private Boolean ligado;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;

    public Carro() {
        this.ligado = false;
        this.velocidadeMaxima = 100;
        this.velocidadeAtual = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void frear() {
        if (this.velocidadeAtual <= 10) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= 10;
        }
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
