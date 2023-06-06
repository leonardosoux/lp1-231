package semana14;

import javax.management.RuntimeErrorException;

public class Quadrado {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}


// Getters
public double getLado() {
    return lado;
}

// Setter
public void setLado(double lado) {
    if (lado <= 0.0){ 
          throw new RuntimeException("lado iválido");
    }
    this.lado = lado; 

}



