package asociación;
/**
 * 
 * @author william frasser acevedo
 *
 */
public class Cuenta {
	private int numero;
	private Persona titular;
	private long saldo;
	/**
	 * @param numero
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(int numero, Persona titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	/**
	 * @return the saldo
	 */
	public long getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método recibe un valor y acatualiza el saldo suamdo el valor.
	 * @param valor
	 */
	public void deposito(long valor) {
		this.saldo += valor;
	}
	/**
	 * 
	 * @param valor
	 */
	public void retiro(long valor) {
		
		this.saldo -= valor;
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
