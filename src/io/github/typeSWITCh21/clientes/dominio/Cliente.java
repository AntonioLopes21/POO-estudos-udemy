package io.github.typeSWITCh21.clientes.dominio;

import io.github.typeSWITCh21.clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Cliente {

    //codigo aleatorio
    private UUID codigoCliente;

    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private byte[] foto;


    //construtor já cria codigo unico para cada cliente criado
    public Cliente() {
        this.codigoCliente = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Info. CLIENTE:\n" +
                "Cliente{" +
                "\n" +
                "codigoCliente=" + codigoCliente +
                "\n nome='" + nome + '\'' +
                "\n cpf='" + cpf + '\'' +
                "\n sexo=" + sexo +
                "\n foto=" + Arrays.toString(foto) +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;

        return codigoCliente.equals(cliente.codigoCliente) && nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && sexo == cliente.sexo;
    }

    @Override
    public int hashCode() {
        int result = codigoCliente.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + cpf.hashCode();
        result = 31 * result + Objects.hashCode(sexo);
        return result;
    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cliente cliente)) return false;
//        return Objects.equals(codigoCliente, cliente.codigoCliente) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && sexo == cliente.sexo && Objects.deepEquals(foto, cliente.foto);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(codigoCliente, nome, cpf, sexo, Arrays.hashCode(foto));
//        result = 31 * result + Arrays.hashCode(foto);
//        return result;
//    }
}
