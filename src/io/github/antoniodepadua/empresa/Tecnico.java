package io.github.antoniodepadua.empresa;

public class Tecnico extends Funcionario{
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario()*2;
    }


}
