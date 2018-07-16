package animales;

/** Esta clase define una clase animales implementando una serie de atributos e implementando
 * los métodos comunes a todos ellos, asi mismos se declaran métodos abstractos que se implementaran
 * en cada animal en concreto ya que todos los utilizan de diferente manera.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1
 * 
 */

public abstract class Animales {
	protected String nombre;
	protected String codPais;
	
	public void andar() {
	//aqui va el código correspondiente a la implementación.	
	}
	
	public abstract void correr();
	public abstract void emitirSonido();
	public abstract void darDeComer();
	public void darDeBeber() {
		//aquí va la implementación del método.
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCodPais() {
		return codPais;
	}
}