package Ejercicio9;

public class Metodos {
	
	public static boolean rcuad(int a, int b, int c) {
		if (Math.pow(b, 2)-(4*a+c)>0) {
			return true;
		}
		else
			return false;
	}//rcuad
	
	public static double raiz1(int a, int b, int c) {
		double resultado, raiz;
		raiz = Math.pow(b, 2)-4*a*c;
		
		if (rcuad(a,b,c) == true) {
			resultado =  (-b+Math.sqrt(raiz))/(2*a);
			return resultado;
		}
		else
			System.out.println("No tiene R1 posible");
			return resultado = -1;
			
	}//raiz1
	
	public static double raiz2(int a, int b, int c) {
		double resultado, raiz;
		raiz = Math.pow(b, 2)-4*a*c;
		
		if (rcuad(a,b,c) == true) {
			resultado =  (-b-Math.sqrt(raiz))/(2*a);
			return resultado;
		}
		else
			System.out.println("No tiene R2 posible");
			return resultado = -1;
			
	}//raiz2
}//class
