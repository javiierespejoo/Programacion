package ejerciciosTema4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase, aux="";		
		
		System.out.println("Dime una frase (maximo 80 caracteres): ");
		frase=teclado.nextLine();
		
		if (frase.length()> 80) {
			System.out.println("Dime una frase (maximo 80 caracteres): ");
			frase=teclado.nextLine();
		}//if
		else if(frase.length()<= 80) {
			for (int i=0; i<frase.length(); i++) {
				aux += frase.charAt(i);
				System.out.println(aux);
			}//for_if
			
		}//if2

	}//main

}//class
