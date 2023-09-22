package actividad5;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 */
public class Sala {
    private int codigo;
    private final int NUMEROASIENTOS=20;
    private List<Funcion> listaFuncion;
    private long totalVenta;
    /**
     * 
     * @param codigo
     */
    public Sala(int codigo){
        this.codigo = codigo;
        this.listaFuncion =new ArrayList<>();
    }

    
    /**
     * 
     * @param funcion
     */
    public void crearFuncion(Funcion funcion){
        listaFuncion.add(funcion);
    }

    public int getNUMEROASIENTOS() {
        return NUMEROASIENTOS;
    }

    public List<Funcion> getListaFuncion() {
        return listaFuncion;
    }

    public long getTotalVenta() {
        return totalVenta;
    }
    /*
     * 
     */
    public void setTotalVenta(long totalVenta) {
        this.totalVenta += totalVenta;
    }


    public int getCodigo() {
        return codigo;
    }
    
    

}
