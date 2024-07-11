package io.github.antoniodepadua.outropacote;

import io.github.antoniodepadua.heranca.Animal;
import io.github.antoniodepadua.heranca.Hipopotamo;
import io.github.antoniodepadua.heranca.Panda;

public class Main {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro(14);

//
//        dog.nome = "jamelão";
//        dog.idade = 23;

        dog.latir();

        Panda panda = new Panda(21);
        panda.informacoesPanda();

        Hipopotamo hipo = new Hipopotamo(23, 100);
        hipo.info();

    }
}
