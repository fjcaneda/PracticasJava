package animales;

/** Implementación de la clase Pájaro
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1
 * 
 */

public class Pajaros extends Animales implements Aves {
	private boolean hambre;
	private boolean sed;
	
	public Pajaros (String nombre, String codPais) {
		this.codPais = codPais;
		this.nombre = nombre;
	}
	
	@Override
	public void volar() {
		//aquí va la implementación del método.

	}

	@Override
	public void correr() {
		//aquí va la implementación del método.

	}

	@Override
	public void emitirSonido() {
		//aquí va la implementación del método.

	}

	@Override
	public void darDeComer() {
		//aquí va la implementación del método.
	}

	public boolean getHambre() {
		return hambre;
	}
	
	public boolean getSed() {
		return sed;
	}
	
	public String toString() {
		return "Soy un pájaro, mi nombre es " + nombre + " y procedo de " + codPais;
	}
}
