package examen2ev;

public class Horno extends Electrodomestico{
	
	private int diasRevision;
	
	public Horno (int peso) {
		super(peso);
		
		if (peso < 60 && peso > 100) {
			throw new IllegalArgumentException("peso invalido");
		}
		pintar(NEGRO);
	}
	
	//@override
	public boolean debeRevisarse() {
		return dias - diasRevision >= 180;
	}
	
	public void pasarRevision() {
		diasRevision = dias;
	}
	
}
