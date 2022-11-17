package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String palabra;
		String aux;
		int A=0,E=0,I=0,O=0,U=0;
		
		System.out.println("Dime una palabra");
		palabra=teclado.nextLine();
		
		for (int i=0; i<palabra.length(); i++) {
			aux=palabra.toUpperCase();
			if (aux.charAt(i)=='A') {
				A++;
			}//if
			else if (aux.charAt(i)=='E') {
				E++;
			}//if2
			else if (aux.charAt(i)=='I') {
				I++;
			}//if3
			else if (aux.charAt(i)=='O') {
				O++;
			}//if4
			else if (aux.charAt(i)=='U') {
				U++;
			}//if5
		}//for
		
		if (A>E && A>I && A>O && A>U) {
			System.out.println("La vocal que mas veces contiene esta palabra es la vocal A ("+A+" veces)");
		}//if
		else if (E>A && E>I && E>O && E>U) {
			System.out.println("La vocal que mas veces contiene esta palabra es la vocal E ("+E+" veces)");
		}//if2
		else if (I>A && I>E && I>O && I>U) {
			System.out.println("La vocal que mas veces contiene esta palabra es la vocal I ("+I+" veces)");
		}//if3
		else if (O>A && O>E && O>I && O>U) {
			System.out.println("La vocal que mas veces contiene esta palabra es la vocal O ("+O+" veces)");
		}//if4
		else if (U>A && U>E && U>I && U>O) {
			System.out.println("La vocal que mas veces contiene esta palabra es la vocal U ("+U+" veces)");
		}//if5
		
	}//main

}//class
