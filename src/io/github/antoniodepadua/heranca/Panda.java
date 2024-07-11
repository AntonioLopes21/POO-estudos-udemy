package io.github.antoniodepadua.heranca;

public class Panda extends Animal {

    private String cor;
    private String corSecundaria;

    //acessando construtor da superclasse
    //super();
    public Panda ( int idade) {
        super("Panda", idade);

    }

    //metodo unico

    public void subirArvore() {
        System.out.println("subindo...");
    }



    public String getCor() {
        return cor;
    }

    public void  setCor(String cor) {
        this.cor = cor;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }


    public void informacoesPanda() {
        imprimirDados();
    }

}
