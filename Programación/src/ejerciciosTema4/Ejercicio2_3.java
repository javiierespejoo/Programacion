package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String frase,aux="";
		
		do {
			System.out.println("Dime una frase (maximo 80 caracteres)");
			frase=teclado.nextLine();
		}//do-while
		while(frase.length()>80);
		
		for (int i=frase.length()-1; i>-1; i--) {
			aux+=frase.charAt(i);
		}//for
		
		if (frase.equalsIgnoreCase(aux)==true) {
			System.out.println("La frase introducida SI es un palindromo.");
		}//if
		else {
			System.out.println("La frase introducida NO es un palindromo.");
		}//else
		
	}//main

}//class
