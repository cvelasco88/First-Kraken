package com.company;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World!");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                FormTwo form = new FormTwo();
                form.setVisible(true);
            }
        });

        System.out.println("Bye Bye!");

    }


}
