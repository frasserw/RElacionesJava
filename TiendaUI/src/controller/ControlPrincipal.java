/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modleo.dao.ProductoDAO;
import ui.UiInformeCatalogoProducto;
import ui.UiPrincipal;
import ui.UiProducto;


/**
 *
 * @author willi
 */
public class ControlPrincipal implements ActionListener{
    private UiPrincipal uiP;
    private ProductoDAO modelo;
    
    public ControlPrincipal(UiPrincipal uiP){
        this.uiP = uiP;
        this.modelo =new ProductoDAO();
        uiP.productos.addActionListener(this);
        uiP.crearData.addActionListener(this);
        uiP.informeCpd.addActionListener(this);
        uiP.salir.addActionListener(this);
        uiP.setVisible(true);
    }
    /**
     * 
     * @param arg0 
     */
    @Override
    public void actionPerformed(ActionEvent arg0) {
      if(arg0.getSource().equals(this.uiP.productos)){
        ControlProducto cProduc =new ControlProducto(new UiProducto(),modelo);
      } 
      
      if(arg0.getSource().equals(this.uiP.crearData)){
              
          modelo.crearCatalogo();
      
      }
      
      if(arg0.getSource().equals(this.uiP.informeCpd)){
          ControladorInformeCatalogoProducto cicp =new ControladorInformeCatalogoProducto(new UiInformeCatalogoProducto(),modelo);
      
      }
      
    }    
    
    
}
