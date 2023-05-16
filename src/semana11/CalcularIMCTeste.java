package semana11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularIMCTeste {
    
    @Test
    public void testaCalcularIMC() {
        CalcularIMC p1 = new CalcularIMC();
        p1.altura = 1.72;
        p1.peso = 70.3;

        double imc = p1.calcularIMC();

         assertEquals (23.762844780962684, imc);
    }

    @Test
    public void testaGetFaixa() {
        CalcularIMC p1 = new CalcularIMC();
        p1.altura = 172;
        p1.peso = 70.3;

        String faixa = p1.getFaixa();
    }

    @Test
    public void testaGetSituacao() {
        CalcularIMC p1 = new CalcularIMC();
        p1.altura = 172;
        p1.peso = 70.3;

        String situacao = p1.getSituacao();
    }
}
    

