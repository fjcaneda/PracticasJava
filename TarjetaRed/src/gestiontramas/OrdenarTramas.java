package gestiontramas;
/** Esta clase ordena las tramas por prioridad primero y luego por contenido.
 * 
 * @autor: Francisco Jos� Caneda Iglesias.
 * 
 */
import java.util.Comparator;

public class OrdenarTramas  implements Comparator <Object> {
	public int compare (Object objeto1, Object objeto2) {
		Trama trama1 = (Trama)objeto1;
		Trama trama2 = (Trama)objeto2;
		if (trama1.getPrioridad() == trama2.getPrioridad()) {
			return trama1.getContenido().compareToIgnoreCase(trama2.getContenido());
		} else {
			return trama1.getPrioridad() - trama2.getPrioridad();
		}
	}
}