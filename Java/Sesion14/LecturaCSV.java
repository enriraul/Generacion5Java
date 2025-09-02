
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaCSV{
    public static void main(String[] args) {

        String archivo = "data.csv";
        String linea;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){   
            while((linea = br.readLine())!=null){
                
                String [] elementos = linea.split(",");
                for (String elemento: elementos) {
                    System.out.println(elemento);
                }
            }
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }
    }
}