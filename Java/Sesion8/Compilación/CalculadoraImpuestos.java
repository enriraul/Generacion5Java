/*
    Polimorfismo en compilación: Sobrecarga de Métodos

    Sobrecarga de métodos: métodos con el nombre, pero cambiando parametros o 
    tipo de dato de salida.

*/

public class CalculadoraImpuestos{

    public double CalcularImpuesto(double ingreso){
        return ingreso*0.16;
    }

    public double CalcularImpuesto(double ingreso, String pais){
        if (pais.equalsIgnoreCase("México")){
            return ingreso*0.16;
        }
        else if (pais.equalsIgnoreCase("USA")){
            return ingreso*0.10;
        }
        else{
            return ingreso*0.2;
        }
    }


}