package io.github.typeSWITCh21.clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro <TIPO> {
    void salvar(TIPO objetoCadastrar);
    TIPO buscar(UUID codigo);

    void deletar(UUID codigo);

    void atualizar(TIPO objetoAtualizar);
}
