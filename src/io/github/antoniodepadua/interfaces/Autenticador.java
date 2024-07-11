package io.github.antoniodepadua.interfaces;

public class Autenticador {
    //classe concreta
    public boolean autenticar(Autenticacao autenticacao) {
        autenticacao.getIdentificacao();

        if(autenticacao.ifUsaSenha()) {
            String senha = autenticacao.getSenha();
            //pego a senha desse usuario na base atraves da identificacao
            //para verificar se é a mesma
            return true;
        } else {
            //buscar pessoa no bd
            //se encontrou a pessoa
            return true;
        }
    }
}
