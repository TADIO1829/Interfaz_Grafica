import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new botom().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        */

        JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new IntentoCalculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


/*
        JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new Inicio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

*/
    }
}