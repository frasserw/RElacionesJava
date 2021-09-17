package ejercicio1;

public class Asignatura {
	private int id;
	private String denominacion;
	/**
	 * @param id
	 * @param denominacion
	 */
	public Asignatura(int id, String denominacion) {
		super();
		this.id = id;
		this.denominacion = denominacion;
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
	 * @return the denominacion
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	@Override
	public String toString() {
		return "Asignatura " + id + " Denominacion " + denominacion + " ";
	}
	
	

}
