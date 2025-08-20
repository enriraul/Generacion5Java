public final class Coche{
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo){
        this.marca=  marca;
        this.modelo = modelo;
    }

    public void Info(){
        System.out.println("Modelo: " +this.modelo+"\nMarca: "+this.marca);
    }
}