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
import javax.swing.*;

public class Reportes {
    //Componentes Reporte de Personal
    JPanel pnlRPer = new javax.swing.JPanel();
    JLabel lblNumeroEmpleado = new javax.swing.JLabel();
    JTextField txtNumeroEmpleado = new javax.swing.JTextField();
    JButton btnBuscar = new javax.swing.JButton();
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
    JButton btnNuevoReporte = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    
    //Componentes graficos Reporte de Inventario
    JPanel pnlRInv = new javax.swing.JPanel();
    JLabel lblCodigo = new javax.swing.JLabel();
    JTextField txtCodigo = new javax.swing.JTextField();
    JLabel lblSucursalI = new javax.swing.JLabel();
    JComboBox cmbSucursalI = new javax.swing.JComboBox();    
    JButton btnBuscarI = new javax.swing.JButton();
    JLabel lblTipo = new javax.swing.JLabel();
    JTextField txtTipo = new javax.swing.JTextField();
    JLabel lblExistencia = new javax.swing.JLabel();
    JSpinner spnExistencia = new javax.swing.JSpinner();
    JLabel lblMarca = new javax.swing.JLabel();
    JTextField txtMarca = new javax.swing.JTextField();
    JButton btnNuevaBusqueda = new javax.swing.JButton();
    JButton btnSalirI = new javax.swing.JButton();
    
    public void aparienciaRPer(){
        pnlRPer.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte de Personal"));
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
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtFechaNac.setEnabled(false);
        txtCURP.setEnabled(false);
        txtRFC.setEnabled(false);
        txtSueldo.setEnabled(false);
        txtPuesto.setEnabled(false);
        cmbSucursal.setEnabled(false);
        txtFechaIng.setEnabled(false);
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Buscar();
            }
        });
        btnNuevoReporte.setText("Nuevo Reporte");
        btnNuevoReporte.addMouseListener(new MouseAdapter(){
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
        pnlRPer.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlRPer.add(lblNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtNumeroEmpleado, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(btnBuscar,gbc); 
        gbc.gridwidth = 1;        
        pnlRPer.add(lblNombre,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtNombre,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblApellidos,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtApellidos,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblFechaNac,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtFechaNac,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblCURP,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtCURP,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblRFC,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtRFC,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblSueldo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtSueldo,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblPuesto,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtPuesto,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblSucursal,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(cmbSucursal,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(lblFechaIng,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(txtFechaIng,gbc);
        gbc.gridwidth = 1;
        pnlRPer.add(btnNuevoReporte,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRPer.add(btnSalir,gbc);             
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
        txtCodigo.setText("");
        txtMarca.setText("");
        txtTipo.setText("");
        spnExistencia.setValue(0);
        JOptionPane.showMessageDialog( null,"Limpiar con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }        
    
    public void Buscar(){
        JOptionPane.showMessageDialog( null,"Empleado encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }   
    public void BuscarI(){
        JOptionPane.showMessageDialog( null,"Inventario encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void aparienciaRInv(){
        pnlRInv.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte de Inventario"));
        lblCodigo.setText("Codigo:");
        lblSucursalI.setText("Sucursal:");
        lblTipo.setText("Tipo de insumo:");
        lblExistencia.setText("Existencia:");
        lblMarca.setText("Marca:");
        cmbSucursalI.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Cemtro"}));
        spnExistencia.setModel(new javax.swing.SpinnerNumberModel(0,0,9999,1));
        txtMarca.setEnabled(false);
        txtTipo.setEnabled(false);
        spnExistencia.setEnabled(false);
        btnBuscarI.setText("Buscar");
        btnBuscarI.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                BuscarI();
            }
        });
        btnNuevaBusqueda.setText("Nueva Busqueda");
        btnNuevaBusqueda.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiar();
            }
        });
        btnSalirI.setText("Salir");
        btnSalirI.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        pnlRInv.setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,10,0,10);
        pnlRInv.add(lblCodigo, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(txtCodigo, gbc);
        gbc.gridwidth = 1;
        pnlRInv.add(lblSucursalI, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(cmbSucursalI, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(btnBuscarI,gbc);
        gbc.gridwidth = 1;
        pnlRInv.add(lblTipo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(txtTipo,gbc);
        gbc.gridwidth = 1;
        pnlRInv.add(lblExistencia,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(spnExistencia,gbc);
        gbc.gridwidth = 1;
        pnlRInv.add(lblMarca,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(txtMarca,gbc);
        gbc.gridwidth = 1;
        pnlRInv.add(btnNuevaBusqueda,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlRInv.add(btnSalirI,gbc);             
    }    
    
    
}
