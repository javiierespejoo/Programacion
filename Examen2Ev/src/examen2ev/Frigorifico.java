package examen2ev;

public class Frigorifico extends Electrodomestico{
	
	private int diasRevision;
	
	public Frigorifico (int peso) {
		super(peso);
		
		if (peso < 70 && peso > 150) {
			throw new IllegalArgumentException("peso invalido");
		}
	}
	
	//@override
	public boolean debeRevisarse() {
		return dias - diasRevision >= 360;
	}
	
	public void pasarRevision() {
		diasRevision = dias;
	}
	
}
