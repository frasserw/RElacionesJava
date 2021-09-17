package ejercicio1;

import java.util.Scanner;

public class Universidad {
	private Curso curso; 
	private Estudiante estudiante;
	private Scanner teclado =new Scanner(System.in);
		
	public void run() {
		
		int opc;
		boolean salir=true;
		while(salir) {
			System.out.println("UNIVERSIDAD DE LA VIDA");
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Crear el curso");
			System.out.println("2. Agregar Estudiante");
			System.out.println("3. Notas del Curso");
			System.out.println("4. Notas por Rango");
			System.out.println("5. Salir");
			System.out.println("Entrar un numero enter 1 y 5");
			opc = teclado.nextInt();
			switch (opc) {
			case 1:
				 crearCurso(); 
				break;
			case 2:
				agregarEstudiante();
				break;
			case 3:
				curso.notasCurso();
				break;
			case 4:
				curso.notasRango();
			case 5:
				salir=false;
				break;
			default:
				System.out.println("Entre una numero entre 1 y 5");
				break;
			}
				
			
		}while(salir);
	}
	/**
	 * Método para crear un curso
	 */
	public void crearCurso() {
		System.out.println("UNIVERSIDAD DE LA VIDA");
		System.out.println("CREA UN CURSO");
		System.out.print("Codigo ");
		int codCurso = teclado.nextInt();
		System.out.print("Programa ");
		String programa = teclado.next();
		System.out.println("DATOS DE LA ASIGNATURA");
		System.out.print("Codigo ");
		int codAsig = teclado.nextInt();
		System.out.print("Denominación ");
		String denomi = teclado.next();
		System.out.println("DATOS DEL DOCENTE");
		System.out.print("Identificación ");
		int id= teclado.nextInt();
		System.out.print("Nombre ");
		String nombre = teclado.next();
		System.out.println("Profesión ");
		String profesion = teclado.next();
		System.out.print("Cuantos Estudiantes tiene el Curso ");
		int nEstu = teclado.nextInt();
		System.out.println("CREANDO CURSO");
		
		curso =new Curso(codCurso,programa,new Asignatura(codAsig,denomi),new Docente(id,nombre,profesion),nEstu);
		
	}
	/**
	 * 
	 */
	public void agregarEstudiante() {
		System.out.println("UNIVERSIDAD DE LA VIDA");
		System.out.println("AGREGAR ESTUDIANTE");
		System.out.println("DATOS DEL ESTUDIANTE");
		System.out.print("Id ");
		int id=teclado.nextInt();
		System.out.print("Nombre ");
		String nombre = teclado.next();
		System.out.println("NOTAS DE LOS TRES CORTES");
		double[] notas =new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota para el corte " +(i+1)+" ");
			notas[i]= teclado.nextDouble(); 
		}
		//Crea una objeto (instancia) de la clase Estudiante
		estudiante = new Estudiante(id,nombre,notas);
		
		if(curso.agregarEstudiante(estudiante)) {
			System.out.println("Un Nuevo Estudiante fue agregado");
		}else {
			System.out.println("Error al agregar estudiante");
		}
				
	}

}
