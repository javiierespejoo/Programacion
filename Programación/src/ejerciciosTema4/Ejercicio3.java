package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase,palabra;
		
			System.out.println("Dime una frase");
			frase=teclado.nextLine();
			System.out.println("Dime cual es la palabra que quieres buscar");
			palabra=teclado.nextLine();
			
		if (frase.length()>80) {
			System.out.println("Dime otra frase que contenga como maximo 80 caracteres");
			frase=teclado.nextLine();
			System.out.println("Dime cual es la palabra que quieres buscar");
			palabra=teclado.nextLine();
			palabra=palabra.toUpperCase();
			System.out.println(frase.toUpperCase().indexOf(palabra)+1);
		}//if
		else {
			System.out.println(frase.indexOf(palabra)+1);
		}//else
			
	}//main

}//class
