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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Inventario {
    Conexion BD = new Conexion();
    
    //Componentes graficos Alta
    JPanel pnlAlta = new javax.swing.JPanel();
    JLabel lblCodigo = new javax.swing.JLabel();
    JTextField txtCodigo = new javax.swing.JTextField();
    JLabel lblArticulo = new javax.swing.JLabel();
    JTextField txtArticulo = new javax.swing.JTextField();
    JLabel lblSucursal = new javax.swing.JLabel();
    JComboBox cmbSucursal = new javax.swing.JComboBox();
    JLabel lblTipo = new javax.swing.JLabel();
    JTextField txtTipo = new javax.swing.JTextField();
    JLabel lblExistencia = new javax.swing.JLabel();
    JSpinner spnExistencia = new javax.swing.JSpinner();
    JLabel lblMarca = new javax.swing.JLabel();
    JTextField txtMarca = new javax.swing.JTextField();
    JButton btnGuardar = new javax.swing.JButton();
    JButton btnLimpiar = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    //Componentes graficos Baja
    JPanel pnlBaja = new javax.swing.JPanel();
    JLabel lblCodigoB = new javax.swing.JLabel();
    JTextField txtCodigoB = new javax.swing.JTextField();
    JLabel lblSucursalB = new javax.swing.JLabel();
    JComboBox cmbSucursalB = new javax.swing.JComboBox();    
    JLabel lblArticuloB = new javax.swing.JLabel();
    JTextField txtArticuloB = new javax.swing.JTextField();
    JLabel lblTipoB = new javax.swing.JLabel();
    JTextField txtTipoB = new javax.swing.JTextField();
    JLabel lblExistenciaB = new javax.swing.JLabel();
    JSpinner spnExistenciaB = new javax.swing.JSpinner();
    JLabel lblMarcaB = new javax.swing.JLabel();
    JTextField txtMarcaB = new javax.swing.JTextField();
    JButton btnBuscar = new javax.swing.JButton();
    JButton btnNuevaBusqueda = new javax.swing.JButton();
    JButton btnEliminar = new javax.swing.JButton();
    JButton btnSalirB = new javax.swing.JButton(); 
    //Componentes graficos Modificar
    JPanel pnlMod = new javax.swing.JPanel();
    JLabel lblCodigoM = new javax.swing.JLabel();
    JTextField txtCodigoM = new javax.swing.JTextField();
    JLabel lblSucursalM = new javax.swing.JLabel();
    JComboBox cmbSucursalM = new javax.swing.JComboBox();    
    JLabel lblArticuloM = new javax.swing.JLabel();
    JTextField txtArticuloM = new javax.swing.JTextField();
    JLabel lblTipoM = new javax.swing.JLabel();
    JTextField txtTipoM = new javax.swing.JTextField();
    JLabel lblExistenciaM = new javax.swing.JLabel();
    JSpinner spnExistenciaM = new javax.swing.JSpinner();
    JLabel lblMarcaM = new javax.swing.JLabel();
    JTextField txtMarcaM = new javax.swing.JTextField();
    JButton btnBuscarM = new javax.swing.JButton();
    JButton btnGuardarM = new javax.swing.JButton();
    JButton btnSalirM = new javax.swing.JButton();
    
    public void aparienciaAlta(){
        pnlAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta"));
        lblCodigo.setText("Codigo:");
        lblArticulo.setText("Articulo:");
        lblSucursal.setText("Sucursal:");
        lblTipo.setText("Tipo de insumo:");
        lblExistencia.setText("Existencia:");
        lblMarca.setText("Marca:");
        cmbSucursal.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));
        spnExistencia.setModel(new javax.swing.SpinnerNumberModel(0,0,9999,1));
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
        pnlAlta.add(lblCodigo, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtCodigo, gbc);
        gbc.gridwidth = 1;        
        pnlAlta.add(lblArticulo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtArticulo,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblSucursal, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(cmbSucursal, gbc);        
        gbc.gridwidth = 1;
        pnlAlta.add(lblTipo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtTipo,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblExistencia,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(spnExistencia,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblMarca,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtMarca,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(btnGuardar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnLimpiar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnSalir,gbc);       
        
        
    }
    public void guardar(){
        if("".equals(txtCodigo.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Articulo art = new Articulo();
        art.codigo = txtCodigo.getText();
        art.articulo = txtArticulo.getText();
        art.sucursal = cmbSucursal.getSelectedItem().toString();
        art.idTipoInsumo = txtTipo.getText();
        art.existencia = spnExistencia.getValue().toString();
        art.marca = txtMarca.getText();
        BD.insertarInventario(art.codigo,art.articulo,art.sucursal,art.idTipoInsumo,art.existencia,art.marca); 
        limpiar();
        
    }
    public void limpiar(){
        txtCodigo.setText("");
        txtArticulo.setText("");
        txtMarca.setText("");
        txtTipo.setText("");
        spnExistencia.setValue(0);
        txtCodigoB.setText("");
        txtArticuloB.setText("");
        txtMarcaB.setText("");
        txtTipoB.setText("");
        spnExistenciaB.setValue(0);
        JOptionPane.showMessageDialog( null,"Limpiar con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }        
    public void aparienciaBaja(){
        pnlBaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Baja"));
        lblCodigoB.setText("Codigo:");
        lblArticuloB.setText("Articulo:");
        lblSucursalB.setText("Sucursal:");
        lblTipoB.setText("Tipo de insumo:");
        lblExistenciaB.setText("Existencia:");
        lblMarcaB.setText("Marca:");
        cmbSucursalB.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));
        spnExistenciaB.setModel(new javax.swing.SpinnerNumberModel(0,0,9999,1));        
        txtArticuloB.setEnabled(false);
        txtMarcaB.setEnabled(false);
        txtTipoB.setEnabled(false);
        spnExistenciaB.setEnabled(false);
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
        pnlBaja.add(lblCodigoB, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtCodigoB, gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblSucursalB, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(cmbSucursalB, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnBuscar,gbc);      
        gbc.gridwidth = 1;
        pnlBaja.add(lblArticuloB,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtArticuloB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblTipoB,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtTipoB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblExistenciaB,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(spnExistenciaB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblMarcaB,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtMarcaB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(btnNuevaBusqueda,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnEliminar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnSalirB,gbc);             
    }    
    public void Buscar(){
        Articulo art = new Articulo();
        
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.articulo WHERE codigo='"+txtCodigoB.getText()+"' AND sucursal='"+cmbSucursalB.getSelectedItem().toString()+"';";
                ResultSet rs=null;
                rs = st.executeQuery(consulta);
                if(rs.next()){
                    art.articulo=rs.getString("articulo");
                    art.idTipoInsumo=rs.getString("idTipoInsumo");
                    art.marca=rs.getString("marca");
                    art.existencia=rs.getString("existencia");
                    txtArticuloB.setText(art.articulo);
                    txtTipoB.setText(art.idTipoInsumo);
                    txtMarcaB.setText(art.marca);
                    spnExistenciaB.setValue(Integer.parseInt(art.existencia));
                }        
                
                rs.close();
                st.close();
                conexion.close();
            }
        catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog( null,"Insumo encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }    
    public void BuscarM(){
        Articulo art = new Articulo();
        
        try{    
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_soft","manne","Fco-1402");
                Statement st = conexion.createStatement();
                String consulta = "SELECT * FROM restaurant_soft.articulo WHERE codigo='"+txtCodigoM.getText()+"' AND sucursal='"+cmbSucursalM.getSelectedItem().toString()+"';";
                ResultSet rs=null;
                rs = st.executeQuery(consulta);
                if(rs.next()){
                    art.articulo=rs.getString("articulo");
                    art.idTipoInsumo=rs.getString("idTipoInsumo");
                    art.marca=rs.getString("marca");
                    art.existencia=rs.getString("existencia");
                    txtArticuloM.setText(art.articulo);
                    txtTipoM.setText(art.idTipoInsumo);
                    txtMarcaM.setText(art.marca);
                    spnExistenciaM.setValue(Integer.parseInt(art.existencia));
                    txtArticuloM.setEnabled(true);
                    txtMarcaM.setEnabled(true);
                    txtTipoM.setEnabled(true);
                    spnExistenciaM.setEnabled(true);
                    txtCodigoM.setEnabled(false);
                    cmbSucursalM.setEnabled(false);
                }                
                rs.close();
                st.close();
                conexion.close();
            }
        catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Error al conectar con la Base de Datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog( null,"Insumo encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }    
    public void Eliminar(){
        if("".equals(txtCodigoB.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Articulo art = new Articulo();
        art.codigo = txtCodigoB.getText();
        art.sucursal = cmbSucursalB.getSelectedItem().toString();       
        BD.eliminarInventario(art.codigo,art.sucursal); 
        limpiar();
    }
    public void aparienciaModificar(){
        pnlMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar"));
        lblCodigoM.setText("Codigo:");
        lblArticuloM.setText("Articulo:");
        lblSucursalM.setText("Sucursal:");
        lblTipoM.setText("Tipo de insumo:");
        lblExistenciaM.setText("Existencia:");
        lblMarcaM.setText("Marca:");
        cmbSucursalM.setModel( new javax.swing.DefaultComboBoxModel(new String[]{"Roma","Insurgentes","Condesa","Centro"}));
        spnExistenciaM.setModel(new javax.swing.SpinnerNumberModel(0,0,9999,1));        
        txtArticuloM.setEnabled(false);
        txtMarcaM.setEnabled(false);
        txtTipoM.setEnabled(false);
        spnExistenciaM.setEnabled(false);
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
        pnlMod.add(lblCodigoM, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtCodigoM, gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblSucursalM, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(cmbSucursalM, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnBuscarM,gbc);      
        gbc.gridwidth = 1;
        pnlMod.add(lblArticuloM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtArticuloM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblTipoM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtTipoM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblExistenciaM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(spnExistenciaM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblMarcaM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtMarcaM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(btnGuardarM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnSalirM,gbc);             
    }
    public void actualizar(){
        if("".equals(txtCodigoM.getText()))
        {
            JOptionPane.showMessageDialog(null,"Alguno de los campos esta vacio ","Error", JOptionPane.ERROR_MESSAGE);
        }
        Articulo art = new Articulo();
        art.codigo = txtCodigoM.getText();
        art.articulo = txtArticuloM.getText();
        art.sucursal = cmbSucursalM.getSelectedItem().toString();
        art.idTipoInsumo = txtTipoM.getText();
        art.existencia = spnExistenciaM.getValue().toString();
        art.marca = txtMarcaM.getText();       
        BD.modificarInventario(art.codigo,art.articulo,art.sucursal,art.idTipoInsumo,art.existencia,art.marca); 
        limpiar();
        txtArticuloM.setEnabled(false);
        txtMarcaM.setEnabled(false);
        txtTipoM.setEnabled(false);
        spnExistenciaM.setEnabled(false);
        txtCodigoM.setEnabled(true);
        cmbSucursalM.setEnabled(true);
        limpiar();
    }
            
}
