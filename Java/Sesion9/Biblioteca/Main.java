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
        2.- Buscar Libro
        3.- Mostrar catalogo completo
        4.- Eliminar libro
        5.- Cerrar aplicacion
        """;

        do { 
            System.out.println(Mensaje);
            seleccion = sc.nextInt();
            

            switch (seleccion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Complete la siguiente información");
                    System.out.println("Indique el ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.println("Indique el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Indique el nombre del autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Indique la editorial: ");
                    String editorial = sc.nextLine();
                    System.out.println("¿Cuántas existencias tiene este libro?");
                    int existencia = sc.nextInt();
                    Libro libro = new Libro(isbn, titulo, autor, editorial);
                    biblioteca.AgregarLibro(libro, existencia);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Complete la siguiente información");
                    System.out.println("Indique el ISBN: ");
                    String isbn_busqueda = sc.nextLine();
                    biblioteca.MostrarInfoLibro(isbn_busqueda);
                    break;
                case 3:
                    System.out.println("Catalogo: ");
                    biblioteca.MostrarCatalogo();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Complete la siguiente información");
                    System.out.println("Indique el ISBN: ");
                    String isbn_remover = sc.nextLine();
                    biblioteca.RemoverLibro(isbn_remover);
                    break;
                case 5:
                    System.out.println("Muchas gracias, hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        } while (seleccion!=5);


    }

}