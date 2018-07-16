package gestiontramas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/** Esta clase crea un buffer con capacidad máxima para cuatro tramas.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */
public class Buffer1 {
	private ArrayList <Object> buffer1 = new ArrayList<Object>();
	
	// agregamos tramas al buffer1.
	public void agregarTramas(Object trama) {
		buffer1.add(trama);
		ordenarPrioridad();		
	}

	public Object extraerTramas() {
		Object trama = buffer1.get(0);
		buffer1.remove(0);
		return trama;
	}
	
	public int getTama() {
		return buffer1.size();
	}
	
	public void ordenarPrioridad() {
		Collections.sort(buffer1, new OrdenarTramas());
	}
	
	public void contenidoBuffer1() {
		System.out.println("Contenido del buffer1:");
		System.out.println("----------------------");
		System.out.println ("");
		Iterator<Object> it = buffer1.iterator();
		while(it.hasNext()) {
			Object objeto;
			objeto = it.next();
			if (objeto.getClass().getName().equals("TramaTCP")) {
				TramaTCP tcpAux;
				tcpAux = (TramaTCP)objeto;
				System.out.println("****TRAMA TCP***********************");
				System.out.println("Puerto: " + tcpAux.getPuerto());
				System.out.println("Prioridad: " + tcpAux.getPrioridad());
				System.out.println("Contenido: " + tcpAux.getContenido());
				System.out.println("****TRAMA TCP***********************");
				System.out.println ("");
			} else {
				TramaUDP udpAux;
				udpAux = (TramaUDP)objeto;
				System.out.println("****TRAMA UDP************************");
				System.out.println("Puerto: " + udpAux.getPuerto());
				System.out.println("Prioridad: " + udpAux.getPrioridad());
				System.out.println("Contenido: " + udpAux.getContenido());
				System.out.println("****TRAMA UDP************************");
				System.out.println ("");
			}
		}
	}
}
