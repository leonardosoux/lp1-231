package semana03;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Introducao {

    public static void main (String[] args){
        // comentário de uma linha 

        /*
         * Comentário de várias 
         * linhas 
         */

         // Tipos primitivos
         // Inteiros
         // byte, short, int, long

         byte n1 = 100; // -128 a 127
         short n2 = 3000; // -32768 a 32767
         int n3 = 321312321; // 2 bilhoes
         long n4 = 3232332323232L; // 8 Bytes 

         // Ponto flutuante
         float nota1 = 10.34343f;
         double nota2 = 10.3434343;

         // char
         char letra = 'A';

         // boolean 
         boolean ligado = true;
         boolean teste = false;

         // string 
         String nome = "João da Silva";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());

         // variáveis e constantes
         int idade = 20;
        
         int idade2;
         idade2 = 30;

         // Java 10 - inferência de tipo com var
         var idade3 = 15;
         var nome2 = "Maria";

         // Constantes - keyword final
         final double TESTE = 20.2;
         final double PI = 3.14;

         // Entrada e saida de dados
         // Entrada - Classe Scanner
         // Saída - System.out

         Scanner sc = new Scanner(System.in);

         System.out.println("Entre com seu nome");
         String nomeInformado = sc.nextLine();

         System.out.println("Entre com a sua idade");
         int idadeInformada = sc.nextInt();

         System.out.println(nomeInformado + " " + idadeInformada);
         System.out.printf("%s %d \n", nomeInformado, idadeInformada);



         sc.close();






         

    }
    
}
