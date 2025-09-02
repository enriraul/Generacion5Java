
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCSV{

    public static void main(String[] args) {
        String ruta_archivo = "./archivo_tab.csv";

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(ruta_archivo))){
            bf.write("Nombre\tApellido\tEdad");
            bf.newLine();
            bf.write("Enrique\tOlguiin\t33");
            bf.newLine();
            bf.write("Enrique\tOlguiin\t33");
            bf.newLine();

        }
        catch(IOException e){
            System.out.println("Error en el archivo: "+e.getMessage());
        }
    }

}