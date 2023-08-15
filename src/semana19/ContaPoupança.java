package semana19;

import java.time.LocalDate;

public class ContaPoupança extends Conta{
    
    private LocalDate aniversario;

    public ContaPoupança(int numero, double tarifa, LocalDate aniversario, Correntista correntista){
        super(numero, tarifa, correntista);
        this.aniversario = aniversario;
    }

    @Override

    public double calcularTarifa(){
        return this.tarifa;
    }
}