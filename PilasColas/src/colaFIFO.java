
public class colaFIFO implements Lista {
	private Nodo primero = null;
	private Nodo ultimo = null;
	private int longitud=0;

	private static class Nodo {
		Object objeto;
		Nodo siguiente;
	}

	public void push(Object obj){
		Nodo aux=new Nodo();
		aux.objeto = obj;
		if(longitud == 0){
			primero = aux;
		}else{
			ultimo.siguiente = aux;
		}
		ultimo = aux;
		longitud++;
	}

	public Object pop(){
		Object obj = new Object();
		if(longitud == 0){
			return null;//Cola vacía
		}
		obj = primero.objeto;
		primero = primero.siguiente;
		longitud--;
		return obj;
	}

	public int getLongitud(){
		return longitud;
	}
}