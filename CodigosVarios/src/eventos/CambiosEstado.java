package eventos;

import javax.swing.JFrame;

import java.awt.Frame;
import java.awt.event.*;

public class CambiosEstado {

	public static void main(String[] args) {
		MarcoEstado miMarco = new MarcoEstado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEstado extends JFrame {
	public MarcoEstado() {
		setVisible(true);
		setBounds(300, 300, 500, 350);
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
	}
}

class CambiaEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa");
		} else if (e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana está normal");
		} else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		}
	}
}