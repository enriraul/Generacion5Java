public class Main{

    /*
    
    private int identificador;
    private String nombre;
    private String apellido;
    private String curp;
    private String direccion;
    private float monto;

     */
    public static void main(String[] args) {

        Persona  persona  = new Persona(1,"Enrique","Rodríguez","Curp","direccion", 12312);
        System.out.println(persona.getIdentificador());
        persona.setIdentificador(12);
        System.out.println(persona.getIdentificador());

        /* 
        
            Cajero:
            Nombre
            Apellido
            Monto

            IngresarMonto
            RetirarMonto
            ConsultarMonto
        
        */



    }   
}