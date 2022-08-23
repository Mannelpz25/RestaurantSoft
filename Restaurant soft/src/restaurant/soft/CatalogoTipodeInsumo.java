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

public class CatalogoTipodeInsumo {
    //Componentes graficos Alta
    JPanel pnlAlta = new javax.swing.JPanel();
    JLabel lblIdTipoInsumo = new javax.swing.JLabel();
    JTextField txtIdTipoInsumo = new javax.swing.JTextField();
    JLabel lblInsumo= new javax.swing.JLabel();
    JTextField txtInsumo = new javax.swing.JTextField();
    JLabel lblUnidadDeMedida = new javax.swing.JLabel();
    JTextField txtUnidadDeMedida= new javax.swing.JTextField();
    JButton btnGuardar = new javax.swing.JButton();
    JButton btnLimpiar = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    
    //Componentes graficos Baja
    JPanel pnlBaja = new javax.swing.JPanel();
    JTextField txtIdTipoInsumoB = new javax.swing.JTextField();
    JButton btnBuscar = new javax.swing.JButton();
    JTextField txtInsumoB = new javax.swing.JTextField();
    JTextField txtUnidadDeMedidaB= new javax.swing.JTextField();
    JButton btnEliminar= new javax.swing.JButton();
    JButton btnSalirB = new javax.swing.JButton();
    
    //Componentes graficos Modificar
    JPanel pnlMod = new javax.swing.JPanel();
    JTextField txtIdTipoInsumoM = new javax.swing.JTextField();
    JButton btnBuscarM = new javax.swing.JButton();
    JTextField txtInsumoM = new javax.swing.JTextField();
    JTextField txtUnidadDeMedidaM= new javax.swing.JTextField();
    JButton btnGuardarM= new javax.swing.JButton();
    JButton btnSalirM = new javax.swing.JButton();
    
    public void aparienciaAlta(){
        pnlAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta"));
        lblIdTipoInsumo.setText("Id tipo de insumo:");
        lblInsumo.setText("Insumo:");
        lblUnidadDeMedida.setText("Unidad de medida:");
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
        pnlAlta.add(lblIdTipoInsumo, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtIdTipoInsumo, gbc);
        gbc.gridwidth = 1;        
        pnlAlta.add(lblInsumo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtInsumo,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(lblUnidadDeMedida,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(txtUnidadDeMedida,gbc);
        gbc.gridwidth = 1;
        pnlAlta.add(btnGuardar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnLimpiar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlAlta.add(btnSalir,gbc);       
        
        
    }
    public void guardar(){
        JOptionPane.showMessageDialog( null,"Guardado con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    public void limpiar(){
        
        txtIdTipoInsumo.setText("");
        txtInsumo.setText("");
        txtUnidadDeMedida.setText("");
        JOptionPane.showMessageDialog( null,"Limpiar con exito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }        
    public void aparienciaBaja(){
        pnlBaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Baja"));
        lblIdTipoInsumo.setText("Id tipo de insumo:");
        lblInsumo.setText("Insumo:");
        lblUnidadDeMedida.setText("Unidad de medida:");     
        txtInsumo.setEnabled(false);
        txtUnidadDeMedida.setEnabled(false);
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
        pnlBaja.add(lblIdTipoInsumo, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtIdTipoInsumoB, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnBuscar,gbc); 
        gbc.gridwidth = 1;
        pnlBaja.add(lblInsumo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtInsumoB,gbc);
        gbc.gridwidth = 1;
        pnlBaja.add(lblUnidadDeMedida,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(txtUnidadDeMedidaB,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnEliminar,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlBaja.add(btnSalirB,gbc);             
    }    
    public void Buscar(){
        JOptionPane.showMessageDialog( null,"Empleado encontrado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }    
    public void Eliminar(){
        JOptionPane.showMessageDialog( null,"Empleado eliminado", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    public void aparienciaModificar(){
        pnlMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar"));
       lblIdTipoInsumo.setText("Id tipo de insumo:");
        lblInsumo.setText("Insumo:");
        lblUnidadDeMedida.setText("Unidad de medida:");     
        txtInsumoM.setEnabled(false);
        txtUnidadDeMedidaM.setEnabled(false);
        btnBuscarM.setText("Buscar");
        btnBuscarM.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Buscar();
            }
        });
        btnGuardarM.setText("Guardar");
        btnGuardarM.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                guardar();
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
        pnlMod.add(lblIdTipoInsumo, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtIdTipoInsumoM, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnBuscarM,gbc); 
        gbc.gridwidth = 1;
        pnlMod.add(lblInsumo,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtInsumoM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(lblUnidadDeMedida,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(txtUnidadDeMedidaM,gbc);
        gbc.gridwidth = 1;
        pnlMod.add(btnGuardarM,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pnlMod.add(btnSalirM,gbc);             
    }     
      
    
}
