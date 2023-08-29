package Semana21;

public class Quadrado implements FiguraGeometrica {

    private double lado;


    // TODO: validar lado > zero
    // serve para mostrar parte do codigo que ainda precisa ser escrita

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }
}

