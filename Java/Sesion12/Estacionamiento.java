import java.util.ArrayList;

public class Estacionamiento{
    private ArrayList<Vehiculo> estacionamiento;

    public Estacionamiento(){
        this.estacionamiento = new ArrayList<>();
    }

    public void AgregarVehiculo(Vehiculo vehiculo){
        this.estacionamiento.add(vehiculo);
    }

    public void mostrarVehiculos(){
        for (int i = 0; i <estacionamiento.size(); i++) {
            Vehiculo vehiculo_i = estacionamiento.get(i);
            vehiculo_i.mostrarInformacion();
            System.out.println("_________________________________"); 
        }
    }

}