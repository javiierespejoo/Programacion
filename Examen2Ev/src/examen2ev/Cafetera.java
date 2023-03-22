package examen2ev;

public class Cafetera extends Electrodomestico{
	int servicios, serviciosRevision;
	
	public Cafetera (int peso) {
		super(peso);
		
		if (peso < 2 && peso > 6) {
			throw new IllegalArgumentException("peso invalido");
		}
	}
	
	public boolean debeRevisarse() {
		return servicios - serviciosRevision >= 200;
	}
	
	public void pasarRevision() {	
		serviciosRevision = servicios;
	}
	
	public void serviciosHechos(int servicios) {
		if(servicios < 0) {
			throw new IllegalArgumentException();
		}
		this.servicios = servicios;
	}
	
}
