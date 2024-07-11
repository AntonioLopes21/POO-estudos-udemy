package io.github.antoniodepadua.heranca;

public class Hipopotamo extends Animal {

    public int forcaMordida;

    public Hipopotamo( int idade, int forcaMordida) {
        super("Hipopótamo", idade);
        this.forcaMordida = forcaMordida;
    }

    //metodo

    public void ficarNaAgua() {
        System.out.println("está na água...");
    }

    public int getForcaMordida() {

        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }

    public void info() {
        imprimirDados();
    }
}
