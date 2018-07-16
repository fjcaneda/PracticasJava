
public class Conversiones {
	public static void main(String[] args) {
		int[] numero = new int[args.length];
		int[] binario = new int[args.length];
		int resultado = 0;
		int posicion = 0;
		for (int i = 0; i < args.length; i++) {
			numero[i] = Integer.parseInt(args[i]);
		}
		
		/* Aqui hacemos la conversión de binario a decimal */
		for (int i = numero.length - 1; i >= 0; i--) {
			resultado = (int) (resultado + (Math.pow(2, posicion)) * numero[i]);
			posicion = posicion + 1;
		}
		System.out.println("El número binario introducido es es decimal:\n" + resultado);
		
		/* Ahora hacemos la conversión de decimal a binario */
		System.out.println("En binario de nuevo es: ");
		int i = 0;
		int cociente = 0;
		int resto = 0;
		if (resultado < 2){
			System.out.println(resultado);
		} else {
			while (resultado >= 2){
				cociente = resultado / 2;
	            resto = resultado % 2;
	            resultado = cociente;
	            binario[i] = resto;
	            i++;
			}
			System.out.print(cociente);
	        i--;
		}
		while (i >= 0){
			System.out.print(binario[i]);
	        i--;
		}
	    System.out.println("");
	}
}
