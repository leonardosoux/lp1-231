package semana10;


public class Programa {
    public static void main(String[] args) {
        // calcular a area e perimetro retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        double baseRet2 = 30.0;
        double alturaRet2 = 10.0;
 
        double areaRet2 = baseRet2 * alturaRet2;
        double perimetroRet2 = 2 * (baseRet2 + alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetroRet2);

 
    }

    public static double calcularArea ( double base, double altura){
        return base * altura;public class Retangulo {
    
        }


        //Tipo nomeVariavel = valor
        String palavra = "abc";


        // Objeto (instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 30.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());
        

        Quadrado qua1 = new Quadrado();
        qua1.lado = 10.0;

        System.out.println(qua1.calcularArea());
        System.out.println(qua1.calcularPerimetro());

        Circulo c1 = new Circulo();
        c1.raio = 50.0;
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
    }
}
