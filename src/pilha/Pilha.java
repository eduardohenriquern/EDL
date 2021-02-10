package pilha;

import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;

public class Pilha {
    private int pilha[];
    private int topo = -1;
    private int capacidade;

    public Pilha(int capacidade) {
        this.pilha = new int[capacidade];
        this.capacidade = capacidade;
    }

    public void empilhar(int dado) throws PilhaCheiaException {
        if(!estaCheia()){
            this.pilha[++this.topo] = dado;
            System.out.println("Elemento: " + dado + " inserido!");
        } else {
            throw new PilhaCheiaException("Pilha cheia! Elemento: "
                    + dado + " não inserido!");
        }
    }

    public void desempilhar() throws PilhaVaziaException{
        if(!estaVazia()){
            System.out.println("Elemento: " + this.pilha[topo] + " removido!");
            topo--;
        } else {
            throw new PilhaVaziaException("A Pilha está Vazia!");
        }
    }

    public boolean estaCheia(){
        return (capacidade - 1 == topo);
    }

    public boolean estaVazia(){
        return (topo < 0);
    }

    public void imprimir() throws PilhaVaziaException{
        if (!estaVazia()){
            int i = topo;
            while (i >= 0) {
                System.out.println(this.pilha[i]);
                i--;
            }
        } else {
            throw new PilhaVaziaException("A Pilha está Vazia!");
        }
    }
}
