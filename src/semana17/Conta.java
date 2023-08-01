package semana17;

import java.time.LocalDate;

public class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private String correntista;
    

    public Conta(int numero, String correntista) {
        this.numero = numero;
        this.correntista = correntista;
    }

    public void sacar(double valor) {
        if (valor <= saldo){
            this.saldo -= valor;
        }    
    }

    public void depositar(double valor) {
        this.saldo += valor;
       
    }

    public double calcularTarifa() {
        
    }
    
}
