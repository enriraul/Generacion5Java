public class Carro{
    
    // Atributos/Características
    public int nPuertas;
    public String modelo;
    public String marca;
    public int año;
    public String color;

    //Constructor: Método especial que nos permite
    //inicializar nuestra clase
    public Carro(int nPuertas, String marca, String modelo, int año, String color){
        this.nPuertas = nPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.color = color;
    }

    //Métodos: Acciones que puede realizar la clase
    //Método es lo mismo que una función en cualquier 
    //lenguaje de programación

    //Sintaxis: nivel_acceso tipoDato_salida Nombre_funcion(tidoDato parametros)
    //public int/float/double/String/char/void (sin retorno) 
    //Mayuscula 

    public void InformacionCarro(){
        System.out.println("Descripción del carro:");
        System.out.println("Modelo: "+this.modelo+
        " Marca: "+this.marca+
        " Año: "+this.año);
    }

}