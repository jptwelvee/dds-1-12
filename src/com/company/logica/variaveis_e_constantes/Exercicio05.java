package com.company.logica.variaveis_e_constantes;

//transforme o valor 70 em uma constante

import java.util.Scanner;

public class Exercicio05 {
    private static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua nota: ");
        Double notaDoAluno = scanner.nextDouble();
        Boolean passouDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;
        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação.");
        }
        scanner.close();
    }
}
