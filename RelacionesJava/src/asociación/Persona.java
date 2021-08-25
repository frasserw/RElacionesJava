/**
 * 
 */
package asociación;

/**
 * La clase persona permitecrear instancia de persona 
 * @author william frasser acevedo
 * @since 2021-08-23
 * @version 01 2021-08-23
 * @version 02 2021-08-26  falto incluir el método toString
 */
public class Persona {
	private int id;
	private String nombre;
	/**
	 * Constructor de la clase 
	 * @param id identificación de la persona de tipo entero
	 * @param nombre de la persona de tipo string
	 */
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método de la clase Object retorna una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "Persona Id " + this.id + " Nombre " + this.nombre;
	}
	
}
