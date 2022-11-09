package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		int menu;
		boolean noValido=false;
		
		while (noValido==false) {
			System.out.println("Elige una opcion:");
			System.out.println("1. Mayusculas");
			System.out.println("2. Minusculas");
			menu=teclado.nextInt();teclado.nextLine();
		
			switch (menu) {
			case 1:
				noValido=true;
				System.out.println("Usted a elegido Mayusculas");
				System.out.println("¿Que frase quieres convertir en Mayusculas?");
				frase=teclado.nextLine();
				System.out.println("Esta frase en Mayusculas es: "+frase.toUpperCase());
				break;
			case 2:
				noValido=true;
				System.out.println("Usted a elegido Minusculas");
				System.out.println("¿Que frase quieres convertir en Minusculas?");
				frase=teclado.nextLine();
				System.out.println("Esta frase en Minusculas es: "+frase.toLowerCase());
				break;
			default:
				noValido=false;
				System.out.println("El valor introducido no corresponde a ninguna de las opciones.");
				System.out.println("Pruebe a insertar otro valor.");
				break;
			
			}//switch
		
		}//while

	}//main

}//class
