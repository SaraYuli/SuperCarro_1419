package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    // ATIVIDADE 1 

    @Test
    public void deveLigarUmCarroCorretamente() {
        // Given
        Carro carroT1 = new Carro();

        // When
        carroT1.ligar();

        // Entao
        Assert.assertTrue(carroT1.getLigado());
    }

    @Test
    public void deveAcelerarCorretamente() {
        // Given
        Carro carroT2 = new Carro();
        carroT2.ligar();

        // When
        carroT2.acelerar();

        // Then
        Integer valorEsperado = 10;
        Assert.assertEquals(valorEsperado, carroT2.getVelocidadeAtual());
    }

    @Test
    public void deveIniciarComOCarroDesligado() {

        // Given
        Carro carroT3 = new Carro();

        // Then
        Assert.assertFalse(carroT3.getLigado());
    }



    @Test
    public void deveDiminuirAVelocidade() {
        // Given
        Carro carroT4 = new Carro();
        carroT4.ligar();
        carroT4.acelerar();
        carroT4.acelerar();
        carroT4.acelerar();

        // When
        carroT4.frear();
    

        // Then
        Integer valorEsperado = 20;
        Assert.assertEquals(valorEsperado, carroT4.getVelocidadeAtual());
    }

    @Test
    public void deveDesligarCorretamente() throws Exception {
        // Given
        Carro carroT5 = new Carro();
        carroT5.ligar();

        // When
        carroT5.desligar();

        // Then
        Assert.assertFalse(carroT5.getLigado());
    }

       @Test
        public void naoDeveTerVelocidadeNegativa() {
        // Given
        Carro carroT6 = new Carro ();
        carroT6.ligar();

        // When
        carroT6.frear();
        
        // Then
        Integer valorEsperado = 0;
        Assert.assertEquals(valorEsperado, carroT6.getVelocidadeAtual());
    }

        // ATIVIDADE 2 

        @Test(expected = Exception.class) 
        public void naoDeveDesligarOCarroEmMovimento() throws Exception {
         //Given
        Carro carro = new Carro();
        carro.ligar();

        //When
        carro.acelerar(); 

        //Then

        carro.desligar(); 


        }

        @Test
        public void todoCarroTemQueComecarNulu(){
        //Given

        Carro carro = new Carro();

        //When
        Integer kMsInicial = carro.getkMs();
        
        //Then
        Assert.assertNull(kMsInicial); 
        }

        @Test
        public void oRadioDoCarroDeveComecaDesligado() {
        
        //Given
        Carro carro = new Carro();

        //When
        carro.ligar();

        //Then
        Assert.assertFalse(carro.getRadio());
        }


        @Test
        public void oRadioDeveLigarCorretamente() {
        
         //Given
         Carro carro = new Carro();

         //When
         carro.ligarRadio();

         //Then
         Assert.assertTrue(carro.getRadio());
         
        }







}
