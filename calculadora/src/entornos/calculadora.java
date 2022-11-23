/*Proyecto para el módulo "ENTORNOS DE DESARROLLO". Se trata de una calculadora.
 * Este proyecto lo hacemos de forma colaborativa usando un repositorio Git, que subimos
 * al servidor Github.
 * 
 * @Authors: Javier Espejo, Alejandro Mayor, Luis Rodríguez.
 * Fecha de creación: 17/11/2022
 * Última actualización: 17/11/2022 @Alejandro
 * 
 * Menú de selección:
 * 	El usuario puede elegir entre sumar, restar y multiplicar 2 números.
 * 	Si la opción elegida es incorrecta, se avisa al usuario por pantalla y
 * 	se le pide de nuevo elegir una opción.
 * 
 * El resultado de la operación elegida se muestra por pantalla
 */

package entornos;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //objeto teclado para leer la entrada por teclado
		//variables
		String operacion; //Operacion elegida por el usuario
		int a; //Primer número introducido por el usuario
		int b; //Segundo número introducido por el usuario
		int resultado;
		
		
		do {// do-while Seleccion de menu correcta
			
			System.out.println("Elija una operacion a realizar: ");
			System.out.println("+ ---> Sumar");
			System.out.println("- ---> Restar");
			System.out.println("* ---> Multiplicar");
			operacion = teclado.nextLine();
			
			//Mensaje de error si la opcion elegida es incorrecta
			if ( !( operacion.equals("+") || operacion.equals("-") || operacion.equals("*")))
				System.out.println("Error, la opcion seleccionada es incorrecta.");
			
		}
		while( !(operacion.equals("+") || operacion.equals("-") || operacion.equals("*")));
		//Fin do-while Seleccion de menu correcta
		System.out.println("Introduce un valor entero");
		a=teclado.nextInt();
		System.out.println("Introduce otro valor entero");
		b=teclado.nextInt();
		
		//Yo utilizaría "swtich-case" para cada operación posible.
		switch (operacion) {
		//Hacer suma: Javier
		case "+":
			resultado=a+b;
			System.out.println("El resultado de "+a+" + "+b+" = "+resultado);
		break;
		//Hacer resta: Alejandro
		
		case "-":
			resultado = a - b;
			System.out.println("El resultado de " + a + " - " + b + " = " + resultado);
		break;
		
		//Hacer multiplicación: Luis
		case "*":
			resultado=a*b;
			System.out.println("El resultado de "+a+" x "+b+" = "+resultado);
			break;
		
		}
	}//main

}//class