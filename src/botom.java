import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class botom {
    public JPanel mainPanel;
    public JButton button1;
    private JLabel Label;
    private JButton LOLButton;
    private JTextField mondongo;
    private JButton Capturar;


    public botom() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("JAJAJAJAA");
            }
        });
        LOLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("");
            }
        });
        Capturar.addComponentListener(new ComponentAdapter() {
        });
        Capturar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje=mondongo.getText();
                Label.setText(mensaje);
                mainPanel.removeAll();
            }
        });
    }
}
