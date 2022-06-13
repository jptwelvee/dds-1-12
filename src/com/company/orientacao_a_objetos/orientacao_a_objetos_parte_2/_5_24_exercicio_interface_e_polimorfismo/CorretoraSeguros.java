package com.company.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_24_exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {

    public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
        System.out.println("-----------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("-----------------------------------");
        System.out.println(objetoSeguravel.obterDescrição());
        System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("------------------------------------\n");
    }
}
