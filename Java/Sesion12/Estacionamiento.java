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

    public int BuscarVehiculo(String matricula){   
        int vehiculo_i = -1;
        /*
            vehiculo_i:
            -1: No se encontró
            -2: Estacionamiento vacío
            coc: Posición del vehiculo encontrado
         */
        if (estacionamiento.isEmpty()){
            vehiculo_i = -2;
        }
        else{
            for (int i = 0; i < estacionamiento.size(); i++) {
                Vehiculo vehiculo = estacionamiento.get(i);
                if (vehiculo.matricula.equals(matricula)) {
                    vehiculo_i = i;
                    break;
                }
            }
        }

        return vehiculo_i;
    }


    public void QuitarVehiculo(String matricula){
        int vehiculo_i = BuscarVehiculo(matricula);
        if (vehiculo_i==-1) {
            System.out.println("No se encontró la matricula");
        }
        else if (vehiculo_i==-2) {
            System.out.println("Actualmente no hay vehiculos dentro del estacionamiento");
        }
        else{
            
            estacionamiento.remove(vehiculo_i);
        }
    }


}