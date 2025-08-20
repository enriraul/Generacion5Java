public class Perro extends Animal{
    
    public Perro(String nombre, String raza, int edad){
        super(nombre, raza, edad);
    }
    
    public void HaceRuido(){
        System.out.println("El perro hace gua-gua");
    }

}