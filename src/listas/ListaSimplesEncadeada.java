package listas;

public class ListaSimplesEncadeada{
    private No primeiro;
    private int qtde;

    public ListaSimplesEncadeada(){
        this.primeiro = null;
        this.qtde = 0;
    }

    public void inserirNoInicio(Object dado){
        No novo;
        if(!estaVazia()){
            novo = new No(dado, this.primeiro);
        } else {
            novo = new No(dado);
        }
        this.primeiro = novo;
        this.qtde++;
        System.out.println(dado + " inserido na lista!");
    }

    public void inserirNoFim(Object dado){
        No novo;
        No aux = this.primeiro;
        // Caso não tenha nenhum nó na lista. Define como o primeiro.
        if(aux == null){
            novo = new No(dado);
            this.primeiro = novo;
            // caso tenha algum nó na lista, verifica se o próximo é nulo
        } else {
            // Se o próximo for não for null, atualiza o aux
            // caso seja null, sai do while, cria o novo nó e faz o nó aux (último nó)
            // apontar para o novo nó. Assim, o novo nó fica sendo o último.
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            novo = new No(dado);
            aux.setProximo(novo);
        }
        this.qtde++;
    }


    public boolean estaVazia(){
        return (this.qtde == 0);
    }

    public void imprimir(){
        No aux = this.primeiro;

        while(aux != null){
            System.out.println(aux.getDado().toString());
            aux = aux.getProximo();
        }
    }

    public void imprimirRecursivo(No no){
        if(no != null) {
            System.out.println(no.getDado());
            if (no.getProximo() != null) {
                imprimirRecursivo(no.getProximo());
            }
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public No getPrimeiro(){
        return this.primeiro;
    }
}