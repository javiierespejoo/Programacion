package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String frase;
		
		do {
			System.out.println("Dime una frase (maximo 80 caracteres");
			frase=teclado.nextLine();
		}//do-while
		while(frase.length()>80);
		
		frase=frase.replace("si", "no");
		
		System.out.println(frase);
		
	}//main

}//class
