package RestarauntSYS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Admin extends JLabel implements ActionListener{

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame border = new JFrame();
        border.setSize(300,150);
        border.setBounds(700,400,300,150);
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setVisible(true);
        border.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);



        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);

        //https://forgetcode.com/java/847-login-from-with-swing for JPasswordField

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100,50,165,25);
        panel.add(passText);

        border.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}