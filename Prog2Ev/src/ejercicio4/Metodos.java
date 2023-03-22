package ejercicio4;

import java.util.Scanner;

public class Metodos {
	Scanner teclado = new Scanner (System.in);
	
	static int [] mesas = new int [10];
	public Metodos() {
		
	}
	
	public void MostrarMesa() {
		for (int i=0; i < 10; i++) {
			System.out.println("La mesa "+(i+1)+" tiene: "+mesas[i]+" comensales");
		}//for
		
	}//mostrarmesa
	
	public void LlenarMesa() {
		
		int comensales;
		int mesaLlena = 0;
		
		for (int i=0; i < 10 || mesas[i] == 0; i++) {
			if(mesas[i] == 0) {
				System.out.println("¿Cuantos comensales seran?");
				comensales = teclado.nextInt();
				if(comensales > 4) {
					System.out.println("Lo siento, no admitimos grupos de "+comensales+", solo grupos de 4 personas maximo");
					
				}//if
				else
					mesas[i] = comensales;
					this.MostrarMesa();
					break;
			}//if
			else
				mesaLlena++;	
		}//for
		
		if(mesaLlena == 10) {
			System.out.println("Lo siento, no quedan mesas libres");
		}//if
		
	}//llenarmesa
	
	public void VaciarMesa() {
		int mesa;
		
		System.out.println("¿Que mesa es la que quieres vaciar?");
		mesa = teclado.nextInt();
		
		mesas[mesa-1] = 0;
		System.out.println("La mesa "+mesa+" se ha vaciado");
		this.MostrarMesa();
		
	}//vaciarmesa
	
	public void FinalizarServicio() {
		
		for(int i=0; i < 10; i++) {
			mesas[i] = 0;
		}//for
		
		this.MostrarMesa();
		System.out.println("Se han vaciado todas las mesas");
		System.out.println("El servicio ha finalizado");
		
	}//finalizarservicio
	
}//metodos

	
	
	

