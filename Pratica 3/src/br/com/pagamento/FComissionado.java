package br.com.pagamento;

public class FComissionado extends Funcionario{
    private double percentual;
    private double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void calcularProventos(){
        System.out.println("Nome: "
                +getNome() +" Matricula: "
                +getMatricula() +" Proventos: "
        +(getSalario()+getPercentual()+getVendas()));
    }
}
