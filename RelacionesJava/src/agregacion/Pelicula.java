package agregacion;
/**
 * 
 * @author william 
 *
 */
public class Pelicula {
	private String titulo;
	private String genero;
	/**
	 * @param titulo
	 * @param genero
	 */
	public Pelicula(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * 
	 */
	
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + "]";
	}
	
}
