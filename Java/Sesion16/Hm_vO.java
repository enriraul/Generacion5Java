import java.util.HashMap;
import java.util.Map;


public class Hm_vO{
    public static void main(String[] args) {
    
        Map <String, Persona> empleados = new HashMap<>();

        empleados.put("1aa",new Persona("Pedro","Perez"));
        empleados.put("12aa",new Persona("Maria","Martinez"));

        for (Map.Entry<String, Persona> entrada : empleados.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue().getNombre());
        }
    }
}