package asociación;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona titular =new Persona(102030,"Juanita"); 
		
		Cuenta miCuenta =new Cuenta(1000, titular);
		
		System.out.println("Numero de Cuenta " + miCuenta.getNumero());
		System.out.println("Nombre del Titular " + miCuenta.getTitular().getNombre());
		System.out.println("Saldo " + miCuenta.getSaldo());
		
		miCuenta.deposito(10000);
		
		System.out.println("Numero de Cuenta " + miCuenta.getNumero());
		System.out.println("Nombre del Titular " + miCuenta.getTitular().getNombre());
		System.out.println("Saldo " + miCuenta.getSaldo());
		
		miCuenta.retiro(20000);
		
		System.out.println("Numero de Cuenta " + miCuenta.getNumero());
		System.out.println("Nombre del Titular " + miCuenta.getTitular().getNombre());
		System.out.println("Saldo " + miCuenta.getSaldo());
		

	}

}
