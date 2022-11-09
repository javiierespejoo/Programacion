package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num1;
		int contador, factorial;
		System.out.println("Dime un numero y te calculare su factorial");
		num1=teclado.nextInt();
		contador=num1-1;
		factorial=num1;
		do {
			factorial=factorial*contador;
			contador--;
		}//do
		while (contador>0);
		
		System.out.println("El factorial de "+num1+" es: "+factorial);
	}//main

}//class
