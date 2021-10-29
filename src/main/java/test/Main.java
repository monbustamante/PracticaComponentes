/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import control.ControlLogin;
import vista.VistaLogin;

/**
 *
 * @author ed_le
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaLogin vistaLogin = new VistaLogin();
        ControlLogin controlLogin = new ControlLogin(vistaLogin);
        vistaLogin.setVisible(true);
        vistaLogin.setLocationRelativeTo(null);
    }
}
