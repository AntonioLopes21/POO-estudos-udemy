package io.github.antoniodepadua.interfaces;

public class Main {
    public static void main(String[] args) {


        CarroHibrido carroHibrido = new CarroHibrido();
        carroHibrido.fazAlgo();
        carroHibrido.abastecer();

        CarroEletrico.imprimirAlgo();


        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("Paulin@2024.1", "1234");
        boolean isAutenticado = autenticador.autenticar(email);

        Autenticacao usuario = new CredencialLogin("username", "password");
       boolean isUsuarioAutenticado = autenticador.autenticar(usuario);

        Autenticacao biometrica = new CredencialBiometrica(new byte[]{});
        boolean isBiometriaAutenticada = autenticador.autenticar(biometrica);

    }
}
