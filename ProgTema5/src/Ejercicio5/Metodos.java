package Ejercicio5;

public class Metodos {

	static boolean esPrimo (int numero) {
		boolean primo = true;
		int divisor = 2;
		
		do {
			primo = numero % divisor != 0;
			divisor++;
		}while (primo && divisor < numero);
		
		return primo;
	}//fin esPrimo
	
	static int exponente (int numero, int primo) {
		int dividendo = numero;
		int exp = 0;
		
		do {
			if(dividendo % primo != 0)
				return exp;
			dividendo /= primo;
			exp++;			
		} while(dividendo > 1);
		
		return exp;
	}//Fin exponente
	
	static int menor (int a, int b) {
		if ( a < b)
			return a;
		else
			return b;
	}
	
	static int mcd (int p, int q) {
		/*
		 * Para cada primo, obtenemos el exponente máximo que divide a cada
		 * número
		 */
		
		int acumulador = 1; //Aquí iré añadiendo los factores primos que me interesen
		//Determino el menor de los dos números
		int menor = menor(p,q);
		for(int primo = 2; primo <= menor; primo++) {
			int expP, expQ; //Exponentes
			if(esPrimo(primo)) {
				expP = exponente(p, primo);
				expQ = exponente(q, primo);
				
				acumulador *= Math.pow(primo, menor(expP, expQ));
				
			}
		}
		return acumulador;
	}//fin mcd

}
