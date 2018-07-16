package taller;

/** Esta clase implementa un módelo de parte para ser utilizada en nuestro taller.
 * 
 * @author Francisco José Caneda Iglesias.
 * @version 0.1.
 * 
 * @param codigo un string que almacenará el código del parte.
 * @param descripcion un string que almacenará la descripción de la avería.
 * @param un double que almacenará el importe de la reparación.
 */

public class Parte {
	private int codigo;
	private String descripcion;
	private double importe;
	
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
	 * @param código El codigo del parte
	 * 
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/** Este método nos permite acceder al código de un parte 
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
}