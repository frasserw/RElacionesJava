package agregacion;

public class AppTeatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teatro miTeatro =new Teatro("El mejor");
		
		miTeatro.crearTaquilla(1, 20000, "Juanita");
		
		Pelicula miPelicula =new Pelicula("La Fiesta","Familiar"); 
		
		miTeatro.modificarPelicula(miPelicula);
		
		
		System.out.println(miTeatro);
		
				
		miTeatro.getPelicula().setTitulo("La Montaña");
		miTeatro.getPelicula().setGenero("Mayores");
		
		miTeatro.getTaquilla().setPrecio(25000);
		
		System.out.println(miTeatro);
		

	}

}
