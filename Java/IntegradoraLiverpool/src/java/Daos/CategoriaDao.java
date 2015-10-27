/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.CategoriaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arakanox
 */
public class CategoriaDao {
    Connection con;
    
        public List<CategoriaBean> getAll() {
        String query = "SELECT * FROM Categoria"
                + " ORDER BY idCategoria;";
        List<CategoriaBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<CategoriaBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        List<CategoriaBean> passResultSet(ResultSet res, List<CategoriaBean> list) throws SQLException {

        while (res.next()) {
            CategoriaBean ct = new CategoriaBean();
            ct.setIdCategoria(res.getInt("idCategoria"));
            ct.setNombre("nombre");
            ct.setIdDepartamento(res.getInt("idDepartamento"));
            ct.setEstado(res.getBoolean("estado"));
            list.add(ct);
        }

        return list;
    }
        
        public List<CategoriaBean> getActive() {
        String query = "SELECT * FROM Categoria WHERE estado = 'true'"
                + " ORDER BY idCategoria ASC;";
        List<CategoriaBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<CategoriaBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        public CategoriaBean get(int id) {
        CategoriaBean categoria = new CategoriaBean();
        String query = "SELECT * FROM " + "Categoria" + " WHERE " + "idCategoria" + " = ?";

        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                
                categoria.setIdCategoria(result.getInt("idCategoria"));
                categoria.setNombre(result.getString("nombre"));
                categoria.setEstado(result.getBoolean("estado"));
                categoria.setIdDepartamento(result.getInt("idDepartamento"));
                
                
            }

            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categoria;
    }
        
        
        public boolean update(CategoriaBean bean) {

     
        String query = "UPDATE " + "Categoria" + " SET"
                + " nombre = ?,"
                + " idDepartamento = ?"
                + " estado = ?"
                + " WHERE " + " idCategoria" + " = ?;";
       

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, bean.getNombre());
            ps.setInt(2, bean.getIdDepartamento());
            ps.setString(3, bean.isEstado()+"");
            ps.setInt(4, bean.getIdCategoria());
            if (ps.executeUpdate() == 1) {
                ps.close();
                return true;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
        public boolean baja(int id) {
        String query= "UPDATE Categoria SET estado='false' WHERE idCategoria= ?;";
         
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, id);
            
            if(ps.executeUpdate()==1){
                 ps.close();
                return true;
                    
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         return false;
     }        
         
        public boolean add(CategoriaBean bean) {
            
        String query = "INSERT INTO Categoria"
                + " (nombre,estado, idDepartamento)"
                + " VALUES (?, ?, ?);";
        

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, bean.getNombre());
            ps.setString(2, bean.isEstado()+"");
            ps.setInt(3, bean.getIdDepartamento());            
           
            if (ps.executeUpdate() == 1) {

                ps.close();
                return true;
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
