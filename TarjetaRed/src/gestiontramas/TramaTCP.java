package gestiontramas;
/** Esta clase crea tramas TCP.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */

public class TramaTCP extends Trama {
	private String tipo = "Esto es una trama TCP";
	
	public TramaTCP(int puerto, int prioridad, String contenido) {
		super(puerto, prioridad, contenido);
	}
	
	//Método getter.
	public String getTipo() {
		return tipo;
	}	
}
