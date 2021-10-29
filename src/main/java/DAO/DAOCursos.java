/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Curso;

/**
 *
 * @author monts
 */
public class DAOCursos extends DAOSQL<Curso> {
    
    public int agregar(Curso e) throws SQLException {
        int numFilas = 0;
        Connection con = getConeccion();

        String orden = "INSERT INTO Curso(Nombre, Creditos)"
                + "VALUES ('" + e.getNombre() + "','" + e.getCreditos() + "')";

        Statement sentencia = con.createStatement();
        numFilas = sentencia.executeUpdate(orden);
        sentencia.close();
        cerrarConeccion(con);
        return numFilas;
    }

    public int eliminar(String condicion) throws SQLException {
        int numFilas = 0;
        Connection con = getConeccion();

        String orden = "DELETE FROM Curso WHERE " + condicion;

        Statement sentencia = con.createStatement();
        numFilas = sentencia.executeUpdate(orden);
        sentencia.close();
        cerrarConeccion(con);
        return numFilas;
    }

    public int modificar(Curso e, String condicion) throws SQLException {
        int numFilas = 0;
        Connection con = getConeccion();

        String orden = "UPDATE Curso SET "
                + "Nombre = '" + e.getNombre() + "', "
                + "Creditos = '" + e.getCreditos()
                + "' WHERE " + condicion;
        
        Statement sentencia = con.createStatement();
        numFilas = sentencia.executeUpdate(orden);
        sentencia.close();
        cerrarConeccion(con);
        return numFilas;
    }

    public int modificarCantidad(Curso e, String condicion) throws SQLException {
        int numFilas = 0;
        Connection con = getConeccion();

        String orden = "UPDATE Curso SET "
                + "Nombre = '" + e.getNombre() + "', "
                + "Creditos = '" + e.getCreditos() 
                + "' WHERE " + condicion;
        
        Statement sentencia = con.createStatement();
        numFilas = sentencia.executeUpdate(orden);
        sentencia.close();
        cerrarConeccion(con);
        return numFilas;
    }

    public ArrayList<Curso> consultar(String condicion) throws SQLException {
        ArrayList<Curso> lista = new ArrayList<Curso>();
        Curso e;
        Connection con = getConeccion();
        String orden = "SELECT * FROM Curso "
                + (condicion == null || condicion.length() == 0 ? "" : "WHERE " + condicion);
        Statement sentencia = con.createStatement();
        
        ResultSet rs = sentencia.executeQuery(orden);
        while (rs.next()) {
            //e = new Curso(rs.getInt("CursoID"), rs.getString("Nombre"), rs.getString("Creditos"));
            //lista.add(e);
        }
        sentencia.close();
        cerrarConeccion(con);
        return lista;
    }
    
}
