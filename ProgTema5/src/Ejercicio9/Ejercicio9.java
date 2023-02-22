package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Metodos raices = new Metodos();
		
		int a,b,c;
		double r1, r2;
		
		System.out.println("Dame un valor para la variable a: ");
		a = teclado.nextInt();
		
		System.out.println("Dame un valor para la variable b: ");
		b = teclado.nextInt();
		
		System.out.println("Dame un valor para la variable c: ");
		c = teclado.nextInt();
		
		r1 = raices.raiz1(a, b, c);
		r2 = raices.raiz2(a, b, c);
		
		System.out.println("R1 = "+r1);
		System.out.println("R2 = "+r2);

	}//main

}//class
