package actividad5;

import java.util.List;

public class Pelicula {
    private String nombrePelicula;
    private String director;
    private String clasificacion;
    private List<String> actores;
    private String genero;
    
    public Pelicula(String nombrePelicula, String director, String clasificacion, List<String> actores,int genero) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.clasificacion = clasificacion;
        this.actores = actores;
        this.genero = comprobadorGenero(genero);
    }
    /**
     * Evalua el codigo ingresado para el genero 1 = Acción, 3 = Terror, 5 = Drama;
     * Si el valor del género no es correcto asume por defecto Drama
     * @return
     */
    private String comprobadorGenero(int genero){
        String generito;
        switch (genero) {
            case 1:
                generito = "Accion";
                break;
            case 3:
                generito = "Terror";
                break;
            case 5:
                generito = "Drama";
                break;    
            default:
                generito = "Drama";
                break;
        }
        return generito;
    }
    /**
    * 
    * @return el nombre d ela pelicula
    */
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    @Override
    public String toString() {
        return "Pelicula " + this.nombrePelicula + " Genero=" + this.genero;
    }
}
