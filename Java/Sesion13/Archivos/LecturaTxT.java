
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LecturaTxT{
    public static void main(String[] args) {
        String ruta = "data.txt";
        try{
            List<String> lineas = Files.readAllLines(Paths.get(ruta));
            for (String elemento : lineas) {
                System.out.println(elemento);
            }
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }
    }

}