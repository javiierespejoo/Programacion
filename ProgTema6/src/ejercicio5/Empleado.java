package ejercicio5;

public class Empleado {

	private String nombre;
	private int numero;
	private static int matricula = 1;
	
	public Empleado() {
		numero = matricula++;
	}
	
	public Empleado (String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String toString() {
		return numero + "-" + nombre;
	}

}
