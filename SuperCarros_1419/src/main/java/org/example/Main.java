package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public void main(String[] args) {
   
        Carro carro1 = new Carro();
        carro1.setCor("Vermelho");
        carro1.setMarca("Ferrari");
        carro1.ligar();
    
        System.out.println("O carro da marca " + carro1.getMarca() + " e de cor " + carro1.getCor() + " esta ligado? " + carro1.getLigado());
}
}