package TipoAbstractoDatos;

public class Universidad {

    public Alumno[] arr = new Alumno[3];
    public Alumno alu;

    public void construir(){
        for(int i=0; i<arr.length;i++){
            arr[i]= new Alumno();
        }
    }
}
