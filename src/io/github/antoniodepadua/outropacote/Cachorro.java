package io.github.antoniodepadua.outropacote;

import io.github.antoniodepadua.heranca.Animal;

public class Cachorro extends Animal{

    String nome;
    int idade;

    public Cachorro( int idade) {
        super("Cachorro", idade);
    }

    public void latir() {
       imprimirDados();
    }


}
