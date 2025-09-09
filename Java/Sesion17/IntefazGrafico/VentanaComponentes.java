//awt
//swing

import java.awt.*;
import javax.swing.*;

public class VentanaComponentes{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        
        ventana.setSize(1000,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        //Componentes
        JLabel etiqueta  = new JLabel("Escribe tu nombre: ");
        JButton boton = new JButton("Aceptar");
        JTextArea area = new JTextArea(20, 50);
        JTextField campoTexto = new JTextField(20);
        //Otra opción: etiqueta.setText("");
        
        
        ventana.add(etiqueta);
        ventana.add(campoTexto);
        ventana.add(boton);
        ventana.add(area);

        ventana.setVisible(true);
        ventana.setResizable(true);
    }

}