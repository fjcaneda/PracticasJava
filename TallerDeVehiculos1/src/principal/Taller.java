package principal;
import gestiontaller.GestionTaller;
import gestiontaller.Lector;

/** Esta clase es la clase principal que nos permitirá acceder a la gestión de partes.
 * La misma muestra un menú de opciones para acceder a las distintas posibilidades.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1.
 *
 */
public class Taller {

	public static void main(String[] args) {
		GestionTaller gestion = new GestionTaller();
		int opcion = 0;
		do {
			System.out.println("SELECCIONE UNA OPCIÓN");
			System.out.println("---------------------");
			System.out.println("1) CREAR UN PARTE NUEVO");
			System.out.println("2) LISTAR PARTES");
			System.out.println("3) MOSTRAR PARTES POR MATRÍCULA");
			System.out.println("4) ELIMINAR PARTES");
			System.out.println("5) SALIR\n\n");
			System.out.println("Seleccione operacion a realizar (1-5): ");
			opcion = Lector.leerInt();
			
			switch (opcion) {
			case 1:
				gestion.anadirParte();
				break;
			case 2:
				gestion.listarPartes();
				break;
			case 3:
				gestion.mostrarPartesPorMatricula();
				break;
			case 4:
				gestion.borrarParte();
				break;
			case 5:
				System.out.println("Gracias por utilizar nuestra aplicación");
				System.exit(0);
				break;
			default:
				System.out.println("Introduzca una opción...");
				break;
			}
		} while (opcion != 5);
	}
}