

public class Televisor extends Electrodomestico{
	private int sintonizador;

	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param sintonizador
	 */
	public Televisor(int codigo, String marca, String modelo, int sintonizador) {
		super(codigo, marca, modelo);
		this.sintonizador = sintonizador;
	}

	/**
	 * @return the sintonizador
	 */
	public int getSintonizador() {
		return sintonizador;
	}

	/**
	 * @param sintonizador the sintonizador to set
	 */
	public void setSintonizador(int sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	/**
	 * 
	 */
	@Override
	public int calcularPago(int dato) {
		// TODO Auto-generated method stub
		int valorPago=0;
		if(sintonizador==1) {
			valorPago = dato * 20000;
		}else if(sintonizador==2)
				valorPago = dato * 40000;
		else
			valorPago = dato * 50000;
		
		return valorPago;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Televisor "+super.toString() + " Sintomizador " + this.sintonizador;
	}
}
