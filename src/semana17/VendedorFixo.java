package semana17;

public class VendedorFixo extends Vendedor {

    private double salario;

    public VendedorFixo(String nome, double vendas, double comissao, double salario) {
        super(nome, vendas, comissao);
        this.salario = salario;
    }
    
    @Override
    public double obeterSalario() {
        return (vendas * (comissao/100)) + salario;
    }
}
