import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataFile{

    //Connection conn: objeto tiene el acceso a la base de datos
    public void CargaDatosSQL(String archivo, DreamsDB db){
        String linea;
        int bandera =1;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){   
            while((linea = br.readLine())!=null){
                if(bandera == 1){
                    bandera +=1;
                }
                else{
                    String [] elementos = linea.split(",");
                    /*elemento: 
                        0:nombre
                        1:precio
                        2:categoria
                        3: stock
                    */
                    Double precio = Double.parseDouble(elementos[1]);
                    int stock = Integer.parseInt(elementos[3]);
                    db.InsertarDatosProducto(elementos[0],precio,elementos[2],stock);

                }

            }
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }
    }
    public void CargaDatosObjeto(String archivo, DreamsDB db){
        String linea;
        int bandera =1;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){   
            while((linea = br.readLine())!=null){
                if(bandera == 1){
                    bandera +=1;
                }
                else{
                    String [] elementos = linea.split(",");

                    Double precio = Double.parseDouble(elementos[1]);
                    int stock = Integer.parseInt(elementos[3]);

                    Producto producto = new Producto(elementos[0],precio,elementos[2],stock);
                    db.InsertarDatosProducto(producto);

                }
            }
        }
        catch(IOException e){
            System.out.println("Error en la lectura del archivo: "+e.getMessage());
        }
    }
    /*
        Generar Reporte de ventas 
    */
}