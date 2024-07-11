package BancoTeste;

public class Cliente {
    String nome;
    String cpf;

    //pertence a classe cliente
    public static int quantidadeClientes;


    public static void incrementarClientes(){
        Cliente.quantidadeClientes ++;
    }

    //construtor que implementa dados em sua criação
    Cliente(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;

        incrementarClientes();
    }


    //padrao get e set
    public void setCpf(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;

    }

    //contrutor que pede na classe main para criar objeto e depois nomear.
        Cliente() {
    }
    //construtor com apenas o nome
    Cliente(String nome) {
        this.nome = nome;

        Cliente.incrementarClientes();
    }



}
