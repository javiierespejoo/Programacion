package repasoEv1;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		int dia, mes;
		
		do {
		System.out.println("Dime en que mes naciste");
		mes=teclado.nextInt();
		}
		while (mes<=0 || mes>=13);
		
		do {
		System.out.println("Dime en que dia naciste");
		dia=teclado.nextInt();
		}
		while (dia<=0 || dia>=32);
		
		if (dia>=21 && mes==3 || dia>=1 && dia<=20 && mes==4) {
			System.out.println("Tu signo del zodiaco es Aries.");
		}//ifAries
		else if (dia>=21 && mes==4 || dia>=1 && dia<=21 && mes==5) {
			System.out.println("Tu signo del zodiaco es Tauro.");
		}//ifTauro
		else if (dia>=22 && mes==5 || dia>=1 && dia<=21 && mes==6) {
			System.out.println("Tu signo del zodiaco es Geminis.");
		}//ifGeminis
		else if (dia>=22 && mes==6 || dia>=1 && dia<=22 && mes==7) {
			System.out.println("Tu signo del zodiaco es Cancer.");
		}//ifCancer
		else if (dia>=23 && mes==7 || dia>=1 && dia<=22 && mes==8) {
			System.out.println("Tu signo del zodiaco es Leo.");
		}//ifLeo
		else if (dia>=23 && mes==8 || dia>=1 && dia<=22 && mes==9) {
			System.out.println("Tu signo del zodiaco es Virgo.");
		}//ifVirgo
		else if (dia>=23 && mes==9 || dia>=1 && dia<=22 && mes==10) {
			System.out.println("Tu signo del zodiaco es Libra.");
		}//ifLibra
		else if (dia>=23 && mes==10 || dia>=1 && dia<=22 && mes==11) {
			System.out.println("Tu signo del zodiaco es Escorpio.");
		}//ifEscorpio
		else if (dia>=23 && mes==11 || dia>=1 && dia<=21 && mes==12) {
			System.out.println("Tu signo del zodiaco es Sagitario.");
		}//ifSagitario
		else if (dia>=22 && mes==12 || dia>=1 && dia<=20 && mes==1) {
			System.out.println("Tu signo del zodiaco es Capricornio.");
		}//ifCapricornio
		else if (dia>=21 && mes==1 || dia>=1 && dia<=19 && mes==2) {
			System.out.println("Tu signo del zodiaco es Acuario.");
		}//ifAcuario
		else if (dia>=20 && mes==2 || dia>=1 && dia<=20 && mes==3) {
			System.out.println("Tu signo del zodiaco es Piscis.");
		}//ifPiscis
		
	}//main

}//class
