package io.github.antoniodepadua.empresa;

public abstract class Funcionario {
//variaveis
    private String nome;
    private String cpf;
    private double salario;

//construtores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//metodos

    //metodo abstrato a seguir
    public abstract double calcularBonificacaoAnual();
    public double calcularBonificacao() {
         return (salario / 10) + 50;
        }

    public void imprimirRemuneracao() {

        double bonificacao = this.calcularBonificacao();
        double remuneracao = salario + bonificacao;
        //        double remuneracao = salario + this.calcularBonificacao();
        System.out.println("Remuneração do funcionário: " + nome + " é: " + remuneracao);
    }



}
