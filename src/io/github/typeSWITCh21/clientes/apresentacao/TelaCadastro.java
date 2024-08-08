package io.github.typeSWITCh21.clientes.apresentacao;

import io.github.typeSWITCh21.clientes.dominio.Cliente;
import io.github.typeSWITCh21.clientes.dominio.enums.TipoSexo;
import io.github.typeSWITCh21.clientes.logicanegocio.Cadastro;
import io.github.typeSWITCh21.clientes.logicanegocio.LogicaCadastroClienteFake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo; //opcoes para selecionar

    private JButton botaoSalvar;


    public TelaCadastro() {
        construirTela();
    }

    private void construirTela(){
        setSize(600, 500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();

    }
    //dividir em 3 métodos
    //facilita manutenção
    private void adicionarCampos() {
        labelNome = new JLabel("Nome");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);

        labelCpf = new JLabel("CPF");
        labelCpf.setBounds(20,60,200,20);
        getContentPane().add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20, 80, 200, 20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo");
        labelSexo.setBounds(20,100,200,20);
        getContentPane().add(labelSexo);

        TipoSexo[] tiposSexo = {null, TipoSexo.M, TipoSexo.F, TipoSexo.O};
        campoSexo = new JComboBox<>(tiposSexo);
        campoSexo.setBounds(20,120,200,20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes() {
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20,160,100,20);

        //classe Anônima
        ActionListener acaoBotaoSalvar = this.botaoSalvarActionListener();
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);
    }

    private void adicionarComponentesFoto() {

    }

    private ActionListener botaoSalvarActionListener() {
        return new ActionListener() {
            //classe anonima
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo( (TipoSexo) campoSexo.getSelectedItem());


                Cadastro<Cliente> logicaCadastro = new LogicaCadastroClienteFake();
                logicaCadastro.salvar(cliente);

            }
        };
    }

}
