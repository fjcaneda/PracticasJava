package gestiontramas;
import java.util.ArrayList;
import java.util.Iterator;

/** En esta clase creamos el segundo buffer con tres puertos 
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */
public class Buffer2 {
	private ArrayList <Object> puerto1 = new ArrayList<Object>();
	private ArrayList <Object> puerto2 = new ArrayList<Object>();
	private ArrayList <Object> puerto3 = new ArrayList<Object>();
	
	public void enviarTramas(Object trama) {
		Trama objeto = (Trama)trama;
		switch (objeto.getPuerto()) {
		case 1:
			puerto1.add(trama);
			break;
		case 2:
			puerto2.add(trama);
			break;
		case 3:
			puerto3.add(trama);
			break;
		}
	}
	
	public void contenidoBuffer2() {
		System.out.println ("*************************");
		System.out.println ("CONTENIDO DEL BUFFER 2");
		System.out.println ("*************************6");
		System.out.println ("");
		System.out.println ("Las tramas en el puerto 1 son: ");
		System.out.println ("");
		Iterator<Object> contenido = puerto1.iterator();
		leerPuerto (contenido);
		System.out.println ("Las tramas en el puerto 2 son: ");
		System.out.println ("");
		contenido = puerto2.iterator();
		leerPuerto (contenido);
		System.out.println ("Las tramas en el puerto 3 son: ");
		System.out.println ("");
		contenido = puerto3.iterator();
		leerPuerto (contenido);
	}
	
	private void leerPuerto(Iterator<Object> it) {
		while (it.hasNext()) {
			Object objeto;
			objeto = it.next();
			if (objeto.getClass().getName() == "TramaTCP") {
				TramaTCP tcpAux;
				tcpAux = (TramaTCP)objeto;
				System.out.println("****TRAMA TCP************************");
				System.out.println("Puerto: " + tcpAux.getPuerto());
				System.out.println("Prioridad: " + tcpAux.getPrioridad());
				System.out.println("Contenido: " + tcpAux.getContenido());
				System.out.println ("****TRAMA TCP***********************");
				System.out.println ("");
			} else {
				TramaUDP udpAux;
				udpAux = (TramaUDP)objeto;
				System.out.println("***TRAMA UDP************************");
				System.out.println("Puerto: " + udpAux.getPuerto());
				System.out.println("Prioridad: " + udpAux.getPrioridad());
				System.out.println("Contenido: " + udpAux.getContenido());
				System.out.println ("****TRAMA UDP***********************");
				System.out.println ("");
			}
		}	
	}
}