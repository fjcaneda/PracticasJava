package taller;
import java.util.*;

public class GestionPartes {
	private String matricula;
	private Parte parte;
	private ArrayList<Parte> partes;
	private HashMap<String, ArrayList<Parte>> informe;
	
	public GestionPartes() {
		informe = new HashMap<String, ArrayList<Parte>>();
	}
	
	public void anadirParte() {
		parte = new Parte(0, null, 0.0);
		System.out.println("Introduzca la matrícula del coche: ");
		matricula = Lector.leerString();
		System.out.println("Introduzca el código: ");
		parte.setCodigo(Lector.leerInt());
		System.out.println("Introduzca una descripción de la avería: ");
		parte.setDescripcion(Lector.leerString());
		System.out.println("Introduzca el importe; ");
		parte.setImporte(Lector.leerDouble());
		partes = new ArrayList<Parte>();
		partes.add(parte);
		informe.put(matricula, partes);
	}
	
	public void listarPartes() {
		Set<String> s = informe.keySet();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void mostrarPartes() {
		System.out.println("Si quiere especificar una matrícula para ver el parte correspondiente" +
				"introduzcala aqui:\n ");
		if (informe.containsKey(Lector.leerString())) {
			String aux = Lector.leerString();
			informe.get(aux);
			System.out.println("Codigo de parte: " + parte.getCodigo());
			System.out.println("descripcion de la aver�a: " + parte.getDescripcion());
			System.out.println("Importe: " + parte.getImporte());
		}
		
	}
	
	public void borrarParte() {
		System.out.println("Introduzca la mat�cula que desee borrar:\n ");
		String aux = Lector.leerString();
		informe.remove(aux);
	}
}
