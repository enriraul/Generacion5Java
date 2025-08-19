public class Contactos{
    private String nombre;
    public String contacto;
    public int año_nacimiento;


    public Contactos(String nombre, String contacto, int año_nacimiento){
        this.nombre = nombre;
        this.contacto = contacto;
        this.año_nacimiento = año_nacimiento;
    }

    public String GetNombre(){
        return this.nombre;
    }
    public String GetContacto(){
        return this.contacto;
    }

}