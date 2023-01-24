package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num, resto;
		int contador=0;
		
		System.out.println("Dime un numero y te dire todos sus divisores: ");
		num=teclado.nextInt();
		
		while (contador<num/2) {
			contador++;
			resto=num%contador;
			if (resto==0) {
				System.out.println("El numero "+contador+" es divisor de "+num);
			}//if
		}//while
		
	}//main

}//class
