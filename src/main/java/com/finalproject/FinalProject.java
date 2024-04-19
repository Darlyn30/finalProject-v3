

package com.finalproject;

import javax.swing.WindowConstants;


public class FinalProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Log log = new Log();
        log.setTitle("INICIAR SESION");
        log.setResizable(false);
        log.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }
}
