/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.soft;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;


/**
 *
 * @author Manne25
 */
public class Consultas {
     JPanel pnlNominas = new javax.swing.JPanel();
     DefaultTableModel modelo= new DefaultTableModel();
     
     JScrollPane scroll=new JScrollPane();
     JTable tabla = new JTable();
     JButton btnBuscar = new javax.swing.JButton();
     JButton btnEliminar = new javax.swing.JButton();
     
     public void aparienciaNominas(){
        pnlNominas.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte de Nominas"));
        modelo.addColumn("Numero Empleado");
        modelo.addColumn("Nombre");        
        modelo.addColumn("Apellidos");        
        modelo.addColumn("Sueldo Bruto");
        modelo.addColumn("Descuentos");
        modelo.addColumn("Sueldo Neto");
        tabla.setModel(modelo);
        scroll.setViewportView(tabla);
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Buscar();
            }
        });
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiar();
            }
        });        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        pnlNominas.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 0;
        gbc.insets = new Insets(0,10,0,10);
        pnlNominas.add(scroll,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;
        pnlNominas.add(btnBuscar,gbc);        
        gbc.gridwidth =1;
        pnlNominas.add(btnEliminar,gbc);
    }   
    public void Buscar(){    
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.empleado ;";
                ResultSet rs=null;
                rs = st.executeQuery(consulta);
                while(rs.next()){                    
                    Object[] data ={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(7),rs.getString(12),rs.getString(11)};
                    modelo.addRow(data);
                }                
                rs.close();
                st.close();
                conexion.close();
        }
        catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog( null,"Consulta Generada", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    public void limpiar(){
        for(int x=0;x<modelo.getRowCount();x++){
            modelo.removeRow(x);
        }
    }
    
    
}
