package agregacion;

public class Teatro {
	private String nombre;
	private Taquilla taquilla;
	private Pelicula pelicula;
	/**
	 * @param nombre
	 */
	public Teatro(String nombre) {
		super();
		this.nombre = nombre;
	}
	/**
	 * Este médoto crea por composición un objeto o una instancia de la clase Taquilla
	 * @param numero de la taquilla 
	 * @param precio de la voleta
	 * @param empleado del empelado
	 */
	public void crearTaquilla(int numero,int precio ,String empleado) {
		taquilla =new Taquilla(numero,precio,empleado);
	}
	/**
	 * Este método asigna la referencia a una instancia de la clase pelicula la cual es creada en una clase externa
	 * @param pelicula
	 */
	public void modificarPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
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
	 * @return the taquilla
	 */
	public Taquilla getTaquilla() {
		return taquilla;
	}
	/**
	 * @param taquilla the taquilla to set
	 */
	public void setTaquilla(Taquilla taquilla) {
		this.taquilla = taquilla;
	}
	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}
	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public String toString() {
		return "Teatro [nombre=" + nombre + ", taquilla=" + taquilla + ", pelicula=" + pelicula + "]";
	}
	
	

}
