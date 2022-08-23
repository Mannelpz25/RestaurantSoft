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
public class RecursosHumanos {
    Conexion BD = new Conexion();
    //Componentes graficos Alta
    JPanel pnlAlta = new javax.swing.JPanel();
    JLabel lblNumeroEmpleado = new javax.swing.JLabel();
    JTextField txtNumeroEmpleado = new javax.swing.JTextField();
    JLabel lblNombre = new javax.swing.JLabel();
    JTextField txtNombre = new javax.swing.JTextField();
    JLabel lblApellidos = new javax.swing.JLabel();
    JTextField txtApellidos= new javax.swing.JTextField();
    JLabel lblFechaNac = new javax.swing.JLabel();
    JTextField txtFechaNac = new javax.swing.JTextField();
    JLabel lblCURP = new javax.swing.JLabel();
    JTextField txtCURP = new javax.swing.JTextField();
    JLabel lblRFC = new javax.swing.JLabel();
    JTextField txtRFC = new javax.swing.JTextField();
    JLabel lblSueldo = new javax.swing.JLabel();
    JTextField txtSueldo= new javax.swing.JTextField();
    JLabel lblPuesto = new javax.swing.JLabel();
    JTextField txtPuesto = new javax.swing.JTextField();
    JLabel lblSucursal = new javax.swing.JLabel();
    JComboBox cmbSucursal = new javax.swing.JComboBox();  
    JLabel lblFechaIng = new javax.swing.JLabel();
    JTextField txtFechaIng = new javax.swing.JTextField();
    JButton btnGuardar = new javax.swing.JButton();
    JButton btnLimpiar = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    //Componentes graficos Baja
    JPanel pnlBaja = new javax.swing.JPanel();
    JTextField txtNumeroEmpleadoB = new javax.swing.JTextField();    
    JButton btnBuscar = new javax.swing.JButton();
    JTextField txtNombreB = new javax.swing.JTextField();
    JTextField txtApellidosB= new javax.swing.JTextField();
    JTextField txtFechaNacB = new javax.swing.JTextField();
    JTextField txtCURPB = new javax.swing.JTextField();
    JTextField txtRFCB = new javax.swing.JTextField();
    JTextField txtSueldoB= new javax.swing.JTextField();
    JTextField txtPuestoB = new javax.swing.JTextField();
    JComboBox cmbSucursalB = new javax.swing.JComboBox(); 
    JTextField txtFechaIngB = new javax.swing.JTextField();
    JButton btnNuevaBusqueda = new javax.swing.JButton();
    JButton btnEliminar= new javax.swing.JButton();
    JButton btnSalirB = new javax.swing.JButton();
    //Componentes graficos Modificar
    JPanel pnlMod = new javax.swing.JPanel();
    JTextField txtNumeroEmpleadoM = new javax.swing.JTextField();    
    JButton btnBuscarM = new javax.swing.JButton();
    JTextField txtNombreM = new javax.swing.JTextField();
    JTextField txtApellidosM= new javax.swing.JTextField();
    JTextField txtFechaNacM = new javax.swing.JTextField();
    JTextField txtCURPM = new javax.swing.JTextField();
    JTextField txtRFCM = new javax.swing.JTextField();
    JTextField txtSueldoM= new javax.swing.JTextField();
    JTextField txtPuestoM = new javax.swing.JTextField();
    JComboBox cmbSucursalM = new javax.swing.JComboBox(); 
    JTextField txtFechaIngM = new javax.swing.JTextField();
    JButton btnGuardarM = new javax.swing.JButton();
    JButton btnSalirM = new javax.swing.JButton();
    
    public void aparienciaAlta(){
        pnlAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta"));
        lblNumeroEmpleado.setText("Numero de empleado:");
        lblNombre.setText("Nombre:");
        lblApellidos.setText("Apellidos:");
        lblFechaNac.setText("Fecha de nacimiento:");
        lblCURP.setText("CURP:");
        lblRFC.setText("RFC:");
        lblSueldo.setText("Sueldo bruto:");
        lblPuesto.setText("Puesto:");
        lblSucursal.setText("Sucursal:");    
        lblFechaIng.setText("Fecha de ingreso:");
        cmbSucursal.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                guardar();
            }
        });
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiar();
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
        pnlAlta.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlAlta.add(lblNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtNumeroEmpleado, gbc);
        gbc.gridwidth = 1;        
        pnlAlta.add(lblNombre,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtNombre,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblApellidos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtApellidos,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblFechaNac,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtFechaNac,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblCURP,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtCURP,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblRFC,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtRFC,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblSueldo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtSueldo,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblPuesto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtPuesto,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblSucursal,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(cmbSucursal,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblFechaIng,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtFechaIng,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(btnGuardar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnLimpiar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnSalir,gbc);       
        
        
    }
    public void guardar(){
        if("".equals(txtNumeroEmpleado.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Empleado emp = new Empleado();
        emp.numeroEmpleado = txtNumeroEmpleado.getText();
        emp.nombre = txtNombre.getText();
        emp.apellidos = txtApellidos.getText();
        emp.fechaNacimiento = txtFechaNac.getText();
        emp.curp = txtCURP.getText();
        emp.rfc = txtRFC.getText();
        emp.sueldo = txtSueldo.getText();
        emp.puesto = txtPuesto.getText();
        emp.sucursal = cmbSucursal.getSelectedItem().toString();
        emp.fechaIngreso = txtFechaIng.getText();
        BD.insertarEmpleado(emp.numeroEmpleado,emp.nombre,emp.apellidos,emp.fechaNacimiento,emp.curp,emp.rfc,emp.sueldo,emp.puesto,emp.sucursal,emp.fechaIngreso); 
        //limpiar();
    }
    public void limpiar(){
        
        txtNumeroEmpleado.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtFechaNac.setText("");
        txtCURP.setText("");
        txtRFC.setText("");
        txtSueldo.setText("");
        txtPuesto.setText("");
        txtFechaIng.setText("");
        txtNumeroEmpleadoB.setText("");
        txtNombreB.setText("");
        txtApellidosB.setText("");
        txtFechaNacB.setText("");
        txtCURPB.setText("");
        txtRFCB.setText("");
        txtSueldoB.setText("");
        txtPuestoB.setText("");
        txtFechaIngB.setText("");
        txtNumeroEmpleadoM.setText("");
        txtNombreM.setText("");
        txtApellidosM.setText("");
        txtFechaNacM.setText("");
        txtCURPM.setText("");
        txtRFCM.setText("");
        txtSueldoM.setText("");
        txtPuestoM.setText("");
        txtFechaIngM.setText("");
        JOptionPane.showMessageDialog( null,"Limpiar con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }        
    public void aparienciaBaja(){
        pnlBaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Baja"));
        lblNumeroEmpleado.setText("Numero de empleado:");
        lblNombre.setText("Nombre:");
        lblApellidos.setText("Apellidos:");
        lblFechaNac.setText("Fecha de nacimiento:");
        lblCURP.setText("CURP:");
        lblRFC.setText("RFC:");
        lblSueldo.setText("Sueldo bruto:");
        lblPuesto.setText("Puesto:");
        lblSucursal.setText("Sucursal:");    
        lblFechaIng.setText("Fecha de ingreso:");
        cmbSucursalB.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));
        txtNombreB.setEnabled(false);
        txtApellidosB.setEnabled(false);
        txtFechaNacB.setEnabled(false);
        txtCURPB.setEnabled(false);
        txtRFCB.setEnabled(false);
        txtSueldoB.setEnabled(false);
        txtPuestoB.setEnabled(false);
        cmbSucursalB.setEnabled(false);
        txtFechaIngB.setEnabled(false);        
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Buscar();
            }
        });
        btnNuevaBusqueda.setText("Nueva Busqueda");
        btnNuevaBusqueda.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiar();
            }
        });
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Eliminar();
            }
        });
        btnSalirB.setText("Salir");
        btnSalirB.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        pnlBaja.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlBaja.add(lblNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtNumeroEmpleadoB, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnBuscar,gbc); 
        gbc.gridwidth = 1;        
        pnlBaja.add(lblNombre,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtNombreB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblApellidos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtApellidosB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblFechaNac,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtFechaNacB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblCURP,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtCURPB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblRFC,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtRFCB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblSueldo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtSueldoB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblPuesto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtPuestoB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblSucursal,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(cmbSucursalB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblFechaIng,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtFechaIngB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(btnNuevaBusqueda,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnEliminar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnSalirB,gbc);             
    }    
    public void Buscar(){
        Empleado emp = new Empleado();        
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.empleado WHERE numeroEmpleado='"+txtNumeroEmpleadoB.getText()+"';";
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
                    txtNombreB.setText(emp.nombre);
                    txtApellidosB.setText(emp.apellidos);
                    txtFechaNacB.setText(emp.fechaNacimiento);
                    txtCURPB.setText(emp.curp);
                    txtRFCB.setText(emp.rfc);
                    txtSueldoB.setText(emp.sueldo);
                    txtPuestoB.setText(emp.puesto);
                    cmbSucursalB.setSelectedItem(emp.sucursal);
                    txtFechaIngB.setText(emp.fechaIngreso);                    
                    cmbSucursalB.setSelectedItem(emp.sucursal);
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
    public void Eliminar(){
        if("".equals(txtNumeroEmpleadoB.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Empleado emp = new Empleado();
        emp.numeroEmpleado = txtNumeroEmpleadoB.getText();     
        BD.eliminarEmpleado(emp.numeroEmpleado); 
        limpiar();
    }
    public void aparienciaModificar(){
        pnlMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar"));
        lblNumeroEmpleado.setText("Numero de empleado:");
        lblNombre.setText("Nombre:");
        lblApellidos.setText("Apellidos:");
        lblFechaNac.setText("Fecha de nacimiento:");
        lblCURP.setText("CURP:");
        lblRFC.setText("RFC:");
        lblSueldo.setText("Sueldo bruto:");
        lblPuesto.setText("Puesto:");
        lblSucursal.setText("Sucursal:");    
        lblFechaIng.setText("Fecha de ingreso:");
        cmbSucursalM.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));     
        txtNombreM.setEnabled(false);
        txtApellidosM.setEnabled(false);
        txtFechaNacM.setEnabled(false);
        txtCURPM.setEnabled(false);
        txtRFCM.setEnabled(false);
        txtSueldoM.setEnabled(false);
        txtPuestoM.setEnabled(false);
        cmbSucursalM.setEnabled(false);
        txtFechaIngM.setEnabled(false);
        btnBuscarM.setText("Buscar");
        btnBuscarM.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                BuscarM();
            }
        });
        btnGuardarM.setText("Guardar");
        btnGuardarM.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                actualizar();
            }
        });
        
        btnSalirM.setText("Salir");
        btnSalirM.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        pnlMod.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlMod.add(lblNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtNumeroEmpleadoM, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnBuscarM,gbc); 
        gbc.gridwidth = 1;        
        pnlMod.add(lblNombre,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtNombreM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblApellidos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtApellidosM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblFechaNac,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtFechaNacM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblCURP,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtCURPM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblRFC,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtRFCM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblSueldo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtSueldoM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblPuesto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtPuestoM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblSucursal,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(cmbSucursalM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblFechaIng,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtFechaIngM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(btnGuardarM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnSalirM,gbc);             
    }     
    public void actualizar(){
        if("".equals(txtNumeroEmpleadoM.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Empleado emp = new Empleado();
        emp.numeroEmpleado = txtNumeroEmpleadoM.getText();
        emp.nombre = txtNombreM.getText();
        emp.apellidos = txtApellidosM.getText();
        emp.fechaNacimiento = txtFechaNacM.getText();
        emp.curp = txtCURPM.getText();
        emp.rfc = txtRFCM.getText();
        emp.sueldo = txtSueldoM.getText();
        emp.puesto = txtPuestoM.getText();
        emp.sucursal = cmbSucursalM.getSelectedItem().toString();
        emp.fechaIngreso = txtFechaIngM.getText();    
        BD.modificarEmpleado(emp.numeroEmpleado,emp.nombre,emp.apellidos,emp.fechaNacimiento,emp.curp,emp.rfc,emp.sueldo,emp.puesto,emp.sucursal,emp.fechaIngreso); 
        
        txtNumeroEmpleadoM.setEnabled(true);
        txtNombreM.setEnabled(false);
        txtApellidosM.setEnabled(false);
        txtFechaNacM.setEnabled(false);
        txtCURPM.setEnabled(false);
        txtRFCM.setEnabled(false);
        txtSueldoM.setEnabled(false);
        txtPuestoM.setEnabled(false);
        cmbSucursalM.setEnabled(false);
        txtFechaIngM.setEnabled(false);
        limpiar();
    }
    public void BuscarM(){
        Empleado emp = new Empleado();        
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.empleado WHERE numeroEmpleado='"+txtNumeroEmpleadoM.getText()+"';";
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
                    txtNombreM.setText(emp.nombre);
                    txtApellidosM.setText(emp.apellidos);
                    txtFechaNacM.setText(emp.fechaNacimiento);
                    txtCURPM.setText(emp.curp);
                    txtRFCM.setText(emp.rfc);
                    txtSueldoM.setText(emp.sueldo);
                    txtPuestoM.setText(emp.puesto);
                    cmbSucursalM.setSelectedItem(emp.sucursal);
                    txtFechaIngM.setText(emp.fechaIngreso);
                    txtNumeroEmpleadoM.setEnabled(false);
                    txtNombreM.setEnabled(true);
                    txtApellidosM.setEnabled(true);
                    txtFechaNacM.setEnabled(true);
                    txtCURPM.setEnabled(true);
                    txtRFCM.setEnabled(true);
                    txtSueldoM.setEnabled(true);
                    txtPuestoM.setEnabled(true);
                    cmbSucursalM.setEnabled(true);
                    
                    cmbSucursalM.setSelectedItem(emp.sucursal);
                    txtFechaIngM.setEnabled(true);
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
            
}
