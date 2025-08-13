import java.util.Scanner;


public class Ciclos{

    public static void main(String[] args) {
        /* 
            inicializacion, condicion de paro, el incremento
            i++  igual a  i=i+1
        */
       /*
        Sintaxis de ciclos en Java
        
            for (int i = 0; i < 10; i++) {
                Indicacione
            }
        --------------------------------
            while (true) { 
                Indicacione
            }
        ---------------------------------
            do { 
                Indicaciones    
            } while (true);
        */

       Scanner sc = new Scanner(System.in);

       String nombre;
       int edad;
       char letra;

        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu edad");
        edad = sc.nextInt();
        //letra = (char)sc.nextInt();
        /* 
        
        sc.nextDouble()
        sc.nextFloat()
        */
        System.out.println("Hola, Buenos días "+nombre);


        /* 
            Actividad:
            El usuario proporciona un numero
            Le solicitaremos esa misma cantidad numeros 
            y determinaremos si es par o impar

        */

    }
}