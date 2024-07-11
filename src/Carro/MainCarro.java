package Carro;

import Carro.Carro;

public class MainCarro {
    public static void main(String[] args) {


        Carro gol = new Carro(150, "verde", "manual", "vowkswagen", 50, 10, 10, 55);



        gol.abastecer(12);
        gol.abastecer(15);
        gol.abastecer(20);
        gol.abastecer(13);

        gol.autonomiaCombustivel();


        System.out.println("Autonomia veículo " + gol.autonomiaCombustivel());

    }
}
