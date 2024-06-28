import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class IntentoCalculadora {
    public JPanel panel1;
    public JButton Suma;
    public JButton division;
    public JButton Resta;
    public JButton Multi;
    public JTextField NUM1;
    public JTextField NUM2;
    public JLabel Respuesta;
    public JLabel resultado;
    private JButton Seno;
    private JButton Coseno;
    private JButton Tangente;
    Double numero,numero2;


    public IntentoCalculadora() {
        NUM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = NUM1.getText();
                 numero= Double.parseDouble(num1);


            }
        });
        NUM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num2 = NUM2.getText();
                numero2= Double.parseDouble(num2);
            }
        });
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double suma = numero + numero2;
                resultado.setText(suma.toString());
            }
        });
        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resta = numero - numero2;
                resultado.setText(resta.toString());

            }
        });
        Multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double multi = numero * numero2;
                resultado.setText(multi.toString());
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double division = numero / numero2;
                if (numero2!=0){
                    resultado.setText(division.toString());

                }
            }
        });
        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double seno = Math.sin(Math.toRadians(numero));
                resultado.setText(seno.toString());

            }
        });
        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double coseno = Math.cos(Math.toRadians(numero));
                resultado.setText(coseno.toString());

            }
        });
        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double tangente = Math.cos(Math.toRadians(numero));
                resultado.setText(tangente.toString());
            }
        });
    }

}
