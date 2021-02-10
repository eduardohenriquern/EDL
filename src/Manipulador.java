import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;
import listas.ListaSimplesEncadeada;
import listas.No;
import pilha.Pilha;

public class Manipulador {
    public static void main(String[] args) {
//        ListaSimplesEncadeada lista = new ListaSimplesEncadeada();
//        No um = new No(1);
//        No dois = new No(2);
//        No tres = new No(3);
//        lista.inserirNoFim(um);
//        lista.inserirNoFim(dois);
//        lista.inserirNoFim(tres);
//
//        lista.imprimir();

        Pilha pilha = new Pilha(5);
        try {
            pilha.empilhar(5);
            pilha.empilhar(3);
            pilha.desempilhar();
            pilha.empilhar(6);
            pilha.empilhar(2);
            pilha.desempilhar();
            pilha.empilhar(1);
            pilha.empilhar(7);
            pilha.empilhar(10);

            pilha.imprimir();

            pilha.empilhar(12);

        } catch (PilhaCheiaException | PilhaVaziaException ex){
            System.out.println(ex.getMessage());
        }

    }
}
