import java.sql.*;

public class InsertarUsuario{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/dbtest";
        String usuario = "admin";
        String password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            try(Connection conn = DriverManager.getConnection(url, usuario, password)){
                String insert = "INSERT INTO usuario (nombre, apellido, correo) VALUES (?,?,?)";
                try(PreparedStatement pstmt  = conn.prepareStatement(insert)){
                    pstmt.setString(1,"Enrique");
                    pstmt.setString(3, "correo@ejemplo.com");
                    pstmt.setString(2, "Rodríguez");

                    int filas = pstmt.executeUpdate();
                    System.out.println("Numero de actualizaciones: "+filas);
                }

            }
            catch(SQLException e){
            System.out.println("Error del mensaje: "+e.getMessage());
            }
        } 
        catch(Exception e){
            System.out.println("Error del mensaje: "+e.getMessage());
        }

    }

}