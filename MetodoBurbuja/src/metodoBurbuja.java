
public class metodoBurbuja {
	public static void main(String[] args) {
		/* Leemos los parámetros pasados desde la linea de comandos y los asignamos a un array de 
		* enteros.
		*/
		int numeros[] = new int[args.length];          //Creamos el array
		for (int i = 0; i != args.length; i++) {
			numeros[i] = Integer.parseInt(args[i]);    //asignamos los argumentos al array
		}
		
		/* En este punto empezamos la ordenacion por el método de la burbuja */
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j=0; j < numeros.length - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}	
		}
		
		/* En este punto, imprimimos el array ordenado */
		for (int i = 0; i != numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
