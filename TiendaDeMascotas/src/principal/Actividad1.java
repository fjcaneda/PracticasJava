package principal;

import animales.Gatos;
import animales.Pajaros;
import animales.Perros;
import util.CodigosPais;

/** En Esta clase se crean una serie de aninales y se muestran por pantalla
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1
 * 
 */

public class Actividad1 {
	public static void main (String[] args) {
		Perros perro1 = new Perros("Scooby doo", CodigosPais.ES);
		Perros perro2 = new Perros("Milú", CodigosPais.FR);
		Gatos gato1 = new Gatos("Azrael", CodigosPais.GB);
		Gatos gato2 = new Gatos("Don gato", CodigosPais.NO);
		Pajaros pajaro1 = new Pajaros("Piolín", CodigosPais.DO);
		Pajaros pajaro2 = new Pajaros("Lorito real", CodigosPais.EC);
	
		System.out.println(perro1);
		System.out.println(perro2);
		System.out.println(gato1);
		System.out.println(gato2);
		System.out.println(pajaro1);
		System.out.println(pajaro2);
	}	
}