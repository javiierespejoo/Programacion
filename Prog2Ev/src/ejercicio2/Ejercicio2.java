package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] vector = new int [20];
		int[] pares = new int [20];
		int[] impares = new int [20];
		
		for (int i=0; i < 20; i++) {
			vector[i] = (int)(Math.random()*100)+1;
			System.out.print(vector[i]+" ");
		}//for

		System.out.println();
		
		int contPar = 0;
		int contImpar = 0;
		for (int i=0; i < 20; i++) {
			if (vector[i]%2 == 0) {
				pares[contPar] = vector[i];
				contPar++;
			}//if
			else {
				impares[contImpar] = vector[i];
				contImpar++;
			}//else
		}//for
		
		 for (int i=0; i < contPar; i++) {
			 vector[i] = pares[i];
		 }//for
		 
		 for(int i=0; i < contImpar; i++) {
			 vector[i + contPar] = impares[i];
		 }//for
		 
		 for(int i=0; i < 20; i++) {
			 System.out.print(vector[i]+" ");
		 }//for
			
	}//main

}//class