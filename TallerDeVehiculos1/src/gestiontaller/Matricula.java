package gestiontaller;
/**Esta clase implementa una matrícula para ser utilizada en nuestro taller.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1.
 * 
 * @param provincia un String que almacenará la provincia.
 * @param numero un int que almacenará el número de matrícula.
 * @param letra un String que almacenará la letra o letras de la matrícula.
 */
public class Matricula {
	private String provincia;
	private int numero;
	private String letra;
	
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((letra == null) ? 0 : letra.hashCode());
		result = prime * result + numero;
		result = prime * result
				+ ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		if (letra == null) {
			if (other.letra != null)
				return false;
		} else if (!letra.equals(other.letra))
			return false;
		if (numero != other.numero)
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	/** La implementración del constructor para completar una matrícula
	* 
	* @param provincia un String que almacenará la provincia.
	* @param número un int que almacenará el número de matrícula.
	* @param letra un String que almacenará la letra o letras de la matrícula.
	*/
	public Matricula(String provincia, int numero, String letra) {
		this.provincia = provincia;
		this.numero = numero;
		this.letra = letra;
	}
		
	/** Mtodo que permite definir la letra de una matrícula 
	* 
	* @param provincia la provincia.
	*/
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	/** étodo que permite acceder a la provincia.
	 * 
	 * @return provincia la provincia.
	 */
	public String getProvincia() {
		return provincia;
	}
	
	/** Método que permite asignar el número de matrícula.
	 * 
	 * @param numero un int que permite pasar el número de matrícula
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/** M�todo que permite acceder al número de matrícula
	 * 
	 * @return numero el número de la matrícula.
	 */
	public int getNumero() {
		return numero;
	}
	
	/** Método que permite asignar la o las letras de la matrícula.
	 * 
	 * @param letra un String que indica la o las letras de la matrícula.
	 */
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	/** Método que permite acceder a la o las letras de la matrícula.
	 * 
	 * @return letra la o las letras de la matrícula.
	 */
	public String getLetra() {
		return letra;
	}
	
	/** Este método nos permite imprimir por pantalla los datos relativos a la matrícula */
	public String toString() {
		return provincia + "-" + numero + "-" + letra;
	}
}
