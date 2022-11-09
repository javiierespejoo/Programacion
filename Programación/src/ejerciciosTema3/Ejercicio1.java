package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			int num1, num2;
			int suma=0, contador;
			
			System.out.println("Dime dos numeros y te dire la suma de los numeros comprendidos entre ellos: ");
			System.out.println("Dime el primer numero: ");
				num1=teclado.nextInt();
			System.out.println("Dime el segundo numero: ");
				num2=teclado.nextInt();
			if (num1>num2) {//if1
				System.out.println("El segundo valor ha de ser mayor que el primero, dime otros dos numeros.");
				System.out.println("Dime el primer numero: ");
				num1=teclado.nextInt();
				System.out.println("Dime el segundo numero: ");
				num2=teclado.nextInt();
			}//if1
			else if (num1==num2) {//if2
				
			}//if2
			else {
				contador=num1+1;
				while (contador<num2) { 
						suma=suma+contador;
						contador++;
				}//while
			}//else
				System.out.println("La suma de los numeros comprendidos entre estos dos es: "+suma);
	
	}//main
					
}//class


