package BancoTeste;

public class Conta {
    Cliente titular;
    int numero;

    private double saldo;


    //construtor
    Conta(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;

        if(saldo >=0) {
            this.saldo = saldo;
        }
    }

    //para acessar o saldo
    public void modificarSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não foi alterado. valor negativo");
        }
        }



    public double obterSaldo() {
        return this.saldo;
    }



void imprimirSaldo() {
    System.out.println("Saldo atual para a conta: " + this.numero + " = " + this.obterSaldo() + " de -> " + this.titular.nome);
                    }
}



