public class Venta{
    private int id_venta;
    private Producto producto;
    private int cantidad;

    public Venta(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdVenta(){
        return this.id_venta;
    }
    public Producto getProducto(){
        return this.producto;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}