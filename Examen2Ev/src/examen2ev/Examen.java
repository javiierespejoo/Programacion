package examen2ev;

public class Examen {

	public static void main(String[] args) {
		
		Electrodomestico[] e;
		e = new Electrodomestico[1000000];
		
		for (int i = 0; i < e.length; i++) {
			int tipo = (int) (Math.random()*3);
			if (tipo == 0) {
				e[i] = new Horno(aleatorio(60, 100));
			}
			else if(tipo == 1) {
				e[i] = new Cafetera(aleatorio(2,6));
			}
			else {
				e[i] = new Frigorifico(aleatorio(70, 150));
			}
			
			if (Math.random() < 0.5) {
				e[i].pintar((int)(Math.random() * Electrodomestico.BLANCO)+1);
			}
			
		}//for
		
		for(int i = 0; i < e.length; i++) {
			boolean pintado;
			
			if(e[i] instanceof Horno) {
				System.out.print("Horno \t" + e[i].getPeso());
				pintado = e[i].getColor() != Electrodomestico.NEGRO;
			}
			else {
				pintado = e[i].getColor() != Electrodomestico.BLANCO;
				if(e[i] instanceof Cafetera) {
					System.out.print("Cafetera \t" + e[i].getPeso());
				}
				else {
					System.out.print("Frigorifico \t" + e[i].getPeso());
				}
			}
			if (pintado) {
				System.out.print("\t" + Integer.toBinaryString(e[i].getColor()));
			}
			
		}//for
		
	Transporte[] t = new Transporte[10000];
	for (int i = 0; i < t.length; i++) {
		t[i] = new Transporte(aleatorio(Transporte.MINIMO, Transporte.MAXIMO));
	}//for
		
		
		
		
	}//main
	
	static int aleatorio (int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
	
}//class

