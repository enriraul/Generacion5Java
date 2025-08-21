public class Autentificar{

    public boolean autenticar(String usuario, String password){
        if (usuario.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("root")) {
            return true;
        }
        else{
            return false;
        }
    }
}