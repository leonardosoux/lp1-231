package Semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface
// uso quando tiver um comportamento especifíco


// exemplo
// Quadrado - lado - calcular Area/perimetro
// Retangulo  - base, altura - calcular Area/Perimetro
// Circulo - ? 
public class Main {
    
    public static void main(String[] args) {
        
        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo (10, 5);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);


        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        // Coleções de valores
        // List
        // Set
        // Map

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        // Tamanho
        System.out.println(nomes.size());

        // Remover um elemento
        nomes.remove(1);
        //nomes.remove("João");

        // Ao remover um elemento a posição deles no array é reorganizado

        // Remove todos os elementos do ArrayList
        nomes.clear();

        // Pegar valor
        System.out.println(nomes.get(0));

        for (int i = 0; i < nomes.size(); i++){
            String nome = nomes.get(i);
        }

        for (String nome : nomes){
            
        }


    }
}
