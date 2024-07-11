package io.github.antoniodepadua.interfaces;

public class CredencialBiometrica implements Autenticacao{

    private byte[] fotoRosto;

    //construtor

    public CredencialBiometrica(byte[] fotoRosto) {
        this.fotoRosto = fotoRosto;
    }

    @Override
    public String getIdentificacao() {
        return new String(this.fotoRosto);
    }

    @Override
    public String getSenha() {
        return null;
    }

    @Override
    public boolean ifUsaSenha() {
        return false;
        //nao vai usar senha
    }
}
