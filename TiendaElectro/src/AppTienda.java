import java.io.BufferedReader;

public class AppTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiendaElectrodomesticos tienda = new TiendaElectrodomesticos();

		int opc;
		boolean salir = true;
		while (salir) {
			opc = 0;
			System.out.println("TIENDA TODO MUY BARATO .COM");
			System.out.println("1. Nueva Lavadora");
			System.out.println("2. Nuevo Televisor");
			System.out.println("3. Nueva Freidora de Aire");
			System.out.println("4. Catalogo de Eletrodomesticos");
			System.out.println("5. Buscar por el Codigo");
			System.out.println("6. Salir");
			System.out.println("Entrar un numero enter 1 y 6");
			opc = LeerDato.datoInt();
			switch (opc) {
			case 1:
				tienda.adicionarLavadora();
				break;
			case 2:
				tienda.adicionarTelevisor();
				break;
			case 3:
				int codigo=1010;
				Electrodomestico e = tienda.buscarElectro(codigo);
				if(e==null) {
					System.out.println("Codigo no se encuentra");
				}else {
					System.out.println(e);
				}
				break;
			case 4:
				tienda.catalogoElectrodomesticos();
				break;
			case 5:
				break;
			case 6:
				salir = false;
				break;
			default:
				System.out.println("Error opcion no implementada");
				break;
			}

		}
	}
}
