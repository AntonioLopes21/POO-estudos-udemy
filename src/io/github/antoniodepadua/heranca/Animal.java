package io.github.antoniodepadua.heranca;

/**
 * public
 * private
 * package/ default
 * protected
 */
public class Animal {

    private String nome;
    private int idade;


    public Animal() {

    }

    //construtor com nome obrigatório
    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    ///metodos

    public void andar() {
        System.out.println("andando...");
    }

    public void comer() {
        System.out.println("comendo...");
    }

    public void dormir() {
        System.out.println("dormindo...");
    }


    protected void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + "\n");
    }


}
