package io.github.typeSWITCh21.clientes.dominio.enums;

import io.github.typeSWITCh21.clientes.dominio.Cliente;

public class Geometria {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.RETANGULO;
        int ladosRetangulo = formaGeometrica.getLados();
        System.out.println(ladosRetangulo);


        Object formaGeometrica2 = FormaGeometrica.QUADRADO;
        Cliente cliente = new Cliente();
        cliente.setNome("Paulin");
        cliente.setCpf("123");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCodigoCliente((cliente.getCodigoCliente() ));
        cliente2.setNome("Paulin");
        cliente2.setCpf("123");
        cliente2.setSexo(TipoSexo.M);


//        System.out.println(cliente.hashCode());
//        System.out.println(cliente2.hashCode());
//        System.out.println(cliente.toString());

//        Class<? extends Cliente> aClass = cliente.getClass();
//
//        System.out.println(aClass.getName());
//        System.out.println(cliente.hashCode());


        int numero1 = 10;
        int numero2 = 10;

        System.out.println("Eles são iguais?" + (numero1 == numero2));
        //não se compara objeto

        System.out.println("cliento" == "cliento");


        String nome = new String("Pauliiin");
        String nome1= new String("Pauliiin");
        System.out.println("\n são iguais? " + (cliente.equals(cliente2)));



        //teste de comparação

    }
}
