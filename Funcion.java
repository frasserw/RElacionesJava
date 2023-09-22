package actividad5;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private String hora;
    private Pelicula pelicula;
    private List<Integer> asientosVendidos;
    private int precioBoleta;

    public Funcion(String hora, Pelicula pelicula, int precioBoleta) {
        this.hora = hora;
        this.pelicula = pelicula;
        this.precioBoleta = precioBoleta;
        this.asientosVendidos =new ArrayList<>();
    }
    /**
     * Función para asignar el numero de asientos vendidos al arreglo
     * @param total
     */
    public void asignarAsiento(int total){
        int asiento = asientosVendidos.size();
        for (int i = 0; i < total; i++) {
            asientosVendidos.add(asiento+=1);
        }

    }
    /**
     * 
     * @return
     */
    public Pelicula getPelicula() {
        return pelicula;
    }
    /**
     * 
     * @return
     */
    public int getPrecioBoleta() {
        return precioBoleta;
    }

    public String getHora() {
        return hora;
    }

    public List<Integer> getAsientosVendidos() {
        return asientosVendidos;
    }
}
