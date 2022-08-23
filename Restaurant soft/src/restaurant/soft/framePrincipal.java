/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.soft;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author Manne25
 */
public class framePrincipal {
    static JFrame frame = new JFrame("RestaurantSoft");
    static Inventario c= new Inventario();
    static RecursosHumanos rh = new RecursosHumanos();
    static CatalogoTipodeInsumo ti = new CatalogoTipodeInsumo();
    static Nomina n = new Nomina();
    static Reportes r = new Reportes();
    static Consultas con = new Consultas();
    JPanel pnlInicio = new javax.swing.JPanel();
    public void limpiarFrame(){
        frame.remove(c.pnlAlta);
        frame.remove(c.pnlBaja);
        frame.remove(c.pnlMod);
        frame.remove(rh.pnlAlta);
        frame.remove(rh.pnlBaja);
        frame.remove(rh.pnlMod);
        frame.remove(ti.pnlAlta);
        frame.remove(ti.pnlBaja);
        frame.remove(ti.pnlMod);
        frame.remove(n.pnlCalc);
        frame.remove(r.pnlRPer);
        frame.remove(r.pnlRInv);
        frame.remove(pnlInicio);
        frame.remove(con.pnlNominas);
    }
    
    public void aparienciaTotal(){
        pnlInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio"));    
        JLabel ini = new javax.swing.JLabel();
        ini.setText("Bienvenidos a RestaurantSoft");
        pnlInicio.add(ini);
        frame.setLocation(400,200);
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }); 
        JMenuBar menu = new javax.swing.JMenuBar();
        JMenuItem inicio = new javax.swing.JMenuItem("Inicio");
        inicio.addActionListener((ActionEvent e) -> {
            if(e.getSource()==inicio){  
                frame.setTitle("RestaurantSoft");
                limpiarFrame();
                frame.add(pnlInicio,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenu inventario = new javax.swing.JMenu("Inventario");        
        JMenuItem alta = new javax.swing.JMenuItem("Alta");
        alta.addActionListener((ActionEvent e) -> {
            if(e.getSource()==alta){
                frame.setTitle("RestaurantSoft - Inventario");
                c.aparienciaAlta(); 
                limpiarFrame();
                frame.add(c.pnlAlta,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem baja = new javax.swing.JMenuItem("Baja");
        baja.addActionListener((ActionEvent e) -> {
            if(e.getSource()==baja){
                frame.setTitle("RestaurantSoft - Inventario");
                c.aparienciaBaja();
                limpiarFrame();
                frame.add(c.pnlBaja,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem modificar = new javax.swing.JMenuItem("Modificar");
        modificar.addActionListener((ActionEvent e) -> {
            if(e.getSource()==modificar){
                frame.setTitle("RestaurantSoft - Inventario");
                c.aparienciaModificar();
                limpiarFrame();
                frame.add(c.pnlMod,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        
        JMenu recursosHumanos = new javax.swing.JMenu("Recursos Humanos");        
        JMenuItem altaR = new javax.swing.JMenuItem("Alta");
        altaR.addActionListener((ActionEvent e) -> {
            if(e.getSource()==altaR){
                frame.setTitle("RestaurantSoft - Recursos Humanos");
                rh.aparienciaAlta();
                limpiarFrame();
                frame.add(rh.pnlAlta,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem bajaR = new javax.swing.JMenuItem("Baja");
        bajaR.addActionListener((ActionEvent e) -> {
            if(e.getSource()==bajaR){
                frame.setTitle("RestaurantSoft - Recursos Humanos");
                rh.aparienciaBaja();
                limpiarFrame();
                frame.add(rh.pnlBaja,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem modificarR = new javax.swing.JMenuItem("Modificar");
        modificarR.addActionListener((ActionEvent e) -> {
            if(e.getSource()==modificarR){
                frame.setTitle("RestaurantSoft - Recursos Humanos");
                rh.aparienciaModificar();
                limpiarFrame();
                frame.add(rh.pnlMod,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        
        JMenu catalogoTipoDeInsumo = new javax.swing.JMenu("Catalogo tipo de insumo");        
        JMenuItem altaTI = new javax.swing.JMenuItem("Alta");
        altaTI.addActionListener((ActionEvent e) -> {
            if(e.getSource()==altaTI){
                frame.setTitle("RestaurantSoft - Catalogo Tipo de Insumo");
                ti.aparienciaAlta();
                limpiarFrame();
                frame.add(ti.pnlAlta,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem bajaTI = new javax.swing.JMenuItem("Baja");
        bajaTI.addActionListener((ActionEvent e) -> {
            if(e.getSource()==bajaTI){
                frame.setTitle("RestaurantSoft - Catalogo Tipo de Insumo");
                ti.aparienciaBaja();
                limpiarFrame();
                frame.add(ti.pnlBaja,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem modificarTI = new javax.swing.JMenuItem("Modificar");
        modificarTI.addActionListener((ActionEvent e) -> {
            if(e.getSource()==modificarTI){
                frame.setTitle("RestaurantSoft - Catalogo Tipo de Insumo");
                ti.aparienciaModificar();
                limpiarFrame();
                frame.add(ti.pnlMod,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        
        JMenu nomina = new javax.swing.JMenu("Nomina");        
        JMenuItem calcN = new javax.swing.JMenuItem("Calculo Nomina");
        calcN.addActionListener((ActionEvent e) -> {
            if(e.getSource()==calcN){
                frame.setTitle("RestaurantSoft - Nomina");
                n.aparienciaCalc();
                limpiarFrame();
                frame.add(n.pnlCalc,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenu reportes = new javax.swing.JMenu("Reportes");        
        JMenuItem rPer = new javax.swing.JMenuItem("Reporte de Personal");
        rPer.addActionListener((ActionEvent e) -> {
            if(e.getSource()==rPer){
                frame.setTitle("RestaurantSoft - Reportes");
                r.aparienciaRPer();
                limpiarFrame();
                frame.add(r.pnlRPer,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenuItem rInv = new javax.swing.JMenuItem("Reporte de Inventario");
        rInv.addActionListener((ActionEvent e) -> {
            if(e.getSource()==rInv){
                frame.setTitle("RestaurantSoft - Reportes");
                r.aparienciaRInv();
                limpiarFrame();
                frame.add(r.pnlRInv,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        JMenu consultas = new javax.swing.JMenu("Consultas");        
        JMenuItem nominas = new javax.swing.JMenuItem("Nominas");
        nominas.addActionListener((ActionEvent e) -> {
            if(e.getSource()==nominas){
                frame.setTitle("RestaurantSoft - Consultas");
                con.aparienciaNominas();
                limpiarFrame();
                frame.add(con.pnlNominas,BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }                
        });
        menu.add(inicio);
        menu.add(inventario);
        inventario.add(alta);
        inventario.add(baja);
        inventario.add(modificar);
        menu.add(recursosHumanos);
        recursosHumanos.add(altaR);
        recursosHumanos.add(bajaR);
        recursosHumanos.add(modificarR);
        //menu.add(catalogoTipoDeInsumo);
        //catalogoTipoDeInsumo.add(altaTI);
        //catalogoTipoDeInsumo.add(bajaTI);
        //catalogoTipoDeInsumo.add(modificarTI);
        menu.add(nomina);
        nomina.add(calcN);
        //menu.add(reportes);
        //reportes.add(rPer);
        //reportes.add(rInv);
        menu.add(consultas);
        consultas.add(nominas);
        frame.add(menu, BorderLayout.PAGE_START);
        frame.add(pnlInicio,BorderLayout.CENTER);
        frame.repaint();
        frame.validate();       
    }
}
