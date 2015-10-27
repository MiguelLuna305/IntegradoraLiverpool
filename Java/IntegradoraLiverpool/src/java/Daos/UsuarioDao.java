/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Conexion.ConexionSQLServer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Beans.UsuarioBean;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Arakanox
 */
public class UsuarioDao {
    Connection con;
    
        public List<UsuarioBean> getAll() {
        String query = "SELECT * FROM Usuario"
                + " ORDER BY id;";
        List<UsuarioBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<UsuarioBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        List<UsuarioBean> passResultSet(ResultSet res, List<UsuarioBean> list) throws SQLException {

        while (res.next()) {
            UsuarioBean us = new UsuarioBean();
            us.setId(res.getInt("idUsuario"));
            us.setNombre(res.getString("nombre"));
            us.setApellidoP(res.getString("apellidoP"));
            us.setApellidoM(res.getString("apellidoM"));
            us.setFechaNac(res.getString("fechaNacimiento"));
            us.setDireccion(res.getString("direccion"));
            us.setCorreo(res.getString("correo"));
            us.setContraseña(res.getString("contraseña"));
            us.setNombreUsuario(res.getString("nombreUser"));
            us.setEstado(res.getBoolean("estado"));
            us.setTipoId(res.getInt("tipoIdTipo"));
            us.setDepartamentoId(res.getInt("departamentoIdDEpartamento"));
            list.add(us);
        }

        return list;
    }
        
        public List<UsuarioBean> getActive() {
        String query = "SELECT * FROM Usuario WHERE estado = 'true'"
                + " ORDER BY id ASC;";
        List<UsuarioBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<UsuarioBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        public UsuarioBean get(int id) {
        UsuarioBean usuario = new UsuarioBean();
        String query = "SELECT * FROM " + "Usuario" + " WHERE " + "id" + " = ?";

        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                
                usuario.setId(result.getInt("id"));
                usuario.setNombre(result.getString("nombre"));
                usuario.setApellidoP(result.getString("apellidoP"));
                usuario.setApellidoM(result.getString("apellidoM"));
                usuario.setFechaNac(result.getString("fechaNacimiento"));
                usuario.setDireccion(result.getString("direccion"));
                usuario.setCorreo(result.getString("correo"));
                usuario.setContraseña(result.getString("contraseña"));
                usuario.setNombreUsuario(result.getString("nombreUser"));
                usuario.setEstado(result.getBoolean("estado"));
                usuario.setTipoId(result.getInt("idTipo"));
                usuario.setDepartamentoId(result.getInt("idDepartamento"));
                
            }

            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }
        
        
        public boolean update(UsuarioBean bean) {

     
        String query = "UPDATE " + "Usuario" + " SET"
                + " nombre = ?,"
                + " apellidoP = ?,"
                + " apellidoM = ?,"
                + " fechaNacimiento = ?,"
                + " direccion = ?,"
                + " correo = ?,"
                + " contraseña = ?,"
                + " nombreUser = ?,"
                + " estado = ?,"
                + " idTipo = ?"
                + " idDepartamento = ?"
                + " WHERE " + " id" + " = ?;";
       

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, bean.getNombre());
            ps.setString(2, bean.getApellidoP());
            ps.setString(3, bean.getApellidoM());
            ps.setString(4, bean.getFechaNac());
            ps.setString(5, bean.getDireccion());
            ps.setString(6, bean.getCorreo());
            ps.setString(7, bean.getContraseña());
            ps.setString(8, bean.getNombreUsuario());
            ps.setString(9, bean.isEstado()+"");
            ps.setInt(10, bean.getTipoId());
            ps.setInt(11, bean.getDepartamentoId());
            ps.setInt(12, bean.getId());
            if (ps.executeUpdate() == 1) {
                ps.close();
                return true;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
        public boolean baja(int id) {
        String query= "UPDATE Usuario SET estado='false' WHERE id= ?;";
         
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, id);
            
            if(ps.executeUpdate()==1){
                 ps.close();
                return true;
                    
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         return false;
     }        
         
        public boolean add(UsuarioBean bean) {
            
        String query = "INSERT INTO Usuario"
                + " (nombre, apellidoP, apellidoM, fechaNacimiento, direccion, correo, contraseña"
                + ", nombreUser, estado, idTipo, idDepartamento)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, bean.getNombre());
            ps.setString(2, bean.getApellidoP());
            ps.setString(3, bean.getApellidoM());
            ps.setString(4, bean.getFechaNac());
            ps.setString(5, bean.getDireccion());
            ps.setString(6, bean.getCorreo());
            ps.setString(7, bean.getContraseña());
            ps.setString(8, bean.getNombreUsuario());
            ps.setString(9, bean.isEstado()+"");
            ps.setInt(10, bean.getTipoId());
            ps.setInt(11, bean.getDepartamentoId());
           
            if (ps.executeUpdate() == 1) {

                ps.close();
                return true;
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
        
    
}
