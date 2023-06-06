package semana14;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}

// Getters
public double getRaio() {
    return raio;
}

// Setter
public void setLado(double raio) {
    if (raio <= 0.0){ 
          throw new RuntimeException("raio iválido");
    }
    this.raio = raio; 

}
    

