import java.sql.*;

public class DreamsDB{
    private String url;
    private String usuario;
    private String contraseña;
    private Connection conn;

    //contructor establece la conexión a la db
    public DreamsDB(){
        try{
            this.conn = DriverManager.getConnection(url,usuario,contraseña);
        }
        catch(SQLException e){
            System.out.println("Error con la base de datos: "+e.getMessage());
        }
    }

    public void GetProductos(){
        try{
            String consulta = "SELECT * from producto";
            try (Statement stmt = this.conn.createStatement()){
                ResultSet rs = stmt.executeQuery(consulta);
                String mensaje = """
                    =======================================

                                    Productos

                    =======================================
                    id_producto\t\t|nombre\t\t|precio\t\t|categoria\t\t| stock\t\t
                    
                    """;
                    System.out.println(mensaje);
                while (rs.next()) { 
                    int id_producto = rs.getInt("id_producto");
                    String nombre = rs.getString("nombre_producto");
                    double precio = rs.getDouble("precio_producto");
                    String categoria = rs.getString("categoria_producto");
                    int stock = rs.getInt("stock_producto");

                    String mensaje_producto = """
                    ==========================================
                    %d\t\t|%s\t\t|%f\t\t|%s\t\t|%d\t\t
                    """.formatted(id_producto, nombre,precio,categoria,stock);
                    System.out.println(mensaje_producto);
                }
                System.out.println("=====================================");
            } catch (Exception e) {
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void InsertarDatosProducto(String nombre, double precio, String categoria, int stock){
        try {
            String insert = "INSERT INTO producto (nombre_producto, precio_producto, categoria_producto, stock_producto) VALUES (?,?,?,?)";
            try(PreparedStatement pstmt  = conn.prepareStatement(insert)){
                pstmt.setString(1,nombre);
                pstmt.setString(2,Double.toString(precio));
                pstmt.setString(3, categoria);
                pstmt.setString(4, Double.toHexString(stock));    
                int filas = pstmt.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void InsertarDatosProducto(Producto producto){
        try {
            String insert = "INSERT INTO producto (nombre_producto, precio_producto, categoria_producto, stock_producto) VALUES (?,?,?,?)";
            try(PreparedStatement pstmt  = conn.prepareStatement(insert)){
                pstmt.setString(1,producto.getNombre());
                pstmt.setString(2,Double.toString(producto.getPrecio()));
                pstmt.setString(3, producto.getCategoria());
                pstmt.setString(4, Double.toHexString(producto.getStock()));    
                int filas = pstmt.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}