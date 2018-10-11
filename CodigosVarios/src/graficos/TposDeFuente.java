package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class TposDeFuente {

	public static void main(String[] args) {
		String fuente = JOptionPane.showInputDialog("Introfuce fuente");
		boolean estaLaFuente = false;
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nombreDeFuente: nombresDeFuentes) {
			if (nombreDeFuente.equals(fuente)) {
				estaLaFuente = true;
			}
		}
		
		if (estaLaFuente) {
			System.out.println("la fuente está instalada en el sistema");
		} else {
			System.out.println("La fuente no se encuentra en el sistema");
		}
	}

}
