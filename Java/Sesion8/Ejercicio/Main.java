public class Main{

    public static void main(String[] args) {
        

        Cuadrado  cuadrado = new Cuadrado(5.0);
        Rectangulo rectangulo = new Rectangulo(1.5,3.0);
        Circulo circulo = new Circulo(5.0);
        
        Figura []  figuras = {cuadrado, rectangulo, circulo};

        for (Figura f : figuras) {
            System.out.println("Área: "+f.calcularArea());
        }

        // System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
        // System.out.println("El area del circulo es: "+circulo.calcularArea());
        // System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());

    }

}