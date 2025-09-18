
/*
Está clase está destinada para la construcción del proyecto 
DREAM's a nivel terminal.

*/

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        String archivo = "";
        String mensajeInicio = """
            Bienvenidos a Dream's
            Para proceder a nuestro sistema es necesario 
            el inicio de sesión usando únicamente tu correo registrado,
            en caso de no tener una cuenta, puede proceder a crearse una. 
        """;
        boolean InicioSesion = false;
        int decision;
        String mensaje ="""
            1.- Desglosar/Mostrar productos
            2.- Agregar al carrito
            3.- Quitar del carrito
            4.- Mostrar el carrito
            5.- Realizar la compra
            6.- Salir
            """; 

        Scanner sc  = new Scanner(System.in);

        DreamsDB db = new DreamsDB();
        DataFile df = new DataFile();
        Carrito carro;
        Cliente  cliente;
        df.CargaDatosObjeto(archivo, db);

        do { 
            System.out.println(mensajeInicio);
            System.out.println("Se encuentra registrado en el sistema? sí/no ");
            String rUsuarioRegistro = sc.next();
            sc.next();
            if(rUsuarioRegistro.equals("sí")){
                System.out.println("Ingrese el correo registrado: ");
                String correo = sc.next();
                sc.next();
                /*
                db.InicioSesion(correo);
                
                Select nombre, correo from clientes where ? = correo;
                retun rs.next()
                InicioSesion = true
                cliente = new Cliente(nombre, correo);
                */
            }
            else if(rUsuarioRegistro.equals("no")){

            }
            else{
                System.out.println("Opción no válida");
            }
        } while (InicioSesion == false);


        do{
            System.out.println(mensaje);
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                    db.GetProductos();
                    break;
                case 2:
                    System.out.println("Ingrese el id del producto: ");
                    int id_producto = sc.nextInt();
                    /*
                        producto = db.getProducto(id_producto);
                        Select id_producto, nombre, precio, categoria, stock from producto where id_producto = ?;
                        
                    */
                    System.out.println("Cuántas unidades comprará: ");
                    int cantidad = sc.nextInt();
                    /*
                        carrito = new Carrito(cliente);
                        carrito.AgregarCarrito(producto, cantidad);
                    */
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.print("Opción no válida");
            }
        }while(decision==6);

    }
}