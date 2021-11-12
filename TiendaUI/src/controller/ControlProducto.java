/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dto.Producto;
import modleo.dao.ProductoDAO;

import ui.UiProducto;
/**
 *
 * @author willi
 */
public class ControlProducto implements ActionListener{
    private UiProducto vistaP;
    private ProductoDAO modelo;
    private Producto producto; 
    
    public ControlProducto(UiProducto uiProducto,ProductoDAO modelo){
       this.vistaP = vistaP;
       this.modelo = modelo;
       this.vistaP.nuevo.addActionListener(this);
       this.vistaP.actualizar.addActionListener(this);
       this.vistaP.borrar.addActionListener(this);
       this.vistaP.buscar.addActionListener(this);
       this.vistaP.setVisible(true);
    
    
    }
    /**
     * 
     * @param a 
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Creación de productos
        if(e.getSource().equals(this.vistaP.nuevo)){
           producto =new Producto();
           producto.setCodigo(Integer.valueOf(this.vistaP.codigo.getText()));
           producto.setDescripcion(this.vistaP.descripcion.getText());
           producto.setPrecio(Integer.valueOf(this.vistaP.precio.getText()));
           producto.setCantidad(Integer.valueOf(this.vistaP.cantidad.getText()));
          
           if(!modelo.crear(producto)){
               JOptionPane.showMessageDialog(null, "NO se puede crear el prodcuto informar al administrador");
           
           }else{
               JOptionPane.showMessageDialog(null,"Se creo un nuevo prodcuto");
           }
        }
        //Bloque de instrucciones que permite buscar un prodcuto en la lista de productos
        if(e.getSource().equals(this.vistaP.buscar)){
            int codigo = Integer.valueOf(this.vistaP.codigo.getText());
            producto =new Producto();
            producto = modelo.buscar(codigo);
            if(producto == null){
                JOptionPane.showMessageDialog(null,"Producto no Encontrado ");
            }else{
                this.vistaP.descripcion.setText(producto.getDescripcion());
                this.vistaP.precio.setText(String.valueOf(producto.getPrecio()));
                this.vistaP.cantidad.setText(String.valueOf(producto.getCantidad()));
            }
        }
        //
        if(e.getSource().equals(this.vistaP.borrar)){
           if(!modelo.borrar(producto)){
               JOptionPane.showMessageDialog(null, "No se puede Borrar el prodcuto informar al administrador");
           
           }else{
               JOptionPane.showMessageDialog(null,"Se Borro un Prodcuto");
           }
        
        }
        //
        if(e.getSource().equals(this.vistaP.actualizar)){
            int index = modelo.hashCode();
            modelo.modificar(index,producto);
            JOptionPane.showMessageDialog(null,"Se Modifico un Prodcuto");
        }
    
    }

}
