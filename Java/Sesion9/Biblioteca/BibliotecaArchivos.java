import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BibliotecaArchivos{

    public void CargarLibros(String PathFile, Biblioteca biblioteca){
        String linea;

        try(BufferedReader br = new BufferedReader(new FileReader(PathFile))){   
            while((linea = br.readLine())!=null){
                
                String [] elementos = linea.split(",");
                
                if(!(elementos[0].equals("ISBN"))){
                    Libro libro_i = new Libro(elementos[0],elementos[1],elementos[2],elementos[3]);
                    biblioteca.AgregarLibro(libro_i, 1);
                }
                
            }
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }
    }

}