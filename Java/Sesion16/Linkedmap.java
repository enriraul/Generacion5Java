import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedmap{

    public static void main(String[] args) {
        //Sintaxis: Map <tipo K, tipo V> NombreHM = new LinkedHashMap<>();
        Map <String, Double> Circuito = new LinkedHashMap<>();

        Circuito.put("Conductor1",1.4);
        Circuito.put("Conductor5",2.4);
        Circuito.put("Conductor2",1.43);
        Circuito.put("Conductor3",1.67);
        Circuito.put("Conductor4",1.8);

        for (Map.Entry<String, Double> entrada : Circuito.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }

    }

}