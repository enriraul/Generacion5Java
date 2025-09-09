
import java.awt.*;
import javax.swing.*;


public class Panel extends JFrame{

    public  static void main(String[] args) {
        setTitle("Ejemplo de cambio de paneles");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        JButton b1 = new JButton("Panel1");

        JPanel p2 = new JPanel();
        p2.setBackground(Color.blue);
        JButton b2 = new JButton("Panel2");

        JPanel p3 =  new JPanel();
        p3.setBackground(Color.red);
        JButton b3 = new JButton("Panel3");

        add(p1);
        remove(p1);

        add(p2);
        remove(p2);
        setVisible(true);

    }


}