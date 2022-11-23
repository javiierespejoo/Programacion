package repasoEv1;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		float horas;
		double salario;
		
		System.out.println("Dime cuantas horas ha trabajado esta semana");
		horas=teclado.nextFloat();
		
		salario=(double)horas*12;
		
		System.out.println("El salario semanal de ese trabajador es de "+salario+" euros.");
		
	}//main

}//class
