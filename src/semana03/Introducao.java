package semana03;

import java.io.ByteArrayInputStream;

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
    }
    
}
