package listas;

public class ListaDuplaEncadeada {
    private NoDuplo primeiro;
    private int qtde;

    public ListaDuplaEncadeada(){
        this.primeiro = null;
        this.qtde = 0;
    }

    public void inserirNoInicio(Object dado){
        NoDuplo novo;
        if(!estaVazia()){
            novo = new NoDuplo(dado, this.primeiro);
            this.primeiro.setAnterior(novo);
        } else {
            novo = new NoDuplo(dado);
        }
        this.primeiro = novo;
        this.qtde++;
    }

    public void imprimir(NoDuplo no) {
        if (no != null) {
            System.out.println(no);
            if (no.getProximo() != null) {
                imprimir(no.getProximo());
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public boolean estaVazia(){
        return (this.qtde == 0);
    }

    public NoDuplo getPrimeiro() {
        return primeiro;
    }
}
