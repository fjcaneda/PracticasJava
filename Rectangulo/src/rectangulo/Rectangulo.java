package rectangulo;

public class Rectangulo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduzca el valor del primer lado: ");
		String l1 = Lector.leerString();
		System.out.println("Introduzca el valor del segundo lado: ");
		String l2 = Lector.leerString();
		Rectangulo.esCuadrado(Double.parseDouble(l1),Double.parseDouble(l2));
		Rectangulo.calcular(Double.parseDouble(l1), Double.parseDouble(l2));
	}
	
	public static void esCuadrado(double lado1, double lado2) {
		long inicio = System.nanoTime();
		if(lado1 == lado2) {
			System.out.println("Es un cuadrado perfecto");
		} else {
			System.out.println("Es un rectángulo");
		}
		long fin = System.nanoTime();
		System.out.println("El método esCuadrado se ha ejecutado en : " +
				(fin - inicio) + " nanosegundos");
	}
	
	public static void calcular(double lado1, double lado2) {
		long inicio = System.nanoTime();
		System.out.println("El área es: " + lado1 * lado2);
		System.out.println("El perímetro es: " + (2 * lado1) + (2 * lado2));
		long fin = System.nanoTime();
		System.out.println("El método calcular se ha ejecutado en: " +
				(fin - inicio) + " nanosegundos.");
	}
}
