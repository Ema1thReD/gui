package com.layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel mainPanel;
    private JButton button_message;

    public App() {
        //creating add listener method action to button
        button_message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello Wold");
            }
        });
    }
    public static void main(String args[]){
        JFrame frame=new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        frame.pack();//which will sizes the content
        frame.setVisible(true);//visibility message
    }
}