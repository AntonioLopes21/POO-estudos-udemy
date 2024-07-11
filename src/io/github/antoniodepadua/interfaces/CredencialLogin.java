package io.github.antoniodepadua.interfaces;

public class CredencialLogin implements Autenticacao {


    private String login;
    private String senha;

    public CredencialLogin(String email, String senha) {
        this.login = email;
        this.senha = senha;
    }

    @Override
    public String getIdentificacao() {
        return this.login;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public boolean ifUsaSenha() {
        return true;
    }
}
