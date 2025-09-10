import java.sql.*;
//java -cp "bin;lib/postgresql-42.7.5.jar" ConsultarUsuario
public class ConsultarUsuario{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dbtest";
        String usuario = "admin";
        String password = "root";

        try {
            Class.forName("org.postgresql.Driver");//Obligar a cargar driver 
            try(Connection conn = DriverManager.getConnection(url, usuario, password)){
                String consulta = "SELECT * from usuario";
                try (
                    Statement  stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(consulta);
                ){
                    while (rs.next()) {
                        int id = rs.getInt("id_usuario");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apellido");
                        String correo = rs.getString("correo");
                        System.out.println(id+"|"+nombre+"|"+apellido+"|"+correo+"|");
                    }
                } 
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}