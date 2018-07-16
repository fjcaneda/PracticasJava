package gestiontaller;
import java.util.*;

public class GestionTaller {
	private HashMap <Matricula, Parte> informe;
	
	public GestionTaller() {
		informe = new HashMap <Matricula, Parte>();
	}
	
	public void anadirParte() {
		Matricula matricula = new Matricula(null, 0, null);
		System.out.println("Introduzca la provincia: ");
		matricula.setProvincia(Lector.leerString());
		System.out.println("Introduzca el número de matrícula: ");
		matricula.setNumero(Lector.leerInt());
		System.out.println("Introduzca la letra: ");
		matricula.setLetra(Lector.leerString());
		System.out.println(" Ahora introduzca los datos del parte correspondiente");
		System.out.println(" ----------------------------------------------------");
		Parte parte= new Parte(0, null, 0.0);
		System.out.println("Introduzca el código: ");
		parte.setCodigo(Lector.leerInt());
		System.out.println("Introduzca una descripción de la avería: ");
		parte.setDescripcion(Lector.leerString());
		System.out.println("Introduzca el importe; ");
		parte.setImporte(Lector.leerDouble());
		informe.put(matricula, parte);
	}
	
	public void listarPartes() {
		Set<Matricula> s = informe.keySet();
		Iterator<Matricula> it = s.iterator();
		while(it.hasNext()) {
			Matricula aux = it.next();
			System.out.println(aux + ": " + informe.get(aux));
		}
	}
	
	public void mostrarPartesPorMatricula() {
		Matricula matricula = new Matricula(null, 0, null);
		Parte parte = new Parte(0, null, 0.0);
		System.out.println("Introduzca la provincia de la matrícula cuyo parte desee ver: ");
		matricula.setProvincia(Lector.leerString());
		System.out.println("Introduzca el número de la matrícula cuyo parte desee ver: ");
		matricula.setNumero(Lector.leerInt());
		System.out.println("Introduzca la letra de la matrícula cuyo parte desee ver: ");
		matricula.setLetra(Lector.leerString());
		if(informe.containsKey(matricula)) {
			parte = informe.get(matricula);
		}
		else {
			System.out.println("No existe ninguna matrícula asociada a ese parte");
		}
		System.out.println("El parte pedido es: ");
		System.out.println(parte.toString());
	}
	
	public void borrarParte() {
		Matricula matricula = new Matricula(null, 0, null);
		System.out.println("Introduzca la provincia de la matrícula que desee borrar: ");
		matricula.setProvincia(Lector.leerString());
		System.out.println("Introduzca el n�mero de la matrícula que desee borrar: ");
		matricula.setNumero(Lector.leerInt());
		System.out.println("Introduzca la letra de la matrícula que desee borrar: ");
		matricula.setLetra(Lector.leerString());
		informe.remove(matricula);
	}
}