/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaui;

import controller.ControlPrincipal;
import java.util.List;
import modelo.dto.Producto;
import modleo.dao.ProductoDAO;
import ui.UiPrincipal;

/**
 *
 * @author willi
 */
public class TiendaUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControlPrincipal cPrincipal =new ControlPrincipal(new UiPrincipal());
        
    }
}
