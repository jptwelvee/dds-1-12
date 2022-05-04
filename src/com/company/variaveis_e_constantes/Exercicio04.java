package com.company.variaveis_e_constantes;

        /*Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. Com essas
        informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

        Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10
        unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica
         desconto algum.

        Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
        você multiplica o subtotal pelo próprio percentual e divide tudo por 100.

        Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o
         valor total final e deverá ser apresentado no console.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.println("Digite a quatidade: ");
        Integer quantidade = scanner.nextInt();
        Double valorSubtotal = valorProduto * quantidade;
        Boolean quantidadeMaiorOuIgualDez = quantidade >= 10;
        Double percentualDesconto = 0.0;
        if (quantidadeMaiorOuIgualDez) {
            percentualDesconto = 10.0;
        }
        Double desconto = valorSubtotal * percentualDesconto / 100;
        Double valorTotalComDesconto = valorSubtotal - desconto;
        System.out.println("Valor total: " + valorTotalComDesconto);
        scanner.close();
    }
}
