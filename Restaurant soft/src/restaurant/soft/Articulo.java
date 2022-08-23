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
public class Articulo {
    String codigo;
    String articulo;
    String sucursal;
    String idTipoInsumo;
    String existencia;
    String marca;
    
    public void Articulo(String cod,String art, String suc, String id, String exi, String mar){
        codigo=cod;
        articulo=art;
        sucursal=suc;
        idTipoInsumo=id;
        existencia=exi;
        marca=mar;
                
    }
            
           
}
