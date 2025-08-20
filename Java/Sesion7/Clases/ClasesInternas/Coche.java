
public class Coche{ //Clase externa

    private String marca;
    
    public Coche(String marca){
        this.marca = marca;
    }

    public class Motor{ //Clase interna
        private int potencia;

        public Motor(int potencia){
            this.potencia = potencia;
        }

        public void Informacion(){
            System.out.println("Potencia: "+this.potencia+"\nMarca: "+marca);
        }
    }

}

