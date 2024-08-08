package io.github.typeSWITCh21.clientes.dominio.enums;

public enum TipoSexo {
    M("Masculino"),
    F("Feminino"),
    O("Paulin");

    private final String descricao;

    TipoSexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

