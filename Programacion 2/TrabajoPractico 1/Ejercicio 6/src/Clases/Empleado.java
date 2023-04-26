package Clases;

public class Empleado {

    protected String nombre;
    protected String apellido;
    protected int legajo;
    protected int anioTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int legajo, int anioTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.anioTrabajados = anioTrabajados;
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

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAnioTrabajados() {
        return anioTrabajados;
    }

    public void setAnioTrabajados(int anioTrabajados) {
        this.anioTrabajados = anioTrabajados;
    }

    @Override
    public String toString(){
        return  "Empleado: "+this.nombre+
                " "+this.apellido+
                " Legajo: "+this.legajo+
                " Años Trabajados: "+this.anioTrabajados;

    }
}
