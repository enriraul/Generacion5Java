import java.util.ArrayList;

public class Carrito{
    private ArrayList<Venta> carrito;
    private Cliente cliente;

    public Carrito(Cliente cliente){
        this.carrito = new ArrayList<>();
        this.cliente = cliente;
    }

    public void AgregarCarrito(Producto producto, int cantidad){
        if(producto.getStock() >= cantidad){
            Venta venta = new Venta(producto, cantidad);
            carrito.add(venta);
        }
        else{
            System.out.println("No existen suficientes elementos para realizar la compra");
        }
    }

    public int BuscarElemento(int venta_id){
        int id_producto =-1;
        if (carrito.isEmpty()) {
            id_producto = -2;
        }
        else{
            for (int i = 0; i < carrito.size(); i++) {
                Venta venta_i = carrito.get(i);
                if (venta_id == venta_i.getIdVenta()){
                    id_producto = i;
                }            
            }
        }
        return id_producto;
    }

    public void QuitarCarrito(int venta_id, int cantidad){
        int id_venta = BuscarElemento(venta_id);
        Venta venta = carrito.get(id_venta);
        if (cantidad > venta.getCantidad()) {
            //Mandamos mensaje de incongruencia
        }
        else if (cantidad < venta.getCantidad()) {
            venta.setCantidad(venta.getCantidad()-cantidad);
        }
        else{
            carrito.remove(id_venta);
        }
    }
}