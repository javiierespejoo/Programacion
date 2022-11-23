package repasoEv1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		int num1, num2;
		int suma,resta, prod;
		double div;
		
		System.out.println("Dime un numero");
		num1=teclado.nextInt();
		System.out.println("Dime otro numero");
		num2=teclado.nextInt();
		
		suma=num1+num2;
		resta=num1-num2;
		prod=num1*num2;
		div=(double)num1/num2;
		
		System.out.println("La suma de los dos numeros es: "+suma);
		System.out.println("La resta de los dos numeros es: "+resta);
		System.out.println("El producto de los dos numeros es: "+prod);
		System.out.println("El cociente de los dos numeros es: "+div);
	}//main

}//class
