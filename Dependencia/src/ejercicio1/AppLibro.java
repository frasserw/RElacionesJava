package ejercicio1;

import java.util.Scanner;

public class AppLibro {
	public static Scanner leerDato =new Scanner(System.in);
	public static int isbn,paginas;
	public static String titulo,autor;
	public static Libro[] libros = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		boolean salir=false;
		while(!salir) {
			opc=0;
			System.out.println("\n");
			System.out.println("BIBLIOTECA VIRTUAL LA U");
			System.out.println("1. Crear Libros");
			System.out.println("2. Mostrar Libros");
			System.out.println("3. El Libro con > Paginas");
			System.out.println("4. Salir");
			System.out.println("Entrar un datos enter 1 y 4");
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:creaLibro();
					;break;
				case 2:muestraLibro();					
					;break;
				case 3:mayorPagina();
					;break;
				case 4:
					salir=true;
					break;
				default:
					System.out.println("Solo números del 1 al 4");
					break;
			}
							
		}
	}
	/**
	 * 
	 */
	public static void creaLibro() {
		System.out.println("Cuantos Libros Desea en la Biblioteca");
		int n =leerDato.nextInt();
		libros =new Libro[n];
		
		for(int i=0; i< libros.length;i++) {
			System.out.println("Datos del Libro " +(i+1) + " ");
			System.out.print("ISBN");
			isbn = leerDato.nextInt();
			System.out.print("Titulo ");
			titulo = leerDato.next();
			System.out.println("Autor ");
			autor = leerDato.next();
			System.out.println("Numero de paginas");
			paginas = leerDato.nextInt();
			
			libros[i] =new Libro(isbn,titulo,autor,paginas);
		}
	}
	/**
	 *Método para mostrar porconsola los libros d ela biblioteca 	
	 */
	public static void muestraLibro() {
		for (int i = 0; i < libros.length; i++) {
			System.out.println(libros[i]);
		}
		//for each
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}	
	
	public static void mayorPagina() {
		int mayor=0;
		Libro l = null;
		for (Libro libro : libros) {
			if(libro.getPaginas() > mayor) {
				mayor = libro.getPaginas();
				l = libro;
			}	
		}
		
		System.out.println("Libro con mayor paginas " + l);
	}
	

}
