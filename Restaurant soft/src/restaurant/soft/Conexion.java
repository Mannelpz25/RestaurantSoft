/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.soft;

/**
 *
 * @author Manne25
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {
    public void insertarInventario(String cod,String art, String suc, String id, String exi, String mar){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String insercion ="INSERT INTO restaurant_soft.articulo VALUES ('"+cod+"','"+art+"','"+suc+"','"+id+"','"+exi+"','"+mar+"');";
                st.executeUpdate(insercion);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Guardado con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void eliminarInventario(String cod, String suc){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String eliminar ="DELETE FROM restaurant_soft.articulo WHERE codigo='"+cod+"' AND sucursal='"+suc+"';";
                st.executeUpdate(eliminar);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Insumo eliminado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void modificarInventario(String cod,String art, String suc, String id, String exi, String mar){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String actualizar ="UPDATE restaurant_soft.articulo SET codigo='"+cod+"', articulo='"+art+"', sucursal='"+suc+"', idTipoInsumo='"+id+"', existencia='"+exi+"',marca='"+mar+"' WHERE codigo='"+cod+"' AND sucursal='"+suc+"';";
                st.executeUpdate(actualizar);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Insumo actualizado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void insertarEmpleado(String num,String nom, String ap, String fn, String curp, String rfc, String sue, String pue, String suc, String fi){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String insercion ="INSERT INTO restaurant_soft.empleado VALUES ('"+num+"','"+nom+"','"+ap+"','"+fn+"','"+curp+"','"+rfc+"','"+sue+"','"+pue+"','"+suc+"','"+fi+"',null,null);";
                st.executeUpdate(insercion);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Guardado con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void modificarEmpleado(String num,String nom, String ap, String fn, String curp, String rfc, String sue, String pue, String suc, String fi){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String actualizar ="UPDATE restaurant_soft.empleado SET numeroEmpleado='"+num+"', nombre='"+nom+"', apellidos='"+ap+"', fechaNacimiento='"+fn+"', curp='"+curp+"',rfc='"+rfc+"',sueldo='"+sue+"' ,puesto='"+pue+"' ,sucursal='"+suc+"' ,fechaIngreso='"+fi+"'  WHERE numeroEmpleado='"+num+"';";
                st.executeUpdate(actualizar);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Empleado actualizado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void eliminarEmpleado(String num){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String eliminar ="DELETE FROM restaurant_soft.empleado WHERE numeroEmpleado='"+num+"' ;";
                st.executeUpdate(eliminar);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Empleado eliminado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    public void actualizarNomina(String num, String des, String sueN){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String actualizar ="UPDATE restaurant_soft.empleado SET descuentos='"+des+"', sueldoNeto='"+sueN+"' WHERE numeroEmpleado='"+num+"';";
                st.executeUpdate(actualizar);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog( null,"Nomina generada", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        
    }
            
           
}
