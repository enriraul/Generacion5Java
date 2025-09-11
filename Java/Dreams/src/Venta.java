public class Venta{
    private int id_venta;
    private Producto producto;
    private int cantidad;

    public Venta(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }


}