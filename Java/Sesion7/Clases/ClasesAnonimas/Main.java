public class Main{

    public static void main(String[] args) {
        
        Coche coche = new Coche(){

            public void arrancar(){
                System.out.println("Arranca");
            }
            public void detener(){
                System.out.println("Detiene");
            }

        };
        coche.arrancar();
        coche.detener();

        Coche coche1 = new Coche(){
            public void arrancar(){
                System.out.println("Se inicia el proceso de arrancar");
            }
            public void detener(){
                System.out.println("Se inicia el proceso de detener");
            }
        };

    }


}