package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String frase, vacio="";
		String letraB;
		char aux;
		
		do {
			System.out.println("Dime una frase (maximo 80 caracteres)");
			frase=teclado.nextLine();
		}//do-while
		while(frase.length()>80);
		
		do {
			System.out.println("Dime una letra, de la cual borrare sus 3 primeras apariciones");
			letraB=teclado.nextLine();
		}//do-while2
		while(letraB.length()>1);
			
			for (int i=0; i<3; i++) {
				frase=frase.replaceFirst(letraB,vacio);
			}//for
			System.out.println(frase);
		
	}//main

}//class
