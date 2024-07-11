package io.github.antoniodepadua.empresa;

public class GerenciaRH {

    private ConexaoBancaria conexaoBancaria;

    public GerenciaRH(ConexaoBancaria conexaoBancaria) {
        this.conexaoBancaria = conexaoBancaria;
    }

    public void pagarBonificacaoAnual(Funcionario funcionario){
        double bonificacao = funcionario.calcularBonificacaoAnual();
        conexaoBancaria.enviarPagamento(funcionario.getcpf(),  bonificacao);
        enviarEmail();
    }


    //DUPLICAÇÃO DE CÓDIGO. USAREMOS POLIMORFISMO PARA EVITAR ISSO.
//    public void pagarBonificacaoAnual(Gerente gerente) {
//        double bonificacao = gerente.calcularBonificacaoAnual();
//        conexaoBancaria.enviarPagamento(gerente.getcpf(), bonificacao);
//        enviarEmail();
//    }
//
//    public void pagarBonificacaoAnual(Tecnico tecnico) {
//        double bonificacao = tecnico.calcularBonificacaoAnual();
//        conexaoBancaria.enviarPagamento((tecnico.getcpf()), bonificacao);
//        enviarEmail();
//    }

    private void enviarEmail() {
        System.out.println("Email enviado!");
    }
}

