package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String frase;
		String letraR;
		
		do {
			System.out.println("Dime una frase (maximo 80 caracteres)");
			frase=teclado.nextLine();
		}//do-while
		while(frase.length()>80);
		do {
			System.out.println("Dime una letra que quieres que resalte en mayusculas");
			letraR=teclado.nextLine();
		}//do-while2
		while(letraR.length()>1);
		
		System.out.println(frase.replace(letraR, letraR.toUpperCase()));
		
	}//main

}//class
