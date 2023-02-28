package trabajador;

import java.util.Scanner;

public class Trabajador {
	static Scanner teclado = new Scanner (System.in);
	
	private String nombre;
	private int id;
	private String e_civil;
	private String turno;
	private int titulacion;
	
	public Trabajador(String nombre, int id, String e_civil, String turno, int titulacion) {
		this.nombre = nombre;
		this.id = id;
		this.e_civil = e_civil;
		this.turno = turno;
		this.titulacion = titulacion;
	}
	
	public Trabajador() {
		this.nombre = "Luis";
		this.id = 1;
		this.e_civil = "S";
		this.turno = "S";
		this.titulacion = 2;
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
	
	public void leerTrabajador() {
		System.out.println("Introduce su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce su ID: ");
		id = teclado.nextInt();
		System.out.println("Introduce su estado civil: ");
		e_civil = teclado.nextLine();
		System.out.println("Introduce su turno: ");
		turno = teclado.nextLine();
		System.out.println("Introduce su titulacion: ");
		titulacion = teclado.nextInt();
	}
	
	public void verTrabajador() {
		System.out.println("El nombre del trabajador es: "+nombre);
		System.out.println("El ID del trabajador es: "+id);
		System.out.println("El estado civil del trabajador es: "+e_civil);
		System.out.println("El turno del trabajador es: "+turno);
		System.out.println("La titulacion del trabajador es: "+titulacion);
	}
}
