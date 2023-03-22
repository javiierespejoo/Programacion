package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int [] vector = new int [100];
		int min=250, max=250;
		
		for(int i=0; i < 100; i++) {
			vector[i] = (int)(Math.random()*400)+101;
			System.out.println(vector[i]);
			
			if(vector[i] <= min) {
				min = vector[i];
			}//if
			else if(vector[i] >= max) {
				max = vector[i];
			}//if2
		}//for
		System.out.println("El numero mas pequeño es: "+min);
		System.out.println("El numero mas grande es: "+max);
		

	}//main

}//class
