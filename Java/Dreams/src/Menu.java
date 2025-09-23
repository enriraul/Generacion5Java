import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel{
    private JTextField opcion;
    private JLabel mensaje;
    private JButton seleccionar;
    private JTextArea menu;

    public Menu(DreamsApp dp){
        int x = 280,y = 150;
        setLayout(null); //Importante

        String mensaje_menu ="""
            1.- Desglosar/Mostrar productos
            2.- Agregar al carrito
            3.- Quitar del carrito
            4.- Mostrar el carrito
            5.- Realizar la compra
            6.- Salir
            """; 
        
        menu = new JTextArea();
        menu.setText(mensaje_menu);
        menu.setFont(new Font("Arial", Font.PLAIN, 32));
        menu.setBounds(50,50,900,400);
        add(menu);
        mensaje = new JLabel("Seleccionar una opción");
        mensaje.setBounds(50, 460, 160, 50);
        add(mensaje);
        opcion = new JTextField();
        opcion.setBounds(220,460,400,50);
        add(opcion);
        seleccionar = new JButton("aceptar");
        seleccionar.setBounds(670, 460, 100, 50);
        add(seleccionar);

        seleccionar.addActionListener(e-> 
            {
                String opcionUsuario = opcion.getText();
                
            }
        );

    }

}