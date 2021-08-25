package ejercicio1;
/**
 * 
 * @author william frasser acevedo
 * @since 2021-03-04
 */
public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int paginas;
	/**
	 * Constructor 
	 * @param iSBN 
	 * @param titulo
	 * @param autor
	 * @param paginas
	 */
	public Libro(int iSBN, String titulo, String autor, int paginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	/**
	 * Método get para ????
	 * @return the iSBN 
	 */
	public int getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}
	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	/**
	 * 
	 */
	
	
	public String toString() {
		return "El Libro " + this.titulo + "con ISBN " + this.ISBN + " del Autor " + this.autor +" Tiene " + this.paginas + " Paginas " ;
	}
}
