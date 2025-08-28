public class Auto extends Vehiculo{
    
    private int numeroPuertas;

    public Auto(String marca, String modelo, int año, int numeroPuertas){
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion(); //A la clase padre, ejecuta el método mostrarInformación
        System.out.println("No. de puertas: "+this.numeroPuertas);

    }

}