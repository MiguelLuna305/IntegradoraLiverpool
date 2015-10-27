/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.CategoriaBean;
import Beans.DepartamentoBean;
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
public class DepartamentoDao {
    Connection con;
    
        public List<DepartamentoBean> getAll() {
        String query = "SELECT * FROM Categoria"
                + " ORDER BY idCategoria;";
        List<DepartamentoBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<DepartamentoBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        List<DepartamentoBean> passResultSet(ResultSet res, List<DepartamentoBean> list) throws SQLException {

        while (res.next()) {
            DepartamentoBean dp = new DepartamentoBean();
            dp.setIdDepartamento(res.getInt("idDepartamento"));
            dp.setNombre(res.getString("nombre"));
            dp.setEstado(res.getBoolean("estado"));
            list.add(dp);
        }

        return list;
    }
        
        public List<DepartamentoBean> getActive() {
        String query = "SELECT * FROM Departamento WHERE estado = 'true'"
                + " ORDER BY idDepartmento ASC;";
        List<DepartamentoBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<DepartamentoBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        public DepartamentoBean get(int id) {
        DepartamentoBean departamento = new DepartamentoBean();
        String query = "SELECT * FROM " + "Departamento" + " WHERE " + "idDepartamento" + " = ?";

        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                
                departamento.setIdDepartamento(result.getInt("idDepartamento"));
                departamento.setNombre(result.getString("nombre"));
                departamento.setEstado(result.getBoolean("estado"));               
                
                
            }

            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return departamento;
    }
        
        
        public boolean update(DepartamentoBean bean) {

     
        String query = "UPDATE " + "Departamento" + " SET"
                + " nombre = ?,"
                + " estado = ?"
                + " WHERE " + " idDepartamento" + " = ?;";
       

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
            Logger.getLogger(DepartamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
        public boolean baja(int id) {
        String query= "UPDATE Departamento SET estado='false' WHERE idDepartamento= ?;";
         
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
         
        public boolean add(DepartamentoBean bean) {
            
        String query = "INSERT INTO Departamento"
                + " (nombre, estado)"
                + " VALUES (?, ?);";
        

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, bean.getNombre());
            ps.setString(2, bean.isEstado()+"");
           
            if (ps.executeUpdate() == 1) {

                ps.close();
                return true;
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
