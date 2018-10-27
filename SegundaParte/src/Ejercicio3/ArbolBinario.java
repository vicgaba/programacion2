package Ejercicio3;

/**
 * Estructura Árbol Binario
 */
public class ArbolBinario {

    private NodoABinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean vacio() {
        return this.raiz == null;
    }

      public void imprimirInOrder() {
        inOrder(this.raiz);
    }

    //// Método interno para realizar recorrido preOrden recursivo
    private void preOrder(NodoABinario nodo) {

        if (nodo == null)
            return;

        System.out.println(nodo.valor);

        preOrder(nodo.izq);
        preOrder(nodo.der);
    }

    //// Método interno para realizar recorrido inOrden recursivo
    private void inOrder(NodoABinario nodo) {

        if (nodo == null)
            return;

        inOrder(nodo.izq);
        System.out.println(nodo.valor);
        inOrder(nodo.der);
    }

    //// Método interno para realizar recorrido posOrden recuersivo
    private void posOrder(NodoABinario nodo) {

        if (nodo == null)
            return;

        posOrder(nodo.izq);
        posOrder(nodo.der);
        System.out.println(nodo.valor);
    }

    public void agregar(String valor) {
        this.raiz = agregarRecursivo(this.raiz, valor);
    }

    //// Método interno para agregar valores de forma recursiva
    private NodoABinario agregarRecursivo(NodoABinario nodo, String valor) {

        // Si el nodo es una hoja, entonces lo crear y retorna
        if (nodo == null) {
            nodo = new NodoABinario(valor);
            return nodo;
        }

        // En caso contrario, recorrer el arbol de forma recursiva
        if (valor.compareTo(nodo.valor) <= 0) {
            nodo.izq = agregarRecursivo(nodo.izq, valor);
        }
        else if (valor.compareTo(nodo.valor) > 0) {
            nodo.der = agregarRecursivo(nodo.der, valor);
        }

        // Retorna el nuevo nodo del arbol para ser unido a la raiz
        return nodo;
    }


    //// Opcional, método para inserción sin usar recursividad
    private void agregarIterativo(String valor){
        NodoABinario nuevo = new NodoABinario(valor);

        if (vacio()) {
            this.raiz = nuevo;
        }
        else {
            NodoABinario auxAnterior = null;
            NodoABinario auxActual = this.raiz;

            while (auxActual != null) {

                auxAnterior = auxActual;

                if (valor.compareTo(auxActual.valor) <= 0) {
                    auxActual = auxAnterior.izq;
                }
                else if (valor.compareTo(auxActual.valor) > 0) {
                    auxActual = auxActual.der;
                }
            }

            if (valor.compareTo(auxAnterior.valor) <= 0) {
                auxAnterior.izq = nuevo;
            }

            else if (valor.compareTo(auxAnterior.valor) > 0) {
                auxAnterior.der = nuevo;
            }
        }
    }
}