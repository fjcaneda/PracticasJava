/** Esta clase crea un cifrador cuya misión es cifrar y descifrar códigos numéricos 
 * 
 * @author Francisco Jose Caneda Iglesias.
 *
 */

public class Cifrador implements Xor, Diferencia, Multiplicacion {
	private int numero;
	private int codigo;
	/*private int resultadoCifrarMultiplicacion;
	private int resultadoDescifrarMultiplicacion;
	private int resultadoCifrarResta;
	private int resultadoDescifrarResta;
	private int resultadoCifrarXor;
	private int resultadoDescifrarXor; */
	
	/** El constuctor pasa al cifrador los códigos a descifrar.
	 * 
	 * @param numero El n�mero con el cual cifraremos/descifraremos el c�digo.
	 * @param codigo El c�digo a cifrar/descifrar
	 *  
	 */
	public Cifrador (int codigo,int numero) {
	this.numero = numero;
	this.codigo = codigo;
	}

	
	/** Este método hace la operación de cifrado multiplicando.
	 * 
	 * @return codigo + numero El código cifrado.
	 * 
	 */
	
	@Override
	public int cifrarMultiplicacion() {
		return codigo * numero;
		
	}

	/** Este método hace la operación de descifrado de la multiplicación.
	 * 
	 * @return cifrarMultiplicacion() / numero El resultado del descifrado.
	 * 
	 */
	@Override
	public int descifrarMultiplicacion() {
		return cifrarMultiplicacion() / numero;
	}

	/** Este método nos permite cifrar un código haciendo la diferencia.
	 * 
	 * @return codigo - numero El resultado del cifrado.
	 * 
	 */
	@Override
	public int cifrarDiferencia() {
		return codigo - numero;
	}

	/** Este método hace la operación de descifrado de la diferencia.
	 * 
	 * @return difrarDiferencia() + numero El resultado descifrado
	 * 
	 */
	@Override
	public int descifrarDiferencia() {
		return cifrarDiferencia() + numero;
	}

	/** Este método hace el cifrado mediante una operación xor.
	 * 
	 * @return codigo ^ numero El código cifrado.
	 * 
	 */
	@Override
	public int cifrarXor() {
		return codigo ^ numero;
	}

	/** Este método hace el descifrado de la opeacion xor.
	 * 
	 * @return cifrarXor() | numero El código descifrado.
	 * 
	 */
	@Override
	public int descifrarXor() {
		return cifrarXor() | numero;
	}
		
	public void mostrarResultados() {
		System.out.println("El resultado de cifrar el código aplicando el producto es: " +
				cifrarMultiplicacion());
		System.out.println("El resultado después de descifrar el código cifrado con la" +
				" multiplicación es: " + descifrarMultiplicacion());
		System.out.println("El resultado de cifrar el código aplicando la diferencia es:" +
				cifrarDiferencia());
		System.out.println("El resultado después de descifrar el código cifrado con la" +
				" diferencia es: " + descifrarDiferencia());
		System.out.println("El resultado del de cifrar el código aplicando el xor es: " +
				cifrarXor());
		System.out.println("El resultado de descifrar el código cifrado con el xor es: " + 
					descifrarXor());
	}
}