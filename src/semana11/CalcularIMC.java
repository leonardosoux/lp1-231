package semana11;

public class CalcularIMC {
    public double altura;
    public double peso;
    
    public double calcularIMC() {
        return peso/(altura*altura);
    }

    public String getFaixa() {
        if (calcularIMC() < 18.5) {
            return "Você está abaixo do peso";
        }
        if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9) {
            return "Você está no peso ideal";
        }
        if (calcularIMC() >= 25 && calcularIMC() <= 29) {
            return "Você está com excesso de peso";
        }
        if (calcularIMC() >= 30 && calcularIMC() <= 34.9) {
            return "Você está com obesidade de classe 1";
        }
        if (calcularIMC() >= 35 && calcularIMC() <= 39.9) {
            return "Você está com obesidade de classe 2";
        }
        if (calcularIMC() >= 40) {
            return"Você está com obesidade de classe 3";
        }
        return "erro";
    }

    public double pesoIdeal() {
        return 24.9 * (altura*altura);
    }
    public String getSituacao() {
        if (pesoIdeal()>calcularIMC()) {
            return "Ganhar peso";
        }
        if (pesoIdeal()==calcularIMC()) {
            return "Peso ok";
        }
        if (pesoIdeal()<calcularIMC()) {
            return "Perder peso";
        }
        return "erro";
    }

   
}
