package io.github.antoniodepadua.empresa;

public class Gerente extends Funcionario{

    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();

        double remuneracaoGerente = bonificacaoPadrao + 500;

        return remuneracaoGerente;
    }


    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario() * 3;
        //nao é obrigatorio usar o super aqui
    }
}
