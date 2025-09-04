import java.util.Map;
import java.util.TreeMap;

public class Treemap{

    public static void main(String[] args) {
        Map <String, Integer> Inventario = new TreeMap<>();

        Inventario.put("elemento_1",30);
        Inventario.put("elemento_3",30);
        Inventario.put("elemento_2",30);
        Inventario.put("Aelemento_5",30);        
        Inventario.put("elemento_4",30);
        Inventario.put("aelemento_6",30);


        for (Map.Entry<String, Integer> entrada : Inventario.entrySet()) {
            System.out.println(entrada.getKey()+","+entrada.getValue());
        }

    }

}