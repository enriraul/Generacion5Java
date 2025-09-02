
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirTxT{
    public static void main(String[] args) {
        String archivo = "./salida.txt";
        /*
        Sobre escribe el archivo
        try( PrintWriter  pw = new PrintWriter(archivo)){
            pw.println("");
            pw.println("Segunda linea del archivo");
            pw.printf("Sesion numero %d, docente: %s ", 14,"Raul");
        }
        
        */
        //Agregar elementos/lineas en la ultima fila del archivo
        try(FileWriter fw=  new FileWriter(archivo, true); 
        PrintWriter  pw = new PrintWriter(fw)){
            pw.println("");
            pw.println("Segunda linea del archivo");
            pw.printf("Sesion numero %d, docente: %s ", 14,"Raul");
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }

    }
}