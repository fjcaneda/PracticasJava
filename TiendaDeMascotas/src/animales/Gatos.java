package animales;

/** Implementamos la clase Gatos.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1
 * 
 */

public class Gatos extends Animales implements AnimalTerrestre {
	private boolean hambre;
	private boolean sed;
	private boolean cansado;
	
	public Gatos(String nombre, String codPais) {
		this.codPais = codPais;
		this.nombre = nombre;
	}
	
	@Override
	public void jugar() {
		//aquí va la implementación del método.

	}

	@Override
	public void sacarAPasear() {
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
	
	public boolean getCansado() {
		return cansado;
	}
	
	public String toString() {
		return "Soy un gato, mi nombre es " + nombre + " y procedo de " + codPais;
	}
}
