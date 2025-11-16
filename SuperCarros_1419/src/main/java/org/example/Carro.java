package org.example;

public class Carro {

    // primitivo vs wrapper class

    private String cor;
    private String marca;
    private Boolean ligado;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;
    private Integer kMs;
    private boolean radioLigado;

    public Carro() {
        this.ligado = false;
        this.velocidadeMaxima = 100;
        this.velocidadeAtual = 0;
        this.radioLigado = false;
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

    public void desligar() throws Exception {
        if (this.velocidadeAtual != 0 ){
            throw new Exception("Não deve desligar carro em movimento");
        }
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

    public Integer getkMs() {
        return kMs;
    }

    public boolean getRadio(){
        return this.radioLigado;

    }

    public void ligarRadio() {
        if (this.radioLigado){
            System.out.println("O radio está ligado!");
        } else {
            this.radioLigado =  true;
            System.out.println("Rádio ligado!");
        }
        
    }
       
    public void desligarRadio() {
        if (this.radioLigado) {
            System.out.println("O rádio já está desligado!");
            
        }else {
            this.radioLigado = false;
            System.out.println("Radio desligado");
        }
    }
    

    
}
