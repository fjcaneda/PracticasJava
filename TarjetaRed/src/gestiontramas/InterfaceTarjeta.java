package gestiontramas;
/** Esta clase implementa la interface de la tarjeta de red.
 * 
 * @author Francisco José Caneda Iglesias.
 *
 */

public class InterfaceTarjeta {
	private Buffer1 buffer1 = new Buffer1();
	private Buffer2 buffer2 = new Buffer2();
	
	//Agregamos las tramas a los buffers de entrada
	public void agregarTramas(Object trama) {
		if (buffer1.getTama() < 4) {
			buffer1.agregarTramas(trama);
		} else {
			//Extraemos las dos tramas más prioritarias del buffer1 y agregamos la siguiente.
			buffer2.enviarTramas(buffer1.extraerTramas());
			buffer2.enviarTramas(buffer1.extraerTramas());
			buffer1.agregarTramas(trama);
	}
}
		
	//Mostramos el contenido de los buffers.
	public void mostrarBuffers() {
		buffer1.contenidoBuffer1();
		buffer2.contenidoBuffer2();
	}		
}