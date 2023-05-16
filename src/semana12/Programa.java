package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        

        
        System.out.println(quadrado.CalcularArea());

        

        double nota = 10.0;


        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(20.0, 30.0);
        Retangulo r3 = new Retangulo(15.0, 15.0);

        System.out.println(r3.altura); 


    

        Circulo c1 = new Circulo(5.0); 
        Circulo c2 = new Circulo(4.0); 
        Circulo c3 = new Circulo(7.0); 

        System.out.println(c1.CalcularAreaCirculo()); 

    }
    
}
