abstract class Animal{

    private String nombre;
    private String raza;
    private int edad;

    public Animal(String nombre, String raza, int edad){
        this.nombre =nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract void HaceRuido();

}