/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ed_le
 */
public class DAOUsuario {
    
    private final String DIRECCION = System.getProperty("user.dir") + "//src//datos//Usuarios.txt";
    public static final String SEPARATOR = ",";
    
    public boolean consultar (String usuario, String contraseña) {
        boolean existencia = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DIRECCION))) {
            String texto;
            while ((texto = bufferedReader.readLine()) != null) {
                String [] usuarios = texto.split(SEPARATOR);
                if (usuarios[0].equals(usuario) && usuarios[1].equals(contraseña)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Alerta", JOptionPane.WARNING_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        return existencia;
    }
}
