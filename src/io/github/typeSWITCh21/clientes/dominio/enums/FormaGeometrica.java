package io.github.typeSWITCh21.clientes.dominio.enums;

public enum FormaGeometrica {
    QUADRADO(4, "Quadrado"),
    CIRCULO(0, "Círculo"),
    TRIANGULO(3, "Triângulo"),
    RETANGULO(4, "Retângulo");

    private final int lados;
    private final String descricao;

    //quem vai usar esse construtor é a jvm
    FormaGeometrica(int lados, String descricao) {
        this.lados = lados;
        this.descricao = descricao;
    }

    public int getLados() {
        return this.lados;
    }


}
