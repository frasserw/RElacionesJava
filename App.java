package actividad5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        Cinema miCinema =new Cinema("DOS X UNO", "NDS Carrera 30", "Marte");
        List<String> actores =new ArrayList<>();
        actores.add("Actor 1");
        actores.add("Actor 2");
               
        Pelicula pelicula1 =new Pelicula("Caceria en Venecia","H. Haunting","Todos",actores,5);
        Funcion funcion1 =new Funcion("3:40",pelicula1,8500);
        
        Sala sala1 =new Sala(10);
        sala1.crearFuncion(funcion1);
        miCinema.cearSala(sala1);

        miCinema.venderBoleta();
        System.out.println("-----------");
        miCinema.venderBoleta();
        System.out.println("-----------");

        miCinema.informeVentas();



    }
}
