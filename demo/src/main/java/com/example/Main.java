package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila(5);
        Pilha pilha = new Pilha(5);

        int opcaoEstrutura, opcaoAcao;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Escolha a estrutura de dados ===");
            System.out.println("1 - Fila");
            System.out.println("2 - Pilha");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcaoEstrutura = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcaoEstrutura == 0) {
                continuar = false;
                break;
            }

            System.out.println("\n=== Escolha a ação ===");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Listar nomes");
            System.out.println("4 - Mostrar tamanho");
            System.out.print("Opção: ");
            opcaoAcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcaoEstrutura) {
                case 1: // Fila
                    switch (opcaoAcao) {
                        case 1:
                            System.out.print("Digite um nome para adicionar na FILA: ");
                            String nomeFila = sc.nextLine();
                            try {
                                fila.adicionar(nomeFila);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            fila.remover();
                            break;
                        case 3:
                            fila.listarNomes();
                            break;
                        case 4:
                            fila.listarTamanho();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2: // Pilha
                    switch (opcaoAcao) {
                        case 1:
                            System.out.print("Digite um nome para adicionar na PILHA: ");
                            String nomePilha = sc.nextLine();
                            try {
                                pilha.adicionar(nomePilha);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            pilha.remover();
                            break;
                        case 3:
                            pilha.listarNomes();
                            break;
                        case 4:
                            pilha.listarTamanho();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                default:
                    System.out.println("Estrutura inválida.");
            }

            // 🔹 Sempre mostrar o estado atual das duas estruturas
            System.out.println("\n=== ESTADO ATUAL ===");
            System.out.println("Fila:");
            fila.listarNomes();
            System.out.println("Tamanho da fila: ");
            fila.listarTamanho();

            System.out.println("Pilha:");
            pilha.listarNomes();
            System.out.println("Tamanho da pilha: ");
            pilha.listarTamanho();
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}
