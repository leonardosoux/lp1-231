package semana17;

import java.time.LocalDate;

public class ContaSalario extends Conta {

    private Empresa empresa;

    public ContaSalario(int numero, LocalDate dataAbertura, Empresa empresa) {
        super(numero, dataAbertura);
        this.empresa = empresa;
    }

    @Override
    public double calcularTarifa() {
        return 15.0;
    }
}