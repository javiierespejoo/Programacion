package trabajador;

import java.util.Scanner;

public class Trabajador {
	static Scanner teclado = new Scanner (System.in);
	
	private String nombre;
	private int id;
	private String e_civil;
	private String turno;
	private int titulacion;
	private int años;
	
	public Trabajador(String nombre, int id, String e_civil, String turno, int titulacion, int años) {
		this.nombre = nombre;
		this.id = id;
		this.e_civil = e_civil;
		this.turno = turno;
		this.titulacion = titulacion;
		this.años = años;
	}
	
	public Trabajador() {
		this.nombre = "Luis";
		this.id = 1;
		this.e_civil = "S";
		this.turno = "S";
		this.titulacion = 2;
		this.años = 2;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public String getE_civil() {
		return e_civil;
	}
	
	public void setE_civil(String e_civil) {
		this.e_civil = e_civil;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public int getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}
	
	public int getAños() {
		return años;
	}
	
	public void setAños(int años) {
		this.años = años;
	}
	
	public void leerTrabajador() {
		System.out.println("Introduce su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce su ID: ");
		id = teclado.nextInt();
		System.out.println("Introduce su estado civil: ");
		e_civil = teclado.nextLine(); teclado.nextLine();
		System.out.println("Introduce su turno: ");
		turno = teclado.nextLine();
		System.out.println("Introduce su titulacion: ");
		titulacion = teclado.nextInt();
		System.out.println("Introduce sus años de antigüedad");
		años = teclado.nextInt();
	}
	
	public void verTrabajador() {
		System.out.println("El nombre del trabajador es: "+nombre);
		System.out.println("El ID del trabajador es: "+id);
		System.out.println("El estado civil del trabajador es: "+e_civil);
		System.out.println("El turno del trabajador es: "+turno);
		System.out.println("La titulacion del trabajador es: "+titulacion);
		System.out.println("Los años de antigüedad del trabajador son: "+años);
	}
	
	public void nomina() {
		int salariob = 425;
		int aux;
		double retencion;
		
		turno = turno.toUpperCase();
		
		if (turno == "N") {
			aux = salariob + 100;
		}
		else
			aux = salariob;
		
		if (años < 0) {
			System.out.println("Hay un error con los años de antigüedad");
		}
		else 
			aux += años * 75;
		
		if (titulacion < 0 || titulacion > 4) {
			System.out.println("Hay un error con los años de titulacion");
		}
		else if (titulacion == 0) {
			aux+= 250;
		}else if (titulacion == 1) {
			aux+= 500;
		}else if (titulacion == 2) {
			aux+= 1000;
		}else if (titulacion == 3) {
			aux+= 1250;
		}else if (titulacion == 4) {
			aux+= 1500;
		}
		/*
		e_civil = e_civil.toUpperCase();
		if (e_civil == "S") {
			retencion = aux * 0.12;
			aux -= retencion;
		}
		else
			retencion = aux * 0.1;
			aux -= retencion;
		*/	
		System.out.println("La nomina del trabajador es de: "+aux+"€");
		
	}
		
}
