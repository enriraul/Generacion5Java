public class AutentificarToken extends  Autentificar{

    public String GenerarToken(){
        //Método interno que genera un token
        return "token";
    }

    @Override
    public boolean autenticar(String usuario, String password){
        if (usuario.equalsIgnoreCase("admin")&& 
        password.equalsIgnoreCase("root")&&
        GenerarToken().equalsIgnoreCase("123456")) {
            return true;
        }
        else{
            return false;
        }
    }

}