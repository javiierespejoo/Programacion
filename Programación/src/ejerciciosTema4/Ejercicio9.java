package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String frase, codificado="";
		int c;
		
		System.out.println("Dime del 1 al 10 que tipo de cifrado quieres hacer");
		c=teclado.nextInt();teclado.nextLine();
		while (c<1 || c>10) {
			System.out.println("Ese numero no esta entre 1 y 10");
			System.out.println("Dime otro numero");
			c=teclado.nextInt();teclado.nextLine();
		}//while
		System.out.println("Dime una frase");
		frase=teclado.nextLine();
		frase=frase.toUpperCase();
		for (int i=0; i<frase.length(); i++) {
			codificado+=(char)(frase.charAt(i)+c);
		}//for
		System.out.println("Tu frase codificada es: "+codificado);
	}//main

}//class
