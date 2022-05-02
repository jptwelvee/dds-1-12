package com.company.comecando.metodos;
import java.util.Scanner;
public class Recursividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        imprimir("Escolha dentre os cursos abaixo: ");
        IterarEExibirPosicoesDoVetorString(cursos);
    }

    private static void imprimirTraco() {
        imprimir("------------------------------------");
    }

    private static void imprimir(String texto) {
        System.out.println(texto);
    }

}
