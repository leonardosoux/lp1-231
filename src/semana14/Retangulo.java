package semana14;

public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        
        this.altura = altura;
    }

    public Retangulo(double lado) {
        this(lado, lado);
    }
    
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base +  altura);
    }
}


public double getBase() {
    return base;
}


public double getAltura() {
    return altura;

}

public void setBase(double base) {
    if(base <= 0){
            throw new RuntimeException("Base inválida");
    }
   this.base = base;
}



// Setter
public void setAltura(double altura) {
    if(altura <= 0){
            throw new RuntimeException("Base inválida");
    }
   this.altura = altura;
}



