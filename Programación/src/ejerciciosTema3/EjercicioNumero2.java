package ejerciciosTema3;

import java.util.Scanner;
import java.util.random.*;

public class EjercicioNumero2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int num, j=0;
		double z=(int)(Math.random()*50)+1;
		boolean acierto=false;
		
		System.out.println("He elegido un numero al azar entre 1 y 50.");
		System.out.println("Tienes 7 intentos para adivinarlo.");
		
		do {
			System.out.println("Dime un numero: ");
			num=teclado.nextInt();
			j++;
			if (num==z) {
				System.out.println("Has acertado!!!");
				System.out.println("Tan solo has necesitado "+j+" intentos!!!");
				acierto=true;
			}//if1_for
			else if(num<z && j==7 || num>z && j==7) {
				System.out.println("No has conseguido acertar el numero...");
				System.out.println("El numero escogido era: "+z);
				acierto=true;
			}//if2_for
			else if (num>z) {
				System.out.println("El numero que has dicho es mayor al escogido.");
			}//if3_for
			else if (num<z) {
				System.out.println("El numero que has dicho es menor al escogido.");
			}//if4_for
		}//do
		while (acierto==false && j!=7);

	}//main

}//class
