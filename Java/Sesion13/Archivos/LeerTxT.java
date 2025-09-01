import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxT{
    public static void main(String[] args) {
        String ruta = "datos_alumnos.txt";
        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = bf.readLine())!=null) {
                String [] elementos = linea.split(",");
                for (String elemento: elementos) {
                    System.out.println(elemento);
                }
                System.out.println("______________________");
            }
            
        } catch (IOException e) {
        }
    }
}