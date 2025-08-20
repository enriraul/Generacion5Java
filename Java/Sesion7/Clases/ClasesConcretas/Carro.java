/* 
    Ejemplo de clase concreta en donde representaremos
    la descricpión de una clase Carro.

*/

/*

    Una clase concreta es aquella que todos su métodos se 
    encuentran especificados, es decir, no existe un método
    que no realice un proceso. 

*/

public class Carro{

    private int nPuertas;
    public String modelo;
    public String marca;
    public int año;
    public String color;


    public Carro(int nPuertas, String marca, String modelo, int año, String color){
        this.nPuertas = nPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.color = color;
    }

    public void InformacionCarro(){
        System.out.println("Descripción del carro:");
        System.out.println("Modelo: "+this.modelo+
        " Marca: "+this.marca+
        " Año: "+this.año);
    }
}