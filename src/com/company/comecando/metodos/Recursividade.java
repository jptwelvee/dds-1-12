package com.company.comecando.metodos;
import java.util.Scanner;
public class Recursividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
        imprimir("Escolha dentre os cursos abaixo: ");
        IterarEExibirPosicoesDoVetorString(cursos);
        System.out.print("O curso que você escolheu é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida
    }

    private static void IterarEExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0 ; i < vetor.length; i++) {
            imprimir("[" +i+ "]" + vetor[i]);
        }
    }

    private static void imprimirTraco() {
        imprimir("------------------------------------");
    }

    private static void imprimir(String texto) {
        System.out.println(texto);
    }

}
