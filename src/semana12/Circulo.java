package semana12;

public class Circulo { 
    public double raio;
    
    public Circulo(double raio){
        this.raio = raio;
        
    }
    
    public double CalcularAreaCirculo(){
    return Math.PI * Math.pw(raio, 2);
    }
    
    public double CalcularPerimetro(){
        return 2 * Math.PI * raio;
        
    }
}

    

