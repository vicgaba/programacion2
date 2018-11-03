package Nodos;

public class Arbol {
    private NodoA raiz;

    public void iniciar(NodoA raiz){
        this.raiz = raiz;
    }
    public void inOrder(NodoA nodo) {
        if (nodo == null)
            return;
        inOrder(nodo.hijoIzq);
        System.out.println(nodo.valor);
        inOrder(nodo.hijoDer);
    }
}
