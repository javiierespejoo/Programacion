package repasoEv1;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int hora;
		
		do {
		System.out.println("¿Que hora es?");
		hora=teclado.nextInt();
		}
		while(hora<1||hora>24);
		
		if (hora>=6 && hora<=12) {
			System.out.println("BUENOS DIAS ;)");
		}//if1
		else if (hora>=13 && hora<=20) {
			System.out.println("BUENAS TARDES ;)");
		}//if2
		else {
			System.out.println("BUENAS NOCHES ;)");
		}//else
	}//main

}//class
