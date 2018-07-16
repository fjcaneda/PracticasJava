package caracteres;

public class Caracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduzca un string: ");
		String cadena = Lector.leerString();
		if(cadena.length() >= 2) {
			System.out.println("Los dos primeros carácteres de la cadena en mayúsculas" +
					" son:(Si la cadena es de dos o mas carácteres: " +
						cadena.substring(0, 2).toUpperCase());
		} else {
			System.out.println("La cadena es demasiado pequeña, vuelva a intentarlo");
		}
		
		if (cadena.length() >= 2) {
			System.out.println("Los dos últimos car�cteres de la cadena en min�sculas" +
					"(En caso de que la cadena tenga dos o más carácteres) son: " +
						cadena.substring(cadena.length() - 2).toLowerCase());
		}
		
		if(cadena.length() >= 2 && cadena.charAt(0) == 'a' && cadena.charAt(1) == 'b') {
			System.out.println("La cadena empieza con los caracteres \"ab\"");
		} else {
			System.out.println("La cadena comienza con car�cteres distintos a \"ab\"");
		}
		
		
		int contador = 0;
		for(int i = 0; i < cadena.length(); i++ ) {
			if(cadena.charAt(i) == cadena.charAt(cadena.length() - 1)) {
				contador++;
			}
		}
		System.out.println("El número de ocurrencias del último caracter es: " + contador);
		
		System.out.println("la cadena con todas las ocurrencias del primer caracter" +
					" cambiadas por \"*\" es: " + cadena.replace(cadena.charAt(0), '*'));
		
		StringBuffer cadena1 = new StringBuffer(cadena);
		cadena1.insert(1,"***");
		cadena1.insert(cadena1.length() - 1, "***");
		System.out.println("La cadena con tres asteriscos después del primer caracter y tres" +
					" antes del último es: " + cadena1.toString());
		
		for(int i = 0; i < cadena1.length(); i++) {
			if(cadena1.charAt(i) == 'a' || cadena1.charAt(i) == 'e' || cadena1.charAt(i) == 'o' ||
					cadena1.charAt(i) == 'u') {
				cadena1.deleteCharAt(i);
			}
		}
		cadena1.reverse();
		System.out.println("La cadena invertida quitando todas las vocales es: " + cadena1.toString());
	}
}