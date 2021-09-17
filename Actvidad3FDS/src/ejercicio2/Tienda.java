package ejercicio2;

import java.util.Scanner;

/**
 * 
 * @author william
 *
 */
public class Tienda {
	//un arreglo de objetos
	private Producto[] catalogoProducto;
	
	private Scanner teclado =new Scanner(System.in);
	private Producto producto;
	private TipoProducto perecedero;
	private TipoProducto noPerecedero;
	private long precioV;
	
	/**
	 * Método para crear por coposición un array de productos
	 * @param nProducto
	 */
	public Tienda(int nProducto) {
		catalogoProducto =new Producto[nProducto];
		
		perecedero =new TipoProducto(1,"Perecedero",15);
		
		noPerecedero =new TipoProducto(2,"No Perecedero",19);
	}
	/**
	 * Método para registrar los productos
	 */
	
	public void registraProducto() {
		//datos del producto
		System.out.println("TODO MUY BARATO .COM");
		System.out.println("REGISTRO DE PRODUCTOS");
		System.out.print("Codigo ");
		int codigo = teclado.nextInt();
		System.out.println("Tipo de Producto 1. Perecedero 2.no Perecedero");
		int tipo = teclado.nextInt();
		System.out.print("Descripcion ");
		String descripcion = teclado.next();
		System.out.print("Precio ");
		long precio = teclado.nextLong();
		System.out.println("Fecha de Vencimiento");
		System.out.print("Dia ");
		int dia = teclado.nextInt();
		System.out.println("Mes ");
		int mes = teclado.nextInt();
		System.out.println("Año ");
		int anio = teclado.nextInt();
		
		//Creamos el objeto de la clase producto
		producto =new Producto(codigo,descripcion,precio);
		
		//Actualizamos la fecha del producto por composición
		producto.fechaVento(dia, mes, anio);
		
		//Actualizamos el tipo de producto por agregación
		if(tipo==1) {
			producto.setTipo(perecedero);
		}else {
			producto.setTipo(noPerecedero); 
		}
		
		//Asignamos el producto a un elemento del array de objetos de producto
		for (int i = 0; i < catalogoProducto.length; i++) {
			if(catalogoProducto[i] == null) {
			   catalogoProducto[i] = producto;
			   break;
			}
		}
	
		
	}
	/**
	 * 
	 */
	public void catalogoProducto() {
		System.out.println("TODO MUY BARATO .COM");
		System.out.println("CATALOGO DE PRODUCTOS");
		
		for (Producto producto : catalogoProducto) {
			if(producto!=null) {
			  precioV = producto.getPrecio() + (long) (producto.getPrecio() * (producto.getTipo().getIva())/100);
			  System.out.println(producto.getCodigo() + " " + producto.getDescripcion() + 
			  " " + producto.getPrecio() + " " + producto.getTipo().getIva() + " " + precioV);
		   }
		}
		
	}
	/**
	 * 
	 */
	public void consultaTipoProducto() {
		System.out.println("TODO MUY BARATO .COM");
		System.out.println("CATALOGO DE PRODUCTOS POR TIPO");
		System.out.print("Tipo a Consultar 1. Perecedero 2. no Perecedero ");
		int tipo = teclado.nextInt();
		
		for (Producto producto : catalogoProducto) {
			if(producto!=null) {
			  if(producto.getTipo().getTipo() == tipo) {
			    //Se calcula elprecio de venta  
			    precioV = producto.getPrecio() + (long) (producto.getPrecio() * (producto.getTipo().getIva())/100);
			    System.out.println(producto.getCodigo() + " " + producto.getDescripcion() + 
			    " " + producto.getPrecio() + " " + producto.getTipo().getIva() + " " + precioV);
			  }
			}
		}
		
	}
	
	public void consultaProducto() {
		boolean esta=false;
		System.out.println("TODO MUY BARATO .COM");
		System.out.println("CONSULTA POR PRODUCTO");
		System.out.print("Codigo del producto a consultar ");
		int codigo = teclado.nextInt();
		//Busca el codigo del producto en el catalogo
		for (Producto producto : catalogoProducto) {
			if(producto !=null) {
			 if(producto.getCodigo() == codigo) {
			  precioV = producto.getPrecio() + (long) (producto.getPrecio() * (producto.getTipo().getIva())/100);
			  System.out.println(producto.getCodigo() + " " + producto.getDescripcion() + 
			  " " + producto.getPrecio() + " " + producto.getTipo().getIva() + " " + precioV);
			  esta=true;
			  break;
			 }
			}
		}
		if(!esta) {
			System.out.println("Producto no existe");
		}
		
	}
	/**
	 * Método interface de usuario menu de opciones
	 */
	
	public void run() {
		int opc;
		boolean salir=true;
		while(salir) {
			
			System.out.println("TODO MUY BARATO .COM");
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Registrar Producto");
			System.out.println("2. Catalago prodcutos");
			System.out.println("3. Catalalogo por Tipo");
			System.out.println("4. Consulta Producto");
			System.out.println("5. Salir");
			System.out.println("Entrar un numero enter 1 y 5");
			opc = teclado.nextInt();
			switch (opc) {
			case 1:
				registraProducto(); 
				break;
			case 2:
				catalogoProducto();
				break;
			case 3:
				consultaTipoProducto();
				break;
			case 4:
				consultaProducto();
				break;
			case 5:
				salir=false;
				break;
			default:
				System.out.println("Entre una numero entre 1 y 5");
				break;
			}
		}while(salir);
	}
}
