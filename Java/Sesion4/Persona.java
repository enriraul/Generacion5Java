public class Persona{

    //Atributos

    private int identificador;
    private String nombre;
    private String apellido;
    private String curp;
    private String direccion;
    private float monto;

    //Constructor
    public Persona(int identificador, String nombre, 
    String apellido,String curp, String direccion, float monto){

        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.direccion = direccion;
        this.monto = monto;
    }

    //Métodos Getter / Setter
    // acceso tipo_salida nombre ()
    public int getIdentificador(){
        return this.identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    } 



}