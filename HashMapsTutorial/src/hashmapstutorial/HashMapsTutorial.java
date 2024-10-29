package hashmapstutorial;

import java.util.HashMap;
import java.util.Map;

public class HashMapsTutorial {

    public static void main(String[] args) {
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        // Creamos algunos empleados
        mapaEmpleados.put(1523,"Suscribite a Luisus");
        mapaEmpleados.put(1524, "Yo soy Luis");
        mapaEmpleados.put(1525, "Juan Perez");
        
        //Esto es para confirmar si existe una clave
        boolean confirmar = mapaEmpleados.containsKey(1523);
        
        if(confirmar == true){
            System.out.println("El valor buscado si esta");
            
        }else{
            System.out.println("El valor no se encuentra");
        }
        
        //Ambos devuelven listas de:
        //Claves
        System.out.println(mapaEmpleados.keySet());
        //Valores
        System.out.println(mapaEmpleados.values());
        
        
        //Esto devuelve el valor que se encuentra en esa clave
        String nombre = mapaEmpleados.get(1524);
        System.out.println("El empleado buscado es: "+nombre);
        
        //Ahora eliminaremos por clave
        mapaEmpleados.remove(1527);
        //Si el valor no está, no dara un error por eso no uses try catch
        
    }
    
}
