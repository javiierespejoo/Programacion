package repasoEv1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		float horas, extra;
		double salario;
		
		
		System.out.println("Dime cuantas horas ha trabajado esta semana");
		horas=teclado.nextFloat();
		
		if (horas<=40) {
			salario=(double)horas*12;
			System.out.println("El salario semanal de ese trabajador es de "+salario+" euros.");
		}//if1
		else {
			extra=horas-40;
			salario=(double)(40*12)+(extra*16);
			System.out.println("El salario semanal de ese trabajador es de "+salario+" euros.");
		}//else
			
	}//main

}//class
