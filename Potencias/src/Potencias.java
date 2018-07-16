/** Este programa calcula potencias, los datos son introducidos como argumentos de programa */

public class Potencias {	 
	
	static int base, exp, j;
	public static void main(String args[]) {
		if(args.length < 2 || args.length > 2 )
			System.out.println("Ingrese dos parámetros [Base] [Exponente]");
		else {
			int base =  Integer.parseInt(args[0]);
			int exp =  Integer.parseInt(args[1]);
			j = potencia (base,exp);
			System.out.println(base + "^" + exp + " = " + j);
			/*System.out.println(j + "");*/
		}
	}

	static int potencia (int base, int exp) {
		int resultado=1, exponente=exp;
		float resultadoDecimal = 0;
		if (exp < 0) exponente = -exp;
       
		for(int i = 1; i <= exponente; ++i) {  
			resultado*=base;
		}
	         
                 
		if (exp < 0) {
			exponente = -exp;
			resultadoDecimal = 1 / resultado;
			System.out.println("1/" + resultado + " = " + resultadoDecimal);
			System.exit(0);    
		}
		else if (base == 0 && exp != 0)
			resultado = 0;
		else if (base == 0 && exp == 0) {
			System.out.println ("Indefinido");
			System.exit(0);
		}        
		return resultado;
	}
}