package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FormTwo extends JFrame {
    private JButton button1;
    private JPanel rootPanel;

    public FormTwo() {

        add(rootPanel);

        button1.setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);

        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(rootPanel, "This is my msg" );
            }
        });

    }

}
