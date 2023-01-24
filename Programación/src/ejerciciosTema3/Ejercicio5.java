package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num=1;
		int contador=0;
		int suma=0;
		
			System.out.println("Dime una serie de numeros que quieres que sume. Para salir del bucle introduce el valor 0");
			
		
		while (num!=0) {
			System.out.println("Dime un numero");
			num=teclado.nextInt();
			suma=suma+num;
			contador++;
		}//while
		System.out.println("La suma de los "+(contador-1)+" numeros introducidos da como resultado: "+suma);
	}//main

}//class
