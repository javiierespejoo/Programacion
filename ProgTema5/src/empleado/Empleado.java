package empleado;

import java.util.Scanner;

public class Empleado {
	Scanner teclado = new Scanner (System.in);
	
	private String nombre;
	private int id;
	
	public Empleado(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public Empleado() {
		
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
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void leerEmpleado() {
		System.out.println("Introduce su nombre");
		nombre = teclado.nextLine();
		System.out.println("Introduce su ID");
		id = teclado.nextInt();
	}
	
	public void verEmpleado() {
		System.out.println("El nombre del empleado es: "+nombre);
		System.out.println("El ID del empleado es: "+id);
	}
}
