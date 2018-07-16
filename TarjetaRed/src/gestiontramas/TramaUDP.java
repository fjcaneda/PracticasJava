package gestiontramas;
/** Esta clase crea tramas UDP.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */
public class TramaUDP extends Trama {
	private String tipo = "Esto es una trama UDP";
	
	public TramaUDP(int puerto, int prioridad, String contenido) {
		super(puerto, prioridad, contenido);
	}
	
	//Método getter
	public String getTipo() {
		return tipo;
	}
}