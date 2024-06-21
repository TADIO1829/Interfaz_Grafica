import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio {
    public JPanel panel1;
    public JTextField contra;
    public JTextField usuario;
    public JLabel Nombre;
    public JLabel Contraseña;
    private JButton iniciarSesionButton;
    private JButton Borrar;
    String usuario1="TADIO";
    String contra1="2004";
    String intento;
    String contrai;


    public Inicio() {
        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intento=usuario.getText();
            }
        });
        contra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrai=contra.getText();
            }
        });

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(intento.equals("TADIO") && contrai.equals("2004")){
                    Nombre.setText("Bienvenido");
                    Contraseña.setText("");
                    usuario.setText("");
                    contra.setText("");
                    panel1.setVisible(false);

                }
            }
        });
        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);

            }
        });
    }

}
