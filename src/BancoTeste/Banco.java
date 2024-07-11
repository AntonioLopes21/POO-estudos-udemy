package BancoTeste;

public class Banco {

    void depositar(Conta conta, double valor) {
        double saldoAtual = conta.obterSaldo();
        double novoSaldo = saldoAtual + valor;

        conta.modificarSaldo(novoSaldo);
    }

    void sacar(Conta conta, double valor) {

        double saldoAtual = conta.obterSaldo();
        double novoSaldo = saldoAtual - valor;

        if(novoSaldo < 0) {
            System.out.println("Você não possui esse valor para saque. Saldo: " + saldoAtual);
        } else {
            conta.modificarSaldo(novoSaldo);
            System.out.println("Saque efetuado com sucesso!");
        }

    }

    void transferir(Conta contaOrigem, Conta contaDestino, double valor){
        double saldoAtualOrigem = contaOrigem.obterSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if(novoSaldoOrigem < 0) {
            System.out.println("Não é possível sacar esse valor. Saldo insuficiente: consulte seu saldo: " + saldoAtualOrigem);
        } else {
            contaOrigem.modificarSaldo(novoSaldoOrigem);
            System.out.println("Saque realizado com sucesso!");

            double novoSaldoDestino = contaDestino.obterSaldo() + valor;
            contaDestino.modificarSaldo(novoSaldoDestino);
        }
    }
}
