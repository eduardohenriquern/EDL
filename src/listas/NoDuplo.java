package listas;

public class NoDuplo {
    private Object dado;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public NoDuplo(Object d, NoDuplo prox, NoDuplo ant){
        this.dado = d;
        this.proximo = prox;
        this.anterior = ant;
    }

    public NoDuplo(Object d, NoDuplo prox){
        this.dado = d;
        this.proximo = prox;
    }

    public NoDuplo(Object d){
        this.dado = d;
    }

    public void setProximo(NoDuplo prox){
        this.proximo = prox;
    }

    public NoDuplo getProximo(){
        return this.proximo;
    }

    public Object getDado(){
        return this.dado;
    }

    public NoDuplo getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}