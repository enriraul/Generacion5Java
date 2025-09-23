import javax.swing.*;


public class CuentaNueva extends JPanel{
    private JTextField usuario, correo;
    private JLabel LUsuario,LCorreo;
    private JButton cancelar, crear;

    public CuentaNueva(DreamsApp dp){
        int x = 280,y = 150;
        setLayout(null); //Importante
        usuario = new JTextField();
        usuario.setBounds(x + 100,y,300,50);
        add(usuario);

        correo = new JTextField();
        correo.setBounds(x+100,y+60,300,50);
        add(correo);
        LUsuario = new JLabel("Usuario: ");
        LUsuario.setBounds(x,y , 80, 50);
        add(LUsuario);
        LCorreo = new JLabel("Correo: ");
        LCorreo.setBounds(x, y+60 , 80, 50);
        add(LCorreo);
        crear = new JButton("Registrar");
        crear.setBounds(x,y+150,200,50);
        add(crear);
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(x+300,y+150,200,50);
        add(cancelar);
    

        crear.addActionListener(e-> 
            {
                String usuatioText = usuario.getText();
                String correoText = correo.getText();
                //Método para validar las credenciales
                dp.MostrarPanel("Menu");
            }
        );
        cancelar.addActionListener(e-> 
            {
                dp.MostrarPanel("Login");
            }
        );
    }

}