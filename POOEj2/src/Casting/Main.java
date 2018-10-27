package Casting;

public class Main {
    public static void main(String[] args) {
       Vehiculo v1 = new Vehiculo();
       Auto a1 = new Auto();
       Barco b1 = new Barco();

       imprimir(v1);
       imprimir(a1);
       imprimir(b1);

    }
    public static void imprimir (Vehiculo x) {
        System.out.println(x.getNombre());
    }
}