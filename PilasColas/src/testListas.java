
public class testListas {

    public static void main(String[] args) {
    	pilaLIFO pila = new pilaLIFO();
    	colaFIFO cola = new colaFIFO();

    	//Añadimos los mismos elementos a la pila y la cola.
    	for(int i=1; i <= 10; i++){
    		pila.push(i);
    		cola.push(i);
    	}

    	//Extraer en PILA
    	System.out.println("ORDEN DE EXTRACCIÓN DE LA PILA");
    	int elementos = pila.getLongitud();
    	for(int i=0; i < elementos; i++){
    		System.out.print("[" + pila.pop() + "]");
    	}

        //Extraer en COLA
    	System.out.println("\nORDEN DE EXTRACCIÓN DE LA COLA");
    	elementos = cola.getLongitud();
    	for(int i=0; i < elementos;i++){
    		System.out.print("[" + cola.pop() + "]");
    	}
    }
}
