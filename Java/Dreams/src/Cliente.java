/*

Clase Cliente:
    id_cliente
    nombre
    correo
    ---------------------
    mostrarInformacion
    get-set
 */

public class Cliente{

    private int id_cliente;
    private String nombre;
    private String correo;

    public Cliente(int id_cliente, String nombre, String correo){
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


}