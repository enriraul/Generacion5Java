public class Persona{

    //Atributos
    protected  String nombre;
    public int edad;

    //Constructor: Método especial para inicializar las variables de una clase
    // acceso NombreClase(parametros)
    public Persona(String nombre, int edad){
        //this : Aque variable que estamos mencionando, es referente a la instancia
        this.nombre = nombre;
        this.edad = edad;
    }
    //Persona persona = Persona("Armando",45);

    //Métodos 
    public void MostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+"\tedad: "+this.edad);
    }

}