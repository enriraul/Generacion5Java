
import java.util.Scanner;

public class Main{

    public static Vehiculo SolicitarInfo(){

        Scanner sc  = new Scanner (System.in);
        System.out.println("Ingresa la siguiente información");
        System.out.println("Matricula: ");
        String  matricula= sc.nextLine();
        System.out.println("Marca: ");
        String  marca = sc.nextLine();
        System.out.println("Modelo");
        String modelo = sc.nextLine();
        System.out.println("Año: ");
        int año = sc.nextInt();
        System.out.println("Su vehiculo es un: 1.- auto 2.- motocicleta");
        int  tipoVehiculo= sc.nextInt();
        if(tipoVehiculo == 1){
            System.out.println("Numero de puertas: ");
            int nPuertas= sc.nextInt();
            Auto auto = new Auto(matricula, marca, modelo, año, nPuertas);
            return auto;
        }
        else if(tipoVehiculo==2){
            System.out.println("Tipo de manillar: ");
            String  tipoManillar = sc.nextLine();
            Motocicleta motocicleta = new Motocicleta(matricula, marca, modelo, año, tipoManillar);
            return motocicleta;
        }
        else{
            System.out.println("Dato no válido");
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento();
        
        String mensaje = """
        Bienvenidos al estacionamiento 
        1.- Ingresar vehiculo
        2.- Retirar vehiculo
        3.- Mostrar los vehiculos
        4.- Salir
        """;
        int Seleccion; 


        do{
            System.out.println(mensaje);
            Seleccion = sc.nextInt();
            switch (Seleccion) {
                case 1:
                    Vehiculo vehiculo_i = SolicitarInfo();
                    estacionamiento.AgregarVehiculo(vehiculo_i);
                    break;
                case 2:
                    System.out.println("Ingresa la matricula de tu vehiculo");
                    String matricula = sc.nextLine();
                    estacionamiento.QuitarVehiculo(matricula);
                    break;
                case 3:
                    System.out.println("Esta es la información de los vehiculos estacionados");
                    estacionamiento.mostrarVehiculos();
                    break;
                case 4:
                    System.out.println("Muchas gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("Esta selección no es válida, intente de nuevo.");
            }
        }
        while(Seleccion!=4);


    }

}