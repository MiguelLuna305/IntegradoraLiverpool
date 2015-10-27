/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.DepartamentoBean;
import Beans.ProductoBean;
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
public class ProductoDao {
    Connection con;
    
        public List<ProductoBean> getAll() {
        String query = "SELECT * FROM Producto"
                + " ORDER BY idProducto;";
        List<ProductoBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<ProductoBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        List<ProductoBean> passResultSet(ResultSet res, List<ProductoBean> list) throws SQLException {

        while (res.next()) {
            ProductoBean pr = new ProductoBean();
            pr.setIdProducto(res.getInt("idProducto"));
            pr.setCodigo(res.getInt("codigo"));
            pr.setNombre(res.getString("nombre"));
            pr.setPrecioVenta(res.getFloat("precioVenta"));
            pr.setPrecioCompra(res.getFloat("precioCompra"));
            pr.setExistencias(res.getInt("existencias"));
            pr.setEstado(res.getBoolean("estado"));
            pr.setStock(res.getInt("stock"));
            pr.setMarca(res.getString("marca"));
            pr.setIdCategoria(res.getInt("idCategoria"));
            list.add(pr);
        }

        return list;
    }
        
        public List<ProductoBean> getActive() {
        String query = "SELECT * FROM Producto WHERE estado = 'true'"
                + " ORDER BY idProducto ASC;";
        List<ProductoBean> list = new ArrayList<>();
        try {
            PreparedStatement sql = con.prepareStatement(query);
            list = (List<ProductoBean>) passResultSet(sql.executeQuery(), list);
            sql.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
        
        public ProductoBean get(int id) {
        ProductoBean producto = new ProductoBean();
        String query = "SELECT * FROM " + "Producto" + " WHERE " + "idProducto" + " = ?";

        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                
                producto.setIdProducto(result.getInt("idProducto"));
                producto.setCodigo(result.getInt("codigo")); 
                producto.setNombre(result.getString("nombre"));
                producto.setPrecioVenta(result.getFloat("precioVenta"));
                producto.setPrecioCompra(result.getFloat("precioCompra"));
                producto.setExistencias(result.getInt("existencias"));
                producto.setEstado(result.getBoolean("estado"));
                producto.setStock(result.getInt("stock"));
                producto.setMarca(result.getString("marca"));
                producto.setIdCategoria(result.getInt("idCategoria"));          
                }

            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return producto;
    }
        
        
        public boolean update(ProductoBean bean) {

     
        String query = "UPDATE " + "Producto" + " SET"
                + " codigo = ?,"
                + " nombre = ?,"
                + " precioVenta = ?,"
                + " precioCompra = ?,"
                + " existencias = ?,"
                + " estado = ?,"
                + " stock = ?"
                + " marca = ?,"
                + " idCategoria = ?,"
                + " WHERE " + " idProducto" + " = ?;";
       

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bean.getCodigo());
            ps.setString(2, bean.getNombre());
            ps.setFloat(3, bean.getPrecioVenta());
            ps.setFloat(4, bean.getPrecioCompra());
            ps.setInt(5, bean.getExistencias());
            ps.setString(6, bean.isEstado()+"");
            ps.setInt(7, bean.getStock());
            ps.setString(8, bean.getMarca());
            ps.setInt(9, bean.getIdCategoria());
            ps.setInt(10, bean.getIdProducto());
            
            if (ps.executeUpdate() == 1) {
                ps.close();
                return true;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
        public boolean baja(int id) {
        String query= "UPDATE Producto SET estado='false' WHERE idProducto= ?;";
         
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, id);
            
            if(ps.executeUpdate()==1){
                 ps.close();
                return true;
                    
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         return false;
     }        
         
        public boolean add(ProductoBean bean) {
            
        String query = "INSERT INTO Producto"
                + " (codigo,nombre, precioVenta, precioCompra, existencias, estado, stock, marca, idCategoria)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bean.getCodigo());
            ps.setString(2, bean.getNombre());
            ps.setFloat(3, bean.getPrecioVenta());
            ps.setFloat(4, bean.getPrecioCompra());
            ps.setInt(5, bean.getExistencias());
            ps.setString(6, bean.isEstado()+"");
            ps.setInt(7, bean.getStock());
            ps.setString(8, bean.getMarca());
            ps.setInt(9, bean.getIdCategoria());
           
            if (ps.executeUpdate() == 1) {

                ps.close();
                return true;
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
