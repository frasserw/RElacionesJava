/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dto.Producto;
import modleo.dao.ProductoDAO;
import ui.UiInformeCatalogoProducto;


/**
 *
 * @author william
 */
public class ControladorInformeCatalogoProducto implements ActionListener{
    private UiInformeCatalogoProducto vista;
    private ProductoDAO modelo;
    private DefaultTableModel modeloTabla;
    
    public ControladorInformeCatalogoProducto(UiInformeCatalogoProducto vista,ProductoDAO modelo) {
       this.vista = vista;
       this.modelo = modelo;
       this.vista.informeCatalogoP.addActionListener(this);
       
      this.modeloTabla= (DefaultTableModel) this.vista.tablaCatalogo.getModel();
       
      this.vista.setVisible(true);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource().equals(this.vista.informeCatalogoP)) {
             
            List<Producto> listaProduct = modelo.catalogo();
            
            int filas = modeloTabla.getRowCount();
            
            for (int i = 0; filas > i; i++) {
                modeloTabla.removeRow(0);
            }

            for(Producto p : listaProduct) {
                Object fila[] = {p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getCantidad()};
                modeloTabla.addRow(fila);
            }
        }
        
        
    }
    
    
    
    
}
