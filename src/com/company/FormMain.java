package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FormMain extends JFrame {
    private JButton btnMessage;
    private JPanel rootPanel;

    public FormMain() {

        add(rootPanel);

        btnMessage.setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);

        btnMessage.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(rootPanel, "Hello World!" );
            }
        });

    }

}
