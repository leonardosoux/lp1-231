package semana12;

public class Quadrado {
    public double lado;

    //Construtor
    public Quadrado (double lado){
        this.lado = lado;
    }

    public double CalcularArea(){
        return lado * lado;
    }

    public double CalcularPerimetro(){
        return 4 * lado;
    }
    
}
