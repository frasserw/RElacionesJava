
/**
 * 
 * @author William Frasser Acevedo
 *
 */
public class Electrodomestico {
	protected int codigo;
	protected String marca;
	protected String modelo;
	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 */
	public Electrodomestico(int codigo, String marca, String modelo) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
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
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return " Codigo=" + codigo + " Marca=" + marca + " Modelo=" + modelo;
	}
	/**
	 * 
	 * @param dato
	 * @return
	 */
	public int calcularPago(int dato) {
		
		return 0;
	}
	
}
