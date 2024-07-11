package BancoTeste;

public class MainSistemaBanco {
    public static void main(String[] args) {
        Cliente painho = new Cliente("juremir", "15724424466");

        System.out.println(painho.nome + "\n" + painho.cpf );


        Conta contaPainho = new Conta(painho, 1000, 540.55);

        //apos implementar o construtor não precisa mais disso.
        contaPainho.titular = painho;
        contaPainho.numero = 1000;
        contaPainho.modificarSaldo(540.55); //= 540.55; já não se pode mais alterar diretamente o saldo.

        Banco sistemaBancario = new Banco();

        System.out.println("Saldo antes do depósito: ");
        contaPainho.imprimirSaldo();


        System.out.println("Depositando 100 conto para juremir ");
        sistemaBancario.depositar(contaPainho, 100);

        System.out.println("\n");
        System.out.println("Saldo após o depósito: ");
        contaPainho.imprimirSaldo();

        //metodo sacar
        System.out.println("Sacando 40 reais e 55 cents");
        sistemaBancario.sacar(contaPainho, 40.55);

        System.out.println("Após saque: ");
        contaPainho.imprimirSaldo();

        System.out.println("\n");
        System.out.println("Após saque sem valor: ");
        sistemaBancario.sacar(contaPainho, 700);



        Cliente iranzin = new Cliente("iranzin", "10000000001");



        Conta contaIranzin = new Conta(iranzin, 2000, 0);
//        contaIranzin.titular = iranzin;
//        contaIranzin.numero = 2000;
//        contaIranzin.saldo = 0;

        System.out.println("Saldo antes da transferência: ");
        contaIranzin.imprimirSaldo();
        contaPainho.imprimirSaldo();
        System.out.println("\n");

        System.out.println("Transferindo 120 reais para iranzin");
        sistemaBancario.transferir(contaPainho, contaIranzin, 120.55);

        contaIranzin.imprimirSaldo();
        contaPainho.imprimirSaldo();

        

        //aqui mostra quantos clientes foram cadastrados
        System.out.println("quantidade de clientes: " + Cliente.quantidadeClientes);





        //ponteiro que está apontando para o mesmo espaço de memória do objeto painho
        //Cliente outroPonteiroPainho = painho;

        //outroPonteiroPainho.nome = "Pauliiiiiin";
        //System.out.println(painho.nome);


    }
}
