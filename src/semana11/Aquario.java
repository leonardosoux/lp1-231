package semana11;

public class Aquario {

    public double comprimento;
    public double largura;
    public double altura;
    
    public double calcularVolume(){
        return (comprimento * altura * largura)/1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        double potencia = calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
        return potencia;
     }
     
     public double calcularQuantidadeLitrosFiltro(){
         double filtragem = calcularVolume() * 2;
         return filtragem;
     } 
 
    
}
