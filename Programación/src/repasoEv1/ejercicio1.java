package repasoEv1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		double euros, pesetas;
		
		System.out.println("Dime cuantos euros quieres convertir");
		euros=teclado.nextFloat();
		
		pesetas=euros*166.386;
		
		System.out.println(euros+" euros son "+pesetas+" pesetas");
	}//main

}//class
