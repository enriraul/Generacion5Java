public class Vehiculo{

    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion(){

        //Text blocks
        String informacion =
        """
        Marca del vehiculo: %s
        Modelo del vehiculo: %s
        Año del vehiculo: %d
        """.formatted(this.marca, this.modelo, this.año);

        System.out.println(informacion);
    }

}