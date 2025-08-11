public class Main{

    /*

        java Main.java
        javac file1.java file2.java file3.java Main.java
        java Main.class
     
    */
    public static void main(String[] args) {
        // Variable
        /* 
            Inicio: _, letra.
            Sensibles mayúsculas y minúsculas
        */

        int Edad=17; //Entero
        float saldo = 400; //Flotante, punto decimal
        double distancia; //punto decimal, el rango es doble del flotante
        char letra;
        boolean estado;

        //Impresión
        System.out.println(Edad);

        /*
            Suma  +
            Resta -
            Multiplicación *
            División /
            Modulo %
        */

    //    double Edad_nueva = (double) Edad; //cast
    //    float edad_2 = (float) Edad_nueva; 
    //    String numero = "3.141569";

    //    Double Pi_nuevo = Double.parseDouble(numero); 
    //    int pi_entero = Integer.parseInt(numero);
    //    float pi_flotante = Float.parseFloat(numero);

       //Condicionales, Ciclos
       if ((Edad >= 18)&&(saldo>=500)) {
            System.out.println("Estas autorizado para tramitar tu licencia de conducir");
       }
       else if (Edad>=18) {
            System.out.println("El trámite no puede realizarse porque no cuentas con el saldo suficiente");
       }
       else if (saldo>= 500){
            System.out.println("Usted no cuenta con la edad suficiente para realizar el trámite");
       }
       else{
            System.out.println("Lo siento, no cumples con los requisitos para realizar el trámite");
       }

        /*
        Operadores comparativos

        == Igual
        != Diferente Desigual
        > Mayor que
        < Menor que 
        >= Mayor o igual que
        <= Menor o igual que
         */

        
        /* 
            Operadores lógicos : Operadores que nos permiten evaluar el valor 
            de las diferentes preposiciones

            && AND
            || OR
            !() NOT
        */


    }
}