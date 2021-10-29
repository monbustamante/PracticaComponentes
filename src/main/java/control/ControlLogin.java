/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.VistaLogin;

public class ControlLogin implements ActionListener {
    private VistaLogin vistaLogin;

    public ControlLogin (VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;

        this.vistaLogin.getBotonIniciarSesion().addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {
        Usuario usuario = new Usuario(vistaLogin.getFieldUsuario().getText(), vistaLogin.getFieldContraseña().getText());
        boolean existencia;
        existencia = usuario.getPermisos().iniciarSesion(usuario.getUsuario(), usuario.getContraseña());

        if (existencia) {
            vistaLogin.setVisible(false);
            vistaLogin.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña invalida", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
