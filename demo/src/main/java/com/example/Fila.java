package com.example;

public class Fila {
    private String[] nomes;
    private int tamanhoMaximo;
    private int tamanhoArray;

    public Fila(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.nomes = new String[tamanhoMaximo];
        this.tamanhoArray = 0;
    }

    public void adicionar(String nome) {
        if (tamanhoArray >= tamanhoMaximo) {
            throw new IllegalStateException("Não é possível adicionar mais nomes: limite do array atingido.");
        }
        nomes[tamanhoArray] = nome;
        tamanhoArray++;
    }

    public void listarNomes() {
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println(nomes[i]);
        }
    }

    public void listarTamanho(){
        System.out.println(tamanhoArray);
    }

    public void remover(){
        if(tamanhoArray == 0) {
            System.out.println("Sobra nada pro arrayzinho");
        }

        for(int i = 0; i < tamanhoArray; i++) {
            nomes[i] = nomes[i + 1];
        }

        nomes[tamanhoArray - 1] = null;
        tamanhoArray--;
    }
}
