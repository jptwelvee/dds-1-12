package com.company.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_24_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel{

    private int areaConstruida;
    private double valorMercado;

    public Imovel(int areaConstruida, double valorMercado) {
        this.areaConstruida = areaConstruida;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescrição() {
        return "Imóvel com área construída de " + areaConstruida + "m2 e valor de mercado "
                + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }
}
