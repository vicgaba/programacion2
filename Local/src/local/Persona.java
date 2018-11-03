package local;

import java.time.LocalDate;

public class Persona {
    private static int id;
    private String name;
    private LocalDate birthDay;

    public Persona(String name){
        this.setId(++id);
        this.setName(name);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Persona.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.getName() + " Id: "+this.getId();
    }
}
