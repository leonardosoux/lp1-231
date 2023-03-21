package semana05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Insira sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.println("Insira seu peso em kg: ");
        float peso = sc.nextFloat();

        float imc = (peso / (altura * altura));
        
        if (imc < 18.5){
            System.out.println("Peso baixo");
        }
        else if (imc = 18.5 && imc < 25){
            System.out.println("Peso normal"); 
        }
        
        else if (imc = 18.5 && imc < 25){
                System.out.println("Peso normal"); 
        }
        else if (imc = 30 && imc < 35){
            System.out.println("Obesidade Classe 1");
        } 

        else if (imc = 35 && imc < 40){
            System.out.println("Obesidade Classe 2");
        } 
        else if (imc >= 40){
            System.out.println("Obesidade Classe 3");
        } 
    }   
}
