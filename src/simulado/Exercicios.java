package simulado;

import java.lang.reflect.Array;

public class Exercicio01 {

   
    public static double somar (double numero1, double numero2, double numero3){
        return numero1 + numero2 + numero3;
    }


}

public class Exercicio02 {

    
    public static double MediaAritimedica (double numero1, double numero2, double numero3){
        return (numero1 + numero2 + numero3)/3;
    }
}

public class Exercicio03 {

    public static int ValorMaior (int a, int b, int c){
        int maior = a;

        if (b > maior){
            maior = b;   
        }
        
        if (c > maior){
            maior = c;  
        }
        
        return maior; 
    }

}

public class Exercicio04 {

    public static int ValorMenor (int a, int b, int c){
        int menor = a;

        if (b < menor){
            maior = b;   
        }
        
        if (c < menor){
            menor = c;  
        }
        return menor; 
    }
}

public class Exercicio05 {

    public static double[] ImprimirArrays (double v1, double v2, double v3){

        double[] array = {v1, v2, v3};
        return array;

    }
}

public class Exercicio06 {

    public static double calcularSoma (double[] array){
        double soma = 0;
        for (double valor : array) {
            soma += valor;
        }
        return soma;
    }
}

public class Exercicio07 {

    public static double calcularMedia (double[] array){
        double soma = 0;
        for (double valor : array) {
            soma += valor;
        }
        return soma / array.length;
    }
}

public class Exercicio08 {

    public static double encontrarMaior (double[] array){
        double maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[1] > maior){
                maior = array[i];
            }
        }
        return maior;
    }
}

public class Exercicio09 {

    public static double encontrarMenor (double[] array){
        double menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[1] < menor){
                menor = array[i];
            }
        }
        return menor;
    }
}

