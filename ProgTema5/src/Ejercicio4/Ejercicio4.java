package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	private int nPrimos (int num) {
		int contador=2, divisor=2;
		int resto;
		for (contador=2; contador<=num; contador++) {
			do {
				resto=contador%divisor;
				divisor++;
			}//do while2
			while(divisor<contador && resto!=0);
			
			if (resto!=0 || contador==2) {
				System.out.println("Los numeros primos menores que "+num+" son: "+contador);
				
			}//if
				divisor=2;
		}//for
		return contador;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num;
		Ejercicio4 p = new Ejercicio4();
		
		do {
			System.out.println("Dime un numero positivo y te dare una lista de los numeros primos menores a el:");
			num=teclado.nextInt();
		}
		while(num<0);
		
		num=p.nPrimos(num);
		
	}//main

}//class
