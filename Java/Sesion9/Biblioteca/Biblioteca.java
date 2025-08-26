import java.util.ArrayList;

public class Biblioteca{

    private ArrayList <LibroExistencia> catalogo;

    public Biblioteca(){
        this.catalogo = new ArrayList<>();
    }


    /*
        Otra opción que podemos tener que directamente pasar como parametro
        public void AgregarLibro(LibroExistencia libroExistencia)
        Sólo que en este caso es necesario la creación del objeto en la clase
        que contendrá el main
    */

    public void AgregarLibro(Libro libro, int Existencia){

        /* 
            Recordemos que el arraylist es de tipo LibroExistencia. 
            Por ello, para incorporar/agregar un nuevo elemento, este debe cumplir
            con las características del arreglo. En este caso nos piden
            el tipo de dato Objeto:LibroExistencia, es por ello que primero
            se crea un objeto de este tipo de dato, solicitando un objeto tipo libro
            y un entero tipo existencia. 
            Una vez creado este elemento podemos proceder a almacenar dicho elemento
            en el arreglo.
        */

        LibroExistencia libroExistencia = new LibroExistencia(libro, Existencia);
        this.catalogo.add(libroExistencia);
    }

    public int BuscarLibro(String ISBN){
        /* 
            Valores posibles del indice
            -1 : Cuando no encontro el libro
            -2 : Catalogo está vacio
            c (0:catalogo.size() ): el indice del libro
        */
        int index_libro = -1;

        if(catalogo.isEmpty()){
            index_libro = -2;
        }
        else{
            for (int i = 0; i < catalogo.size(); i++) {
                LibroExistencia libroExistencia_i = catalogo.get(i);
                Libro libro_i = libroExistencia_i.getLibro();
                String ISBN_i = libro_i.getISBM();
                if (ISBN_i.equals(ISBN)) {
                    index_libro = i;
                    break;
                }
            }

        }
        return index_libro;
    }

    public void MostrarInfoLibro (String ISBN){
        int index_libro = BuscarLibro(ISBN);
         //Arraylist vacia
        if(index_libro == -2){ 
            System.out.println("Actualmente no hay libros disponibles en el catálogo");
        }
        else if(index_libro == -1){ //No se encontró ningún elemento
            System.out.println("El ISBN no coincide con algún elemento del catálogo");
        }
        else{ //Posición del libro
            LibroExistencia libroExistencia = catalogo.get(index_libro);
            libroExistencia.MostrarInformacion();
        }
    }

    public void MostrarCatalogo(){
        for (int i = 0; i < catalogo.size(); i++) {
            LibroExistencia libroExistencia = catalogo.get(i);
            libroExistencia.MostrarInformacion();
            System.out.println("__________________________________________\n");
        }

    }

    public void RemoverLibro(String ISBN){
        int index_libro = BuscarLibro(ISBN);
         //Arraylist vacia
        if(index_libro == -2){ 
            System.out.println("Actualmente no hay libros disponibles en el catálogo");
        }
        else if(index_libro == -1){ //No se encontró ningún elemento
            System.out.println("El ISBN no coincide con algún elemento del catálogo");
        }
        else{ //Posición del libro
            LibroExistencia libroExistencia = catalogo.get(index_libro);
            System.out.println("El siguiente libro ha sido eliminado: ");
            libroExistencia.MostrarInformacion();
            this.catalogo.remove(index_libro);

        }
    }
}