package br.com.pagamento;

public class Main {
    public static void main(String[] args) {
        FPadrao p1 = new FPadrao(123,"Jorge",1500);
        p1.calcularProventos();

        FComissionado c1 = new FComissionado(213,"Paulo",1300,20,400);
        c1.calcularProventos();

        FProdutividade pr1 = new FProdutividade(321,"Carlos", 2000,30,50);
        pr1.calcularProventos();
    }
}
