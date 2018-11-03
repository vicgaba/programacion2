package Nodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NodoA nodoA = new NodoA("A");
        NodoA nodoB = new NodoA("B");
        NodoA nodoC = new NodoA("C");
        NodoA nodoD = new NodoA("D");
        NodoA nodoE = new NodoA("E");
        NodoA nodoF = new NodoA("F");
        NodoA nodoG = new NodoA("G");
        NodoA nodoH = new NodoA("H");
        NodoA nodoI = new NodoA("I");
        NodoA nodoJ = new NodoA("J");

        nodoA.hijoDer = nodoC;
        nodoA.hijoIzq = nodoB;
        nodoB.hijoIzq = nodoD;
        nodoB.hijoDer = nodoE;
        nodoC.hijoIzq = nodoF;
        nodoC.hijoDer = nodoG;
        nodoD.hijoIzq = nodoH;
        nodoD.hijoDer = nodoI;
        nodoE.hijoIzq = nodoJ;

        Arbol arbol = new Arbol();
        arbol.iniciar(nodoA);

        arbol.inOrder(nodoA);
        /*Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        String valor = s.next();
        while(!valor.equals("-1")){
            lista.agregar(valor);
            valor = s.next();
        }
        lista.imprimir();
        lista.eliminarUltimo();
        lista.imprimir();*/
    }
}