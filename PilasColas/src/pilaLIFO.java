
public class pilaLIFO implements Lista {
	private Nodo top = null;
	private int longitud = 0;

	//NODO
	private static class Nodo {
		Object objeto;
		Nodo siguiente;
	}

    //Otros métodos
	public void push (Object obj) {
		Nodo aux = new Nodo ();
		aux.objeto = obj;
		aux.siguiente = top;
		top = aux;
		longitud++;
	}

	public Object pop () {
		if (top == null){
			return null;//Lista vac�a.
		}
		Object obj = top.objeto;
		top = top.siguiente;
		longitud--;
		return obj;
	}

	public int getLongitud(){
		return longitud;
	}
}