package ejercicio2;

public class Producto {
	private int codigo;
	private TipoProducto tipo;
	private String descripcion;
	private long precio;
	private int cantidad;
	private Fecha fechaVento;
	/**
	 * @param codigo
	 * @param tipo
	 * @param descripcion
	 * @param precio
	 */
	public Producto(int codigo,String descripcion, long precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		
	}
	/**
	 * Método para crear un objeto de la clase Fecha por composición.
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public void fechaVento(int dia, int mes, int anio) {
		fechaVento =new Fecha(dia,mes,anio);
		
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
	 * @return the tipo
	 */
	public TipoProducto getTipo() {
		return tipo;
	}
	/**
	 * Actualiza el tipo de producto por agregación.
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoProducto tipo) {
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
	 * @return the precio
	 */
	public long getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the fechaVento
	 */
	public Fecha getFechaVento() {
		return fechaVento;
	}
	/**
	 * @param fechaVento the fechaVento to set
	 */
	public void setFechaVento(Fecha fechaVento) {
		this.fechaVento = fechaVento;
	}
	@Override
	public String toString() {
		return "Producto codigo=" + codigo + ", tipo=" + tipo + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", fechaVento=" + fechaVento;
	}
	
}
