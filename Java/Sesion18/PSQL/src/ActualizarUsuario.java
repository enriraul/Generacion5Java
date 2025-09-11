import java.sql.*;

public class ActualizarUsuario{
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/dbtest";
        String usuario = "admin";
        String password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            try(Connection conn = DriverManager.getConnection(url, usuario, password)){
                String update = "UPDATE usuario SET correo = ? WHERE id_usuario = ?";
                //"UPDATE usuario SET correo = correonuevo@ejemplo.com.mx, nombre = pedro WHERE id_usuario = 1"
                //"UPDATE usuario SET correo = corre2onuevo@ejemplo.com.mx WHERE id_usuario = 2"
                try(PreparedStatement pstmt  = conn.prepareStatement(update)){
                    pstmt.setString(1,"correonuevo@ejemplo.com.mx");
                    pstmt.setInt(2,1);
                    pstmt.setString(1,"correo2nuevo@ejemplo.com.mx");
                    pstmt.setInt(2,2);
                    int filas = pstmt.executeUpdate();
                    System.out.println("Numero de actualizaciones: "+filas);
                }
            
            }catch(SQLException e){
                System.out.println("Error: "+e.getMessage());
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        /*
        
        
        
        */
    }
}