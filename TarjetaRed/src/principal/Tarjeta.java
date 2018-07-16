package principal;
import gestiontramas.InterfaceTarjeta;
import gestiontramas.TramaTCP;
import gestiontramas.TramaUDP;

/** Esta clase instancia el sistema de entrada a la tarjeta de red, se envian
 * seis tramas con puertos y prioridades aleatorias, por último se muestra el contenido de los 
 * buffers de entrada.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */
public class Tarjeta {
	public static void main(String[] args) {
		InterfaceTarjeta tarjeta = new InterfaceTarjeta();
		TramaTCP TCP1 = new TramaTCP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "c");
		TramaTCP TCP2 = new TramaTCP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "b");
		TramaTCP TCP3 = new TramaTCP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "a");
		TramaUDP UDP1 = new TramaUDP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "e");
		TramaUDP UDP2 = new TramaUDP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "f");
		TramaUDP UDP3 = new TramaUDP((int) (Math.random() * 3 + 1), 
				(int) (Math.random() * 10 + 1), "g");
		
		//Agregamos las diferentes tramas a la tarjeta.
		tarjeta.agregarTramas(TCP1);
		tarjeta.agregarTramas(TCP2);
		tarjeta.agregarTramas(TCP3);
		tarjeta.agregarTramas(UDP1);
		tarjeta.agregarTramas(UDP2);
		tarjeta.agregarTramas(UDP3);
		
		//Mostramos el contenido final de los buffers.
		tarjeta.mostrarBuffers();
	}
}
