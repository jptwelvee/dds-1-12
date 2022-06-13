package com.company.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel{

    private double anoFabricacao;
    private double valorMercado;

    public Carro(double anoFabricacao, double valorMercado) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescrição() {
        return "Carro ano " + anoFabricacao + " com valor de mercado "
                 + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }
}
