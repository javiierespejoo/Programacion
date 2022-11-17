package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String codigo,año="",sexycurs="";
		int fecha;
		boolean valido, parar=false;
		int masc1=0, masc2=0;
		int fem1=0, fem2=0;
		int error=0;
		
		do {
			System.out.println("Dime un codigo");
			codigo=teclado.nextLine();
			codigo=codigo.toUpperCase();
			año=codigo.substring(0,4);
			sexycurs=codigo.substring(4,6);
			fecha=Integer.parseInt(año);
			
			if (codigo.equals("00000000")) {
				parar=true;
			}//if1
			else {
				parar=false;
			}//else1
		
			if (fecha<1990 || fecha>1995) {
				valido=false;
			}//if2
			else {
				valido=true;
			}//else2
			
			if (valido==true) {
				if (sexycurs.equals("H1")) {
					masc1++;
				}//if_if3
				else if (sexycurs.equals("H2")) {
					masc2++;
				}//if2_if3
				else if (sexycurs.equals("M1")) {
					fem1++;
				}//if3_if3
				else if (sexycurs.equals("M2")) {
					fem2++;
				}//if4_if3
			}//if3
			else {
				error++;
			}//else_if3
		}//do-while
		while(parar==false);
		
		if (parar==true) {
			System.out.println("El numero de HOMBRES en PRIMERO es: "+masc1);
			System.out.println("El numero de HOMBRES en SEGUNDO es: "+masc2);
			System.out.println("El numero de MUJERES en PRIMERO es: "+fem1);
			System.out.println("El numero de MUJERES en SEGUNDO es: "+fem2);
			System.out.println("El numero de codigos incorrectos introducido es: "+error);
		}//if
		
	}//main

}//class
