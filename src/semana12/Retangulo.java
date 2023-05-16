package semana12;

public class Retangulo {
    public double base;
    public double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        
    }

    public Retangulo(double valor){
        base = valor;
        altura = valor;
    }
    
    public double CalcularArea(){
        return base * altura;
    }
    
    public double CalcularPerimetro(){
        return 2 * (base + altura);
        
    }
}
