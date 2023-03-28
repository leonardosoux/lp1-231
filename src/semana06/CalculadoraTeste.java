package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    
    @Test
    public void somaDoisNumerosPositivos(){
        // AAA

        // Arrange 
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act 
        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(12.0, soma);
        
    }

    @Test
    public void somaumNumerosPositivoEUmNegativo(){
        
        double numero1 = 10.0;
        double numero2 = -2.0;

       
        double soma = Calculadora.somar(numero1, numero2);

        
        
        assertEquals(8.0, soma);
    }

    @Test
    public void somadoisNumerosNegativos(){
        
        double numero1 = -10.0;
        double numero2 = -2.0;

       
        double soma = Calculadora.somar(numero1, numero2);

        
        
        assertEquals(-12.0, soma);
    }

    @Test
    public void subtraiDoisNumerosPositivos(){
        
        double numero1 = 10.0;
        double numero2 = 2.0;

       
        double subtracao = Calculadora.subtrair(numero1, numero2);

        
        
        assertEquals(8.0, subtracao);
    }

    @Test
    public void subtraiumNumeroPositivoEUmNegativo(){
        
        double numero1 = 10.0;
        double numero2 = -2.0;

       
        double subtracao = Calculadora.subtrair(numero1, numero2);

        
        
        assertEquals(12.0, subtracao);
    }
    @Test
    public void subtraiNumerosNegativos(){
        
        double numero1 = -10.0;
        double numero2 = -2.0;

       
        double subtracao = Calculadora.subtrair(numero1, numero2);

        
        
        assertEquals(-8.0, subtracao);
    }

    @Test
    public void multiplicanumerospositivos(){
        
        double numero1 = 10.0;
        double numero2 = 2.0;

       
        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        
        
        assertEquals(20.0, multiplicacao);
    }
    @Test
    public void multiplicanumerosnegativos(){
        
        double numero1 = -10.0;
        double numero2 = -2.0;

       
        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        
        
        assertEquals(20.0, multiplicacao);
    }
    @Test
    public void multiplicaumNumeroPositivoEUmNegativo(){
        
        double numero1 = 10.0;
        double numero2 = -2.0;

       
        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        
        
        assertEquals(-20.0, multiplicacao);
    }

    @Test
    public void divideNumerospositivos(){
        
        double numero1 = 10.0;
        double numero2 = 2.0;

       
        double divisao = Calculadora.dividir(numero1, numero2);

        
        
        assertEquals(5.0, divisao);
    }
    @Test
    public void divideNumerosNegativos(){
        
        double numero1 = -10.0;
        double numero2 = -2.0;

       
        double divisao = Calculadora.dividir(numero1, numero2);

        
        
        assertEquals(5.0, divisao);
    }
    @Test
    public void divideUmNumeroNegativoeUmPositivo(){
        
        double numero1 = 10.0;
        double numero2 = -2.0;

       
        double divisao = Calculadora.dividir(numero1, numero2);

        
        
        assertEquals(-5.0, divisao);
    }
}
