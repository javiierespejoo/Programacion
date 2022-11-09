package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num;
		int sumaPar=0;
		int sumaImpar=0;
		int contador=0;
		
		System.out.println("Dime una serie de numeros y te sumare los introducidos en ranura par y por otra parte los de ranura impar");
		
		do {
			System.out.println("Dime un numero");
			contador++;
			num=teclado.nextInt();
			
			if (contador%2==0) {
				sumaPar=sumaPar+num;
			}//if do while
			else {
				sumaImpar=sumaImpar+num;
			}//else do while
		}//do while
		while (num!=0);
		
		System.out.println("La suma de los numeros introducidos en ranura impar es: "+sumaImpar);
		System.out.println("La suma de los numeros introducidos en ranura par es: "+sumaPar);
	}//main

}//class
