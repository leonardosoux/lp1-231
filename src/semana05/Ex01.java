package semana05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o comprimento do aquário em centímetros");
        double comprimento = sc.nextDouble();

        System.out.println("Entre com a altura do aquário em centímetros");
        double altura = sc.nextDouble();

        System.out.println("Entre com a largura do aquário em centímetros");
        double largura = sc.nextDouble();

    
        double volume = ((comprimento * altura * largura)/1000);

        System.out.println("Entre com a temperatura ambiente em °C");
        int tempAmbiente = sc.nextInt(); 

        System.out.println("Entre com a temperatura deseja em °C");
        int tempDesejada = sc.nextInt();

        double potencia = (volume * 0.05 * (tempDesejada - tempAmbiente));

        double filtragem = (volume * 3);

        System.out.println("O volume do aquário é " + volume + " litros ");
        System.out.println("A potência do termostato é " + potencia);
        System.out.println("A filtragem por hora necessária é " + filtragem + "litros");
         
        
       
    }
}


