package io.github.typeSWITCh21.clientes.logicanegocio;

import io.github.typeSWITCh21.clientes.dominio.Cliente;

import javax.swing.*;
import java.util.UUID;

public class LogicaCadastroClienteFake implements Cadastro<Cliente> {


    @Override
    public void salvar(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente);

    }

    @Override
    public Cliente buscar(UUID codigo) {
        return null;
    }

    @Override
    public void deletar(UUID codigo) {

    }

    @Override
    public void atualizar(Cliente objetoAtualizar) {

    }
}
