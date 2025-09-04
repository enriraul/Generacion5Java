/*

HashMap <k,v>

k = String, Etiqueta

k != null: Las claves(key) no pueden ser elementos vacios, es
necesario especificar una etiqueta.

"Pedro", 192392
"Ana", 189384


*/

import java.util.HashMap;
import java.util.Map;

public class Hashmap{

    public static void main(String[] args) {
        //Sintaxis: Map <tipo K, tipo V> NombreHM = new HashMap<>();

        /*
            HashMap:
            -No tiene orden especifico, prioriza el tiempo de proceso
            volviendo este tipo de estructuras bastante rápidas durante el proceso
            de inserción, busqueda y eliminación.
        
        */

        Map <String, Double> Calificaciones = new HashMap<>();

        Calificaciones.put("Pedro", 9.8); 
        Calificaciones.put("Sofia",9.4);
        Calificaciones.put("Luis",10.0);
        Calificaciones.put("Ana",9.0);
        for (Map.Entry<String, Double> entrada : Calificaciones.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }
        

    }

}