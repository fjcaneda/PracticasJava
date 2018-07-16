package gestiontaller;

/** Esta clase implementa un modelo de parte para ser utilizada en nuestro taller.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1.
 * 
 * @param codigo Un string que almacenará el código del parte.
 * @param descripcion un string que almacenará la descripción de la avería.
 * @param un double que almacenará el importe de la reparación.
 */
public class Parte {
	private int codigo;
	private String descripcion;
	private double importe;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(importe);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Parte other = (Parte) obj;
		if (codigo != other.codigo)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (Double.doubleToLongBits(importe) != Double
				.doubleToLongBits(other.importe))
			return false;
		return true;
	}

	/** Esta es la implementación del constructor para completar un parte.
	 * 
	 *  @param codigo Un string que almacenará el código del parte.
	 *  @param descripcion un string que almacenará la descripción de la avería.
	 *  @param un double que almacenará el importe de la reparación.
	 *
	 */
	public Parte(int codigo, String descripcion, double importe) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
	}
	
	/** Metodo que nos pemite definir el código de un parte
	 * 
	 * @param codigo El código del parte
	 * 
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/** Este método nos permite acceder al cdigo de un parte 
	 * 
	 * @return codigo Un string que almacena el código de la avería.
	 * 
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/** Este método nos permite definir una descripción para la avería.
	 * 
	 * @param descripcion Un string que almacenará la descripción de la avería.
	 * 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/** Este método nos permite accededer a la descripción de la avería.
	 * 
	 * @return descripcion Un string que nos devuelve la descripción de la avería.
	 * 
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/** Este método nos permite fijar el importe de la avería.
	 * 
	 * @param importe Un double que representa el immporte de la avería.
	 * 
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	/** Este método nos permite acceder al importe de una avería.
	 * 
	 * @return Un double con el importe de la avería.
	 * 
	 */
	public double getImporte() {
		return importe;
	}
		
	/** Este método nos permite imprimir por pantalla los datos relativos a la ficha */
	public String toString() {
		return "Código: "+ codigo + " descripción: " + descripcion + " importe: " + importe;
	}
}