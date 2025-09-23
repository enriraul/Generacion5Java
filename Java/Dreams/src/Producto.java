/*

 id_producto
    nombre
    precio
    categoria
    stock
    ---------------------
    get-set

 */


public class Producto{

   private String nombre;
   private double precio;
   private String categoria;
   private int stock;

   public Producto(String nombre, double precio, String categoria, int stock){
      this.nombre = nombre;
      this.precio = precio;
      this.categoria = categoria;
      this.stock = stock;
   }


   //Métodos get
   public String getNombre(){
      return this.nombre;
   }

   public double getPrecio(){
      return this.precio;
   }

   public String getCategoria(){
      return this.categoria;
   }

   public int getStock(){
      return this.stock;
   }

   public void setStock(int stock){
      this.stock = stock;
   }
   
}