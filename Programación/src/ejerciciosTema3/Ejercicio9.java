package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num;
		int suma=0;
		System.out.println("Dime un numero y te dire si es perfecto o no");
		num=teclado.nextInt();
		double resto;
		
		for (int contador=1; contador<num; contador++) {
			resto=num%contador;
			if (resto==0) {
				suma+=contador;
			}//if for
		}//for
		
		if (suma-num==0 && num!=0 && num!=1) {
			System.out.println("El numero introducido SI es perfecto");
		}//if
		else {
			System.out.println("El numero introducido NO es perfecto");
		}//else
		
	}//main

}//class
