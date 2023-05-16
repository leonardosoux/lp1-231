package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Aquariotest {
    @Test
    
    public void testeCalcularvolume(){
        Aquario aq1 = new Aquario();
        aq1.comprimento = 60.0;
        aq1.largura = 100.0;
        aq1.altura = 30.0;

        double volume = aq1.calcularVolume();

        assertEquals(180.0, volume);
    }

    @Test
    public void testecalcularPotenciaDoTermostato(){
        Aquario aq1 = new Aquario();
        double temperaturaDesejada = 20;
        double temperaturaAmbiente = 15;
        aq1.comprimento = 60.0;
        aq1.largura = 100.0;
        aq1.altura = 30.0;


        // Act 
        double potencia = aq1.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        // Assert
        assertEquals(45, potencia);
        
    }


    @Test
    public void testecalcularQuantidadeLitrosFiltro (){
        Aquario aq1 = new Aquario();
        double filtragem = aq1.calcularQuantidadeLitrosFiltro();
        
          
    }
    
}
