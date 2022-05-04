package com.company.programacao_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Filipe";
        cliente.ultimoNome = "Vaz";
        cliente.telefone = "27999999999";
        cliente.email = "filipe@filipe.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "27999990000";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
    }
}
