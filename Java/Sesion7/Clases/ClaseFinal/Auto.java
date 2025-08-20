/*
    Está clase está destinada a mandar un error,
    ya que estamos tratando de heredad de una clase final (Coche).
    Recordar que estás clases no pueden heredar

*/


public class Auto extends Coche{
    public Auto(String modelo, String marca){
        super(marca, modelo);
    }
}