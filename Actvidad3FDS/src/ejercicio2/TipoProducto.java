package ejercicio2;

public class TipoProducto {
	private int tipo;
	private String descripcion;
	private int iva;
	/**
	 * @param tipo
	 * @param descripcion
	 * @param iva
	 */
	public TipoProducto(int tipo, String descripcion, int iva) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.iva = iva;
	}
	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}
	@Override
	public String toString() {
		return "Tipo " + tipo + " Descripcion=" + descripcion + " Iva " + iva;
	}
	
	

}
