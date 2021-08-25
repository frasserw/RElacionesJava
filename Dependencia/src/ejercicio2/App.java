package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	static int a=0;
	static int b=0;
	static Scanner leer =new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean repetir=false;
		do {
			try {
				repetir=false;
				a=b=0;
				System.out.println("Entre el primer número");
				a = leer.nextInt();
				System.out.println("Entre el segundo número ");
				b = leer.nextInt();
			}catch(Exception e) {
				leer.nextLine();
				System.out.println("Hola entre un dato entero" );
				repetir=true;
			}
		}while(repetir);
		
		System.out.println(Calculadora.suma(a,b));
		System.out.println(Calculadora.resta(a,b));
		System.out.println(Calculadora.multiplicar(a,b));
		
		Calculadora.c=10;
		
		System.out.println(Calculadora.c);

	}
	
	}
