//
import java.util.ArrayList;

public class Arraylist{

    public static void main(String[] args) {
        // int[] arreglo={1,2,3,4,5};
        // int[] arreglos = new int[10];
        /*
            Sintaxis ArrayList:
            ArrayList<TipoDato> lista = new ArrayList<>();
            TipoDato:
                int, double, float, String, Char
                objeto
         */
        // ArrayList<String> nombres = new ArrayList <>();
        /* 
            Agregar: add - lista.add(elemento)
            Quitar: remove lista.remove(index)/lista.remove(objeto)
        */
       /*
        nombres.add("Alan");
        nombres.add("Sofia");
        nombres.set(0, "Pepe");
        nombres.add(0,"Alan");
        nombres.remove("Sofia");

        String nombre_1 = nombres.get(1);
        System.out.println(nombre_1);
        */
       ArrayList<Contactos> agenda = new ArrayList<>();
       Contactos contacto = new Contactos("Pepe","4815-51849-58",1990); 
       int edad = 2025- contacto.año_nacimiento;
       System.out.println(edad);
       
       //agenda.add(contacto);
    }
}