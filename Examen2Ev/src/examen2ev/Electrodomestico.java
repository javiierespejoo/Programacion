package examen2ev;

public abstract class Electrodomestico implements Revision{
	private final int peso;
	private int color;
	protected int dias;
	public static final int NEGRO = 0;
	public static final int BLANCO = 0b11111111_11111111_11111111;
	
	public int getPeso() {
		return peso;
	}
	
	public int getColor() {
		return color;
	}
	
	public Electrodomestico(int peso) {
		this.peso = peso;
		color = BLANCO;
		dias = 0;
	}
	
	public void diasTranscurridos(int dias) {
		if (dias < 1) {
			throw new IllegalArgumentException("Dias menor que 1");
		}
		this.dias += dias;
	}
	
	public void diasTranscurridos() {
		diasTranscurridos(30);
		dias += 30;
	}
	
	 public abstract boolean debeRevisarse() ;
	 
	 public abstract void pasarRevision();
	 
	 public void pintar(int color) {
		 if(color < 0 || color > BLANCO) {
			 throw new IllegalArgumentException("Color invalido");
		 }
		 this.color = color;
	 }
	 
}
