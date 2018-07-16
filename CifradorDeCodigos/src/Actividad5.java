/** Esta clase construye un cifrador con un código numérico y un numero pasados como
 * parámetros y muestra toda las operaciones de encriptación y desencriptación.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */

public class Actividad5 {
	public static void main(String[] args) {
		Cifrador cifrador = new Cifrador(136578, 20);
		cifrador.mostrarResultados();
	}

}
