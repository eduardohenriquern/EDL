package listas;

public class No {
    private Object dado;
    private No proximo;

    public No(Object d, No prox){
        this.dado = d;
        this.proximo = prox;
    }

    public No(Object d){
        this.dado = d;
    }

    public void setProximo(No prox){
        this.proximo = prox;
    }

    public No getProximo(){
        return this.proximo;
    }

    public Object getDado(){
        return this.dado;
    }

}