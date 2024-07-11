package Carro;

public class Carro {
    
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitro;
    int combustivelCompleto;

    public Carro(int cavalos, String cor, String transmissao, String montadora, int capacidadeTanque, int combustivel, int kmPorLitro, int combustivelCompleto) {
        this.cavalos = cavalos;
        this.cor = cor;
        this.transmissao = transmissao;
        this.montadora = montadora;
        this.capacidadeTanque = capacidadeTanque;
        this.combustivel = combustivel;
        this.kmPorLitro = kmPorLitro;
        this.combustivelCompleto = combustivelCompleto;
    }

    void abastecer(int litros) {

        System.out.println("Seu tanque está em: " + combustivel);
        if(combustivel + litros < capacidadeTanque) {
            combustivel = combustivel + litros;
            System.out.println("você acabou de abastecer " + litros);

        } else if(combustivel + litros == capacidadeTanque) {
            System.out.println("O seu tanque está cheio!");
            System.out.println("A capacidade do seu tanque é " + capacidadeTanque);
        }

        else {
            System.out.println("você não pode abastecer essa quantidade pois pode transbordar");
            combustivelCompleto = capacidadeTanque - combustivel;
            System.out.println("você precisa de: " + combustivelCompleto + " para completar o tanque");
            System.out.println("A capacidade do seu tanque é " + capacidadeTanque);
        }

    }
    
    int autonomiaCombustivel() {
        int autonomia = kmPorLitro * combustivel;
        return autonomia;
    }
    
}
