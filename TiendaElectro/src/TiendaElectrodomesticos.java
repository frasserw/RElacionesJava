
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Clase Tienda implementa todas las funcionalidades para crear productos en la tienda 
 * @author william frasser acevevdo
 *
 */
public class TiendaElectrodomesticos {
	private Scanner teclado =new Scanner(System.in);
	private int codigo=1000;
	private ArrayList<Electrodomestico> listaElectrodomesticos;
	/**
	 * Constructor crea para composiciòn un objeto de la clase Electrodomestico
	*/
	public TiendaElectrodomesticos() {
		listaElectrodomesticos =new ArrayList<Electrodomestico>();
	}
	/**
	 * Función para adicionar objetos de la clase Lavadora a la lista de electrodomesticos
	 */
	public void adicionarLavadora() {
		System.out.println("DATOS DE LA LAVADORA");
		System.out.println("Modelo ");
		String modelo = teclado.next();
		System.out.println("Marca ");
		String marca = teclado.next();
		System.out.println("Color ");
		String color = teclado.next();
		System.out.println("Libras de Carga");
		int librasCarga = teclado.nextInt();
		
		Electrodomestico lavadora =new Lavadora(codigo,marca,modelo,color,librasCarga);
		listaElectrodomesticos.add(lavadora);
		codigo +=10;
		
	}
	/**
	 * unción para adicionar objetos de la clase Televisor a la lista de electrodomesticos
	 */
	public void adicionarTelevisor() {
		System.out.println("DATOS DEL TELEVISOR");
		System.out.println("Modelo ");
		String modelo = teclado.next();
		System.out.println("Marca ");
		String marca = teclado.next();
		System.out.println("Sintonizador 1. HD 2. TDT 3. No");
		int sintonizador = teclado.nextInt();
		
		Electrodomestico televisor =new Televisor(codigo,marca,modelo,sintonizador);
		
		listaElectrodomesticos.add(televisor);
		codigo +=10;
	}
	/**
	 * Función para mostarr por cosola los datos de los elementos 
	 */
	public void catalogoElectrodomesticos() {
		listaElectrodomesticos.forEach((e)->System.out.print(e+" \n"));
	}
	/**
	 * Función Busca un dato en la lista dinamica de Electrodomesticos 
	 * Referencia de busqueda el codigo del electrodomestico.
	 * @param codigo entero es el identificador del producto en la lista
	 * @return un objeto Electrodomestico
	 */
	public Electrodomestico buscarElectro(int codigo) {
		Electrodomestico electro=null;
			for (Electrodomestico electrodomestico : listaElectrodomesticos) {
				if(electrodomestico.getCodigo() == codigo) {
					electro = electrodomestico;
				
				break;
				
			}
			}
		return electro;
		
	} 
	/**
	 * Función parar borrar un elemento 
	 */
	public void borrar() {
		System.out.println("DATOS DEL ELECTROMODESTICO A BORRAR");
		System.out.println("Entre el codigo ");
		int codigo = teclado.nextInt();
		Electrodomestico electro = buscarElectro(codigo);
		
		if(electro == null) {
			System.out.println("Codigo no encontrado");
		}else {
			listaElectrodomesticos.remove(electro);
		}
	}
}
