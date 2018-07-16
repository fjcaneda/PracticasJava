package gestiontramas;
/** Esta clase crea una trama, ya sea TCP o UDP
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */

public class Trama {
	private int puerto;         //1, 2  o 3.
	private int prioridad;      //1 a 10 (1 = mayor prioridad).
	private String contenido = "FRAN";
	
	//Creamos ahora el constructor de la trama.
	public Trama (int puerto, int prioridad, String contenido) {
		this.puerto = puerto;
		this.prioridad = prioridad;
		this.contenido = contenido;
	}

	//Métodos getter
	public int getPuerto() {
		return puerto;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	//M�todos setter
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}