public class Libro{
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String Editorial;

    //Constructor
    public Libro(String ISBN, String Titulo, String Autor, String Editorial){
        this.ISBN = ISBN;
        this.Titulo  = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
    }

    //Métodos Getter

    public String getISBM(){
        return this.ISBN;
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public String getAutor(){
        return this.Autor;
    }
    public String getEditorial(){
        return this.Editorial;
    }

    //Métodos Setter
    public void setISBM(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public void setEditorial(String Editorial){
        this.Editorial = Editorial;
    }

    public String LibroInformacion(){
        // String infoLibro = "Información del libro:\n" +
        // "ISBM: "+this.ISBN+"\n"+ 
        // "Titulo: "+this.Titulo+"\n"+
        // "Autor: "+this.Autor+"\n"+
        // "Editorial: "+this.Editorial;

        /*
            %s Cadenas
            %d Enteros
            %f flotantes
            %Lf Doubles
            %d caracteres
        */
        
        String infoLibro = """
        Información del libro:
        ISBN: %s
        Título: %s
        Autor: %s
        Editorial: %s
        """.formatted(this.ISBN, this.Titulo, this.Autor, this.Editorial);
    

        return infoLibro;
    }
}