import javax.swing.*;
/*

    Bounds

    JPanel principal- layout null


    Creacion/instancia objeto 
    objeto.setBound(x,y, ancho, alto);
    add(objeto)

*/

public class Login extends JPanel{
    private JTextField usuario, correo;
    private JLabel LUsuario,LCorreo;
    private JButton login, create;

    public Login(){
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
        login = new JButton("Iniciar Sesión");
        login.setBounds(x,y+150,200,50);
        add(login);
        create = new JButton("Crear cuenta");
        create.setBounds(x+300,y+150,200,50);
        add(create);
    

        login.addActionListener(e-> 
            {
                String usuatioText = usuario.getText();
                String correoText = correo.getText();

            }
        );
    }

}