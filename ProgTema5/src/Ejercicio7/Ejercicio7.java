package Ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Metodos opcion = new Metodos();
		int op;
		int r;
		
		System.out.println("Dime el radio de la circunferencia");
		r = teclado.nextInt();
		
		do {
		System.out.println("Elige una de estas opciones: ");
		System.out.println("1. Longitud");
		System.out.println("2. Superficie");
		System.out.println("3. Volumen");
		op = teclado.nextInt();
		}while (op<0 && op>4);
		
		switch (op) {
		case 1:
			System.out.println("La longitud de la circunferencia es: "+ opcion.longitud(r));
		break;
		
		case 2:
			System.out.println("La longitud de la circunferencia es: "+ opcion.superficie(r));
		break;
		
		case 3:
			System.out.println("La longitud de la circunferencia es: "+opcion.volumen(r));
		break;
		}//switch
		
			

	}//main

}//class
