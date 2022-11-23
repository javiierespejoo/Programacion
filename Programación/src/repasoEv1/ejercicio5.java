package repasoEv1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		double nota1, ev2, nota2, nota;
		
		System.out.println("Introduce la nota del primer examen");
		nota1=teclado.nextDouble();
		System.out.println("¿Que nota quieres sacar en la segunda evaluacion?");
		ev2=teclado.nextDouble();
		
		nota1=nota1*0.3;
		nota2=ev2-nota1;
		nota=(nota2*10)/7;
		
		System.out.format("Para tener un "+ev2+" en la segunda evaluacion necesitas sacar un "+nota+" en el segundo examen.");
	}//main

}//class
