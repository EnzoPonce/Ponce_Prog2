package Clases;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        String respuesta = "\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad;
        return respuesta;
    }
}

