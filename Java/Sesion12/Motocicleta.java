public class Motocicleta extends Vehiculo{
    
    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int año, String tipoManillar){
        super(marca, modelo, año);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion(); //A la clase padre, ejecuta el método mostrarInformación
        System.out.println("Tipo manillar de la motocicleta: "+this.tipoManillar);

    }

}