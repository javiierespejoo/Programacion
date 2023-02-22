package Ejercicio7;

public class Metodos {
	
	static double longitud(int r) {
		double resultado;
		double PI = 3.14159;
		resultado = 2 * PI * r;
		return resultado;
	}//Fin longitud

	static double superficie(int r) {
		double resultado;
		double PI = 3.14159;
		resultado = PI * Math.pow(r, 2);
		return resultado;
	}//Fin supercifie
	
	static double volumen(int r) {
		double resultado;
		double PI = 3.14159;
		resultado = ((4/3) * PI * Math.pow(r, 3));
		return resultado;
	}//Fin volumen
}//class
