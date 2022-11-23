package repasoEv1;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int b, h, area;
		
		System.out.println("Dime la base del rectangulo");
		b=teclado.nextInt();
		System.out.println("Dime la altura del rectangulo");
		h=teclado.nextInt();
		
		area=b*h;
		
		System.out.println("El area del rectangulo es: "+area+" uds.");

	}//main

}//class
