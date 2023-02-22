package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
	private int factorial (int num) {
		int fact=1;
		for (int i=1; i<num; i++) {
			fact+=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num, fact;
		Ejercicio3 f=new Ejercicio3();
		
		do {
		System.out.println("Dime un numero posistivo y te dare su factorial:");
		num=teclado.nextInt();
		}
		while (num<0);
		
		fact=f.factorial(num);
		System.out.println("El factorial de "+num+" es: "+fact);
		

	}//main

}//class
