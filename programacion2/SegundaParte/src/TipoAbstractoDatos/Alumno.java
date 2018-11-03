package TipoAbstractoDatos;

public class Alumno {
    private String nombre;

    public Alumno(String nombre){
        this.setNombre(nombre);
    }

    public Alumno() {

    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String toString(){
        return ("nombre: "+this.getNombre());
    }
}
