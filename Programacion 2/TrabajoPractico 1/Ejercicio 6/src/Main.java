import Clases.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arrancar();
    }
    public void arrancar(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Juan", "Perez", 1234, 5));
        empleados.add(new Empleado("Ana", "Garcia", 5678, 3));
        empleados.add(new Empleado("Carlos", "Gonzalez", 9012, 7));
        empleados.add(new Empleado("Luisa", "Fernandez", 3456, 2));
        empleados.add(new Empleado("Pedro", "Martinez", 7890, 4));

        Map<String, Empleado> empleadosMap = new HashMap<>();
        for (Empleado empleado : empleados) {
            String clave = empleado.getApellido() + "," + empleado.getNombre();
            empleadosMap.put(clave, empleado);
        }

        for (Map.Entry<String, Empleado> entry : empleadosMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Empleado: " + entry.getValue());
        }
    }
}