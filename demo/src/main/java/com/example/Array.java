package com.example;

public class Array {
    private String[] nomes;
    private int tamanhoMaximo;
    private int quantidadeAtual;

    public Array(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.nomes = new String[tamanhoMaximo];
        this.quantidadeAtual = 0;
    }

    public void adicionar(String nome) {
        if (quantidadeAtual >= tamanhoMaximo) {
            throw new IllegalStateException("Não é possível adicionar mais nomes: limite do array atingido.");
        }
        nomes[quantidadeAtual] = nome;
        quantidadeAtual++;
    }

    public void listarNomes() {
        for (int i = 0; i < quantidadeAtual; i++) {
            System.out.println(nomes[i]);
        }
    }

    public void listarTamanho(){
        System.out.println(quantidadeAtual);
    }

    public void remover(String nome) {
        for (int i = 0; i < quantidadeAtual; i++){
            if (nomes[i].equals(nome)) {
                nomes[i] = null;
            }
        }
        System.out.println("Não foi removido nenhum nome, pois o mesmo não foi encontrado.");
    }

    public void listarNome(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < quantidadeAtual; i++){
            if (nomes[i] != null && nomes[i].equals(nome)) {
                System.out.println("Nome pesquisado: " + nomes[i]);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Nome nao encontrado.");
        }
    }


}