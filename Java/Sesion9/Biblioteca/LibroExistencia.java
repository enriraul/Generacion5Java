public class LibroExistencia{
    
    private Libro  libro;
    private int Existencia;

    //Constructor
    public LibroExistencia(Libro libro, int Existencia){
        this.libro = libro;
        this.Existencia = Existencia;
    }

    //Métodos Getter
    public Libro getLibro(){
        return this.libro;
    }
    public int getExistencia(){
        return this.Existencia;
    }
    //Métodos Setter
    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public void setExistencia(int Existencia){
        this.Existencia = Existencia;
    }

    public void MostrarInformacion(){
        System.out.println(this.libro.LibroInformacion());
    }

}