import java.awt.CardLayout;
import javax.swing.*;

public class DreamsApp extends JFrame{
    private CardLayout cardlayout;
    private JPanel contenedor;

    public DreamsApp(){
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardlayout = new CardLayout();
        contenedor = new JPanel(cardlayout);

        Login login = new Login();
        contenedor.add(login,"Login");

        add(contenedor);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{new DreamsApp().setVisible(true);});
    }
}