/**
 * 
 */
package agregacion;

/**
 * Clase 
 * @author william frasser acevedo
 * @since 2021-08-24
 */
public class Taquilla {
	private int codigo;
	private int precio;
	private String empleado;
	/**
	 * @param codigo
	 * @param empleado
	 */
	public Taquilla(int codigo, int precio, String empleado) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.empleado = empleado;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the empleado
	 */
	public String getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * 
	 */
	
	public String toString() {
		return " Codigo " + this.codigo + "  Empleado " + empleado + " Precio " +precio;
	}
	
	
	
}
