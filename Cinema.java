package actividad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 **/
public class Cinema {
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<Sala> listaSala;
    private int numeroBoleta = 1000;

    private BufferedReader leer =new BufferedReader(new InputStreamReader(System.in));

    public Cinema(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.listaSala =new ArrayList<>();
    }
    /*
     * 
     */
    public void cearSala(Sala sala){
        listaSala.add(sala);
    }



    /**
     * @throws IOException
     * 
     */
    public void venderBoleta() throws IOException{
        System.out.println("CIMENA "+this.nombre);
        System.out.println("Venta de Boletas");
        System.out.println("Fecha Hora " + LocalDateTime.now());
        System.out.println("Pelicula ");
        String nombrePelicula = leer.readLine();
        int totalBoletas=0;
        int asientosDisponibles=0;
        for (Sala sala : listaSala) {
            System.out.println(sala.getCodigo());
            for (Funcion funcion : sala.getListaFuncion()) {
                if(funcion.getPelicula().getNombrePelicula().equals(nombrePelicula)){
                    System.out.println(funcion.getPelicula());
                    System.out.println("Funcion "+funcion.getHora());
                    System.out.println("Aforo " + sala.getNUMEROASIENTOS());
                    asientosDisponibles = sala.getNUMEROASIENTOS() - funcion.getAsientosVendidos().size();
                    System.out.println("Asientos disponibles "+asientosDisponibles);
                    System.out.println("Boletas A Comprar ");
                    totalBoletas = Integer.parseInt(leer.readLine());
                    
                    if(totalBoletas > asientosDisponibles){
                        System.out.println("Aforo completo");
                        return;
                    }else{
                        funcion.asignarAsiento(totalBoletas);
                        sala.setTotalVenta(totalBoletas * funcion.getPrecioBoleta());
                    }
                    System.out.println("CIMENA "+this.nombre);
                    System.out.println("Boleta Numero "+numeroBoleta);
                    System.out.println("Fecha "+LocalDateTime.now());
                    System.out.println("Sala "+sala.getCodigo());
                    System.out.println("Funcion "+funcion.getHora());
                    System.out.println("Asientos " + totalBoletas);
                    System.out.println("Valor "+totalBoletas * funcion.getPrecioBoleta());

                }
                return;
            }

        }
    }
    /**
     * 
     */
    public void informeVentas(){
        long totalGeneral=0;
        for (Sala sala : listaSala) {
            System.out.println("Sala " +sala.getCodigo() + " Total Ventas "+sala.getTotalVenta());
            totalGeneral += sala.getTotalVenta();
        }
        System.out.println("Total ventas en el Cinema "+totalGeneral);
    }
}
