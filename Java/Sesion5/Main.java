public class Main{

    public static void main(String[] args) {
        
        Persona persona = new Persona("Armando",45);
        persona.MostrarInformacion();

        Estudiante estudiante = new Estudiante("Alejandro",18,"Ale18");
        estudiante.MostrarInformacion();

    }

    /* 
        clase Empleado:
            Nombre
            salario
            puesto

        Clase Gerente <-Empleado:
            departamento
        
        Main:
            2 ejemplos: 1-Empleado 1.- Gerente
    */
   /* 
    public: total acceso para cualquiera que tenga una instancia a la clase
    private: acceso unicamente dentro de la clase. 
    protected: Acceso dentro de la clase y cualquiera que lo herede. 
   */
}