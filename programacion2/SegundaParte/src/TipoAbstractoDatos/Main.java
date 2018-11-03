package TipoAbstractoDatos;

public class Main {
    public static void main(String[] args){
        Universidad u = new Universidad();
        u.construir();
        u.arr[0].setNombre("Victor");
        System.out.println(u.arr[0].toString());
        Universidad u1 = new Universidad();
        //u1.alu.setNombre("Cacho"));

    }
}
