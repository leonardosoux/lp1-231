package semana17;

import java.time.LocalDate;

public class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
   
    

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa) {
        this.numero = numero;
        this.dataAbertura = LocalDate.now();
        this.saldo = saldo;
        this.tarifa = tarifa;
    }

    public Conta(int numero, LocalDate dataAbertura) {
        this.numero = numero;
        this.dataAbertura = LocalDate.now();
        this.saldo = 0.0;
        this.tarifa = 0.0;
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
