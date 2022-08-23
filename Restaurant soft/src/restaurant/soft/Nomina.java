/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.soft;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
/**
 *
 * @author Manne25
 */
public class Nomina {
    Conexion BD = new Conexion();
    Empleado emp = new Empleado();  
    //Componentes graficos Calculo Nomina
    JPanel pnlCalc = new javax.swing.JPanel();
    JLabel lblNumeroEmpleado = new javax.swing.JLabel();
    JTextField txtNumeroEmpleado = new javax.swing.JTextField();
    JButton btnBuscar = new javax.swing.JButton();
    JLabel lblNombre= new javax.swing.JLabel();
    JTextField txtNombre = new javax.swing.JTextField();
    JLabel lblApellidos = new javax.swing.JLabel();
    JTextField txtApellidos= new javax.swing.JTextField();
    JLabel lblRFC= new javax.swing.JLabel();
    JTextField txtRFC = new javax.swing.JTextField();
    JLabel lblSueldoBruto = new javax.swing.JLabel();
    JTextField txtSueldoBruto= new javax.swing.JTextField();
    JLabel lblImpuestos= new javax.swing.JLabel();
    JTextField txtImpuestos = new javax.swing.JTextField();
    JLabel lblSueldoNeto = new javax.swing.JLabel();
    JTextField txtSueldoNeto= new javax.swing.JTextField();
    JButton btnNuevoCalculo = new javax.swing.JButton();
    JButton btnCalcularNomina = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    
     public void aparienciaCalc(){
        pnlCalc.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular Nomina"));
        lblNumeroEmpleado.setText("Numero de empleado:");
        lblNombre.setText("Nombre:");
        lblApellidos.setText("Apellidos:");
        lblRFC.setText("RFC:"); 
        lblSueldoBruto.setText("Sueldo Bruto:");
        lblImpuestos.setText("Porcentaje de impuestos:");
        lblSueldoNeto.setText("Sueldo Neto:");
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtRFC.setEnabled(false);
        txtSueldoBruto.setEnabled(false);
        txtSueldoNeto.setEnabled(false);
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Buscar();
            }
        });
        btnNuevoCalculo.setText("Nuevo Calculo");
        btnNuevoCalculo.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiar();
            }
        });
        btnCalcularNomina.setText("Calcular Nomina");
        btnCalcularNomina.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                CalcularNomina();
            }
        });
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        pnlCalc.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlCalc.add(lblNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(btnBuscar,gbc); 
        gbc.gridwidth = 1;        
        pnlCalc.add(lblNombre,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtNombre,gbc);
        gbc.gridwidth = 1;
        pnlCalc.add(lblApellidos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtApellidos,gbc);
        gbc.gridwidth = 1;
        pnlCalc.add(lblRFC,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtRFC,gbc);
         gbc.gridwidth = 1;
        pnlCalc.add(lblSueldoBruto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtSueldoBruto,gbc);
        gbc.gridwidth = 1;
        pnlCalc.add(lblImpuestos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtImpuestos,gbc);
        gbc.gridwidth = 1;
        pnlCalc.add(lblSueldoNeto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(txtSueldoNeto,gbc);
        pnlCalc.add(btnNuevoCalculo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(btnCalcularNomina,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlCalc.add(btnSalir,gbc);             
    }    
    public void Buscar(){      
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.empleado WHERE numeroEmpleado='"+txtNumeroEmpleado.getText()+"';";
                ResultSet rs=null;
                rs = st.executeQuery(consulta);
                if(rs.next()){                    
                    emp.numeroEmpleado = rs.getString("numeroEmpleado");
                    emp.nombre = rs.getString("nombre");
                    emp.apellidos = rs.getString("apellidos");
                    emp.fechaNacimiento = rs.getString("fechaNacimiento");
                    emp.curp = rs.getString("curp");
                    emp.rfc = rs.getString("rfc");
                    emp.sueldo = rs.getString("sueldo");
                    emp.puesto = rs.getString("puesto");
                    emp.sucursal = rs.getString("sucursal");
                    emp.fechaIngreso = rs.getString("fechaIngreso");
                    txtNombre.setText(emp.nombre);
                    txtApellidos.setText(emp.apellidos);
                    txtRFC.setText(emp.rfc);
                    txtSueldoBruto.setText(emp.sueldo);
                }                
                rs.close();
                st.close();
                conexion.close();
            }
        catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog( null,"Empleado encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    } 
    
    public void limpiar(){
        
        txtNumeroEmpleado.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtRFC.setText("");
        txtSueldoBruto.setText("");
        txtImpuestos.setText("");
        txtSueldoNeto.setText("");
        JOptionPane.showMessageDialog( null,"Limpiar con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    } 
    public void CalcularNomina(){
        if("".equals(txtNumeroEmpleado.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
           int imp = Integer.parseInt(txtImpuestos.getText());
            int des = (int) ((imp*.01)*Integer.parseInt(emp.sueldo));
            emp.descuentos = Integer.toString(des);
            int tot = Integer.parseInt(emp.sueldo)-des;
            emp.sueldoNeto = Integer.toString(tot);
            txtSueldoNeto.setText(emp.sueldoNeto);
            BD.actualizarNomina(emp.numeroEmpleado, emp.descuentos, emp.sueldoNeto); 
        }
        
        
    }
}
