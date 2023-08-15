package semana17;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private LocalDate aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, LocalDate aniversario) {
        super(numero, dataAbertura);
        this.aniversario = aniversario;
    }

    @Override
    public double calcularTarifa() {
        return 5.0;
    }
    
}
