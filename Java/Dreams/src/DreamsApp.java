import java.awt.*;
import javax.swing.*;

public class DreamsApp extends JFrame{
    private CardLayout cardlayout;
    private JPanel contenedor;

    public DreamsApp(){
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardlayout = new CardLayout();
        contenedor = new JPanel(cardlayout);

        Login login = new Login(this);
        contenedor.add(login,"Login");

        CuentaNueva cuentaNueva = new CuentaNueva(this);
        contenedor.add(cuentaNueva,"CuentaNueva");

        Menu menu = new Menu(this);
        contenedor.add(menu,"Menu");

        add(contenedor);

    }

    public void MostrarPanel(String nombrePanel){
        cardlayout.show(contenedor, nombrePanel);
    }
    public static void main(String[] args) {

        Font fuenteGlobal = new Font("Arial", Font.PLAIN, 18);

        UIManager.put("Label.font", fuenteGlobal);
        UIManager.put("Button.font", fuenteGlobal);
        UIManager.put("TextField.font", fuenteGlobal);
        UIManager.put("TextArea.font", fuenteGlobal);
        UIManager.put("ComboBox.font", fuenteGlobal);
        UIManager.put("Menu.font", fuenteGlobal);
        UIManager.put("MenuItem.font", fuenteGlobal);
        UIManager.put("Table.font", fuenteGlobal);
        SwingUtilities.invokeLater(()->{new DreamsApp().setVisible(true);});
    }
}