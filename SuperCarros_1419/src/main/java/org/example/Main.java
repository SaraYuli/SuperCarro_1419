package org.example;

/**
     * Um carro tem os seguintes atributos:
     * - cor
     * - marca
     * - ligado
     * - velocidadeAtual
     * - velocidadeMaxima
     *
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Motrar estado atual (toString())
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual (toString())
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - Um carro tem por padrão velocidade máx = 100
     * - O carro não pode passar de sua velocidade máxima
     */

public class Main {


    public void main(String[] args) {
   
        Carro carro1 = new Carro();
        carro1.setCor("Vermelho");
        carro1.setMarca("Ferrari");
        carro1.ligar();
    
        System.out.println("O carro da marca " + carro1.getMarca() + " e de cor " + carro1.getCor() + " esta ligado? " + carro1.getLigado());
}
}