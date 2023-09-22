package br.com.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ZAP - 8492", 2012);
        v1.exibirDados();

        Caminhao c1 = new Caminhao("PAC - 2369", 2006, 4);
        c1.exibirDados();

        Onibus o1 = new Onibus("KEK - 3420",2023,44);
        o1.exibirDados();
    }
}
