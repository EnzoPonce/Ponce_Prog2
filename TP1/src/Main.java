import java.util.ArrayList;
import java.util.List;
import Clases.Persona;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }
    public void iniciar(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("Enzo");
        nombres.add("Fran");
        nombres.add("Juli");
        nombres.add("Marcos");

        List<String> apellidos = new ArrayList<>();
        apellidos.add("Balda");
        apellidos.add("Ponce");
        apellidos.add("Espinola");
        apellidos.add("Castillo");
        apellidos.add("Navaja");



        List<Persona> personas = new ArrayList<>();
        for(int i=0;i<5;i++){
            Persona iterador = new Persona();
            iterador.setNombre(nombres.get(i));
            iterador.setApellido(apellidos.get(i));
            iterador.setEdad((int) (Math.random() * ( 50 - 20) ) + 20);
            personas.add(iterador);
        }


        int contador = 0;
        int variable = 0;
        for(Persona elemento: personas){
            if(elemento.getEdad() > variable){
                variable = elemento.getEdad();
                contador = personas.indexOf(elemento);
            }
            System.out.println(elemento);
        }
        System.out.println("\nLa persona mas grande es:\n" + personas.get(contador));












    }

}