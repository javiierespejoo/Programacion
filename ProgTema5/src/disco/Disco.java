package disco;

import java.util.Scanner;

public class Disco {
	static Scanner teclado = new Scanner (System.in);
	
	private String titulo;
	private int numCanciones;
	private double precio;
	private String fechaCompra;
	
	public Disco(String titulo, int numCanciones, double precio, String fechaCompra) {
		this.titulo = titulo;
		this.numCanciones = numCanciones;
		this.precio = precio;
		this.fechaCompra = fechaCompra;
	}
	
	
	public Disco() {
		
	}


	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getNumCanciones() {
		return numCanciones;
	}
	
	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getFechaCompra() {
		return fechaCompra;
	}
	
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public void leerDisco() {
		System.out.println("Introduce el titulo");
		titulo = teclado.nextLine();
		System.out.println("Introduce el numero de canciones");
		numCanciones = teclado.nextInt();
		System.out.println("Introduce el precio");
		precio = teclado.nextDouble();teclado.nextLine();
		System.out.println("Introduce la fecha de compra");
		fechaCompra = teclado.nextLine();
	}
	
	public void verDisco() {
		System.out.println("El titulo es: "+titulo);
		System.out.println("Tiene "+numCanciones+" canciones");
		System.out.println("Cuesta "+precio+" euros");
		System.out.println("Su fecha de compra fue: "+fechaCompra);
	}
}//class
