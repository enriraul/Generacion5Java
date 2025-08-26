import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int seleccion;
        String Mensaje = """ 
        Bienvenido:
        Seleccione alguna de las siguientes opciones:
        1.- Agregar Libro
        2.- Mostrar Libro
        3.- Mostrar catalogo completo
        4.- Buscar Libro
        5.- Eliminar libro
        6.- Cerrar aplicacion
        """;

        do { 
            System.out.println(Mensaje);
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Complete la siguiente información");
                    System.out.println("Indique el ISBN: ");
                    String isbn = sc.next();
                    System.out.println("Indique el título del libro: ");
                    String titulo = sc.next();
                    System.out.println("Indique el nombre del autor: ");
                    String autor = sc.next();
                    System.out.println("Indique la editorial: ");
                    String editorial = sc.next();
                    System.out.println("¿Cuántas existencias tiene este libro?");
                    int existencia = sc.nextInt();
                    Libro libro = new Libro(isbn, titulo, autor, editorial);
                    biblioteca.AgregarLibro(libro, existencia);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Muchas gracias, hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        } while (seleccion!=6);


    }

}