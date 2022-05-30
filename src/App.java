import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {

    private final static String TEXT = "Click count";
    int num = 0;

public App() {
    setTitle("My programme");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setBounds(100, 100, 400, 200);
    setResizable(false);
    setVisible(true);

    Font font = new Font("Arial", Font.BOLD, 30);

    JTextField jTextField = new JTextField();
    JButton jButton = new JButton(TEXT);

    jButton.setFont(font);

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           jTextField.setText(generateNumber());
        }
    });

    jTextField.setFont(font);
    jTextField.setHorizontalAlignment(JTextField.CENTER);

    add(jTextField, BorderLayout.CENTER);
    add(jButton, BorderLayout.SOUTH);

}

private String generateNumber(){
    Random random = new Random();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("+7");
    stringBuilder.append("999");

    for (int i = 0; i < 7; i++) {
        stringBuilder.append(random.nextInt(10));
    }

    return stringBuilder.toString();
}

}
