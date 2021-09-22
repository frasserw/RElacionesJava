
/**
 * 
 * @author willi
 *
 */
public class FreidoraAire extends Electrodomestico{
	private int vatios;

	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param vatios
	 */
	public FreidoraAire(int codigo, String marca, String modelo, int vatios) {
		super(codigo, marca, modelo);
		this.vatios = vatios;
	}

	/**
	 * @return the vatios
	 */
	public int getVatios() {
		return vatios;
	}

	/**
	 * @param vatios the vatios to set
	 */
	public void setVatios(int vatios) {
		this.vatios = vatios;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Freidora de Aire "+super.toString() + " Vatios " + this.vatios;
	}
}
