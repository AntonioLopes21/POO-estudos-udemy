package io.github.antoniodepadua.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario t1 = new Tecnico();

        t1.setNome("Paulin, o técnico");
        t1.setSalario(4500);
        t1.setCpf("01234567891");

        t1.imprimirRemuneracao();


        Funcionario g1 = new Gerente();
        g1.setNome("Hélio, o gerente");
        System.out.println("bonificação do gerente com @Override adicional");
        g1.setSalario(5500);
        g1.setCpf("01236543123");

        g1.imprimirRemuneracao();

        //classe abstrata
//        Funcionario func = new Funcionario();

        System.out.println("Bonificação Anual\n" +
                "Gerente: " + g1.calcularBonificacaoAnual());

        System.out.println("Técnico: " + t1.calcularBonificacaoAnual());


        ConexaoBancaria conexao = new ConexaoBancaria();
        GerenciaRH gerenciaRH = new GerenciaRH(conexao);

        System.out.println("Bonificação do gerente em análise...");
        gerenciaRH.pagarBonificacaoAnual(g1);
        g1.imprimirRemuneracao();

        System.out.println("Bonificação do técnico em andamento...");
        gerenciaRH.pagarBonificacaoAnual(t1);
        t1.imprimirRemuneracao();
    }
}
