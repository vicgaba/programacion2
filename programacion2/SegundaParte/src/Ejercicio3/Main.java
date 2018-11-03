package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        // Carga un arbol en memoria y lo recorre en Profundidad
        System.out.println("---- Carga del arbol ----");
        cargar();
    }

    private static void cargar() {
        /* Se crea el siguiente arbol
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar("+");
        arbol.agregar("*");
        arbol.agregar("-");
        arbol.agregar("1");
        arbol.agregar("3");
        arbol.agregar("1");
        arbol.agregar("6");

        arbol.imprimirInOrder();

    }
}