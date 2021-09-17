package ejercicio1;

import java.util.Arrays;

public class Estudiante {
	private int id;
	private String nombre;
	private double[] notas;
	private double notaFinal;
	/**
	 * @param id
	 * @param nombre
	 * @param notas
	 */
	public Estudiante(int id, String nombre, double[] notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
		this.notaFinal = notas[0]*30/100 + notas[1]*30/100+notas[2]*40/100; 
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
	 * @return the notas
	 */
	public double[] getNotas() {
		return notas;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	@Override
	public String toString() {
		return "Id " + id + " Nombre " + nombre + " Notas " + Arrays.toString(notas)+ " Nota Final "+ notaFinal ;
	}
}
