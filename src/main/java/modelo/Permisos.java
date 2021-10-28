/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Permisos {
    public Permisos () {

    }

    public void iniciarSesion (String usuario, String contraseña) {
        DAOUsuario daoUsuarios = new DAOUsuarios();
        boolean existencia;
        existencia = daoUsuarios.consultar(usuario, contraseña);
        return existencia;
    }
}
