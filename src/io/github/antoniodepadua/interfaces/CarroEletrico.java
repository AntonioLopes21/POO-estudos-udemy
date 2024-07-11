package io.github.antoniodepadua.interfaces;

public interface CarroEletrico {

    int VELOCIDADEMAXIMA = 150;

    void carregarBateria();

    public static void imprimirAlgo() {
        System.out.println("fez algo");
    }

    default void fazAlgo(){
        System.out.println("faz algo default");
    }
}
