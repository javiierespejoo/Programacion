package ejercicio6;

import java.util.Scanner;

public class Fraccion {
	Scanner teclado = new Scanner (System.in);
	
	private int numerador;
	private int denominador;
	
	public Fraccion(){
		
	}
	
	public void Invertir(int numerador, int denominador) {
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		System.out.println("Has elegido invertir la fraccion");
		System.out.println("Y el resultado tras invertirla es este: "+denominador+"/"+numerador);
	}//invertir
	
	public void Simplificar(int numerador, int denominador) {
		int auxNum = numerador, auxDen = denominador;
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		do {
			if(auxNum%2==0 && auxDen%2==0) {
				auxNum = auxNum/2;
				auxDen = auxDen/2;
			}//if2
			else if(auxNum%3==0 && auxDen%3==0) {
				auxNum = auxNum/3;
				auxDen = auxDen/3;
			}//if3
			else if(auxNum%5==0 && auxDen%5==0) {
				auxNum = auxNum/5;
				auxDen = auxDen/5;
			}//if5
			else if(auxNum%7==0 && auxDen%7==0) {
				auxNum = auxNum/7;
				auxDen = auxDen/7;
			}//if7
			else if(auxNum%9==0 && auxDen%9==0) {
				auxNum = auxNum/9;
				auxDen = auxDen/9;
			}//if9
		}
		while (auxNum%2!=0 && auxNum%3!=0 && auxNum%5!=0 && auxNum%7!=0 && auxNum%9!=0);
		
		System.out.println("Has elegido simplificar la fraccion");
		System.out.println("Tras simplificarla nos queda este resultado: "+auxNum+"/"+auxDen);
	}//simplificar
	
	public void Sumar(int numerador, int denominador) {
		int suma = numerador + denominador;
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		System.out.println("Has elegido sumar el numerador y el denominador");
		System.out.println("Tras sumamos nos queda este resultado: "+suma);
	}//sumar
	
	public void Multiplicar(int numerador, int denominador) {
		int multiplicacion = numerador * denominador;
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		System.out.println("Has elegido multiplicar el numerador y el denominador");
		System.out.println("Tras multiplicarlos nos queda este resultado: "+multiplicacion);
	}//multiplicar
	
	public void Dividir(int numerador, int denominador) {
		int division = numerador / denominador;
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		System.out.println("Has elegido dividir el numerador y el denominador");
		System.out.println("Tras dividirlos nos queda este resultado: "+division);
	}//dividir
	
	public void Potencia(int numerador, int denominador) {
		int potencia = (int) Math.pow(numerador, denominador);
		System.out.println("Tu fraccion es esta: "+numerador+"/"+denominador);
		System.out.println("Has elegido elevar el numerador al denominador");
		System.out.println("Tras elevarlos nos queda este resultado: "+potencia);
	}//potencia
	
	public void Finalizar() {
		System.out.println("Has elegido finalizar el programa");
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

}
