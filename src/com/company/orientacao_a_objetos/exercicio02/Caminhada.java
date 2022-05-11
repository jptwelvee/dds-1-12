package com.company.orientacao_a_objetos.exercicio02;
public class Caminhada {
    public void andar(Pessoa pessoa) {
        System.out.println("Eu \"" + pessoa.nome + "\""
                + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
    }
}
