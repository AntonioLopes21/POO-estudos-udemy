package io.github.antoniodepadua.heranca;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda( 45);
//        panda.setNome("Panda pauliin");
//        panda.setIdade(21);

        panda.imprimirDados();

        Hipopotamo hipo = new Hipopotamo(25, 100);
        hipo.setNome("Hipo iranzin");
//        hipo.setIdade(22);
        hipo.imprimirDados();

    }
}
