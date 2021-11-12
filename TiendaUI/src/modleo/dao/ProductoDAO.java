/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modleo.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.dto.Producto;

/**
 *
 * @author willi
 */
public class ProductoDAO {
    private ArrayList<Producto> catalogoProducto;
    
    public ProductoDAO(){
        catalogoProducto =new ArrayList();
    }
    /**
     * Función para adicionat productos a al arreglo dinamico
     * @param producto 
     */
    public boolean crear(Producto producto){
        return catalogoProducto.add(producto);
    }
    /**
     * Función para buscar un dato en la lista
     * @param codigo dato a buscar
     * @return 
     */
    public Producto buscar(int codigo){
        Producto producto=null;
        for (Producto p : catalogoProducto) {
            if(p.getCodigo() == codigo){
                producto = p;
                break;
            }
        }
        return producto;
    }
    /**
     * Función para modificar un objeto o instancia de la lista
     * @param producto
     * @param index 
     */
    public void modificar(int index,Producto producto){
        catalogoProducto.set(index, producto);
             
    }
    /**
     * Función es para borrar un objeto o una instancia de la lista
     */
    public boolean borrar(Producto producto){
        return catalogoProducto.remove(producto);
    }
    
    public int obtenerIndice(Producto producto){
        return catalogoProducto.indexOf(producto);
    }
    /**
     * Función crae el catalogo de productos
     */
    public void crearCatalogo(){
        int codigo=1000;
      
        for(int i=0;i<30;i++){
           Producto producto =new Producto();
           producto.setCodigo(codigo);
           producto.setDescripcion("ProdD-"+codigo);
           producto.setPrecio((int) (Math.random()*(2000-10)+10));
           producto.setCantidad((int) (Math.random()*(10-1)+1)); 
           catalogoProducto.add(producto);
           codigo+=10;
            
        } 
        JOptionPane.showMessageDialog(null, "CREO EL CATALOGO DE PRODUCTOS");
        
        
    }
    /**
     * Función para retornar el catalogo de productos
     * @return 
     */
    public ArrayList<Producto> catalogo(){
        return catalogoProducto;
    }
     
    
}
