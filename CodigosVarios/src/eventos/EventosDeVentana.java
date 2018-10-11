package eventos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosDeVentana {

	public static void main(String[] args) {
		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
	}
}

class MarcoVentana extends JFrame {
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(300, 300, 500, 350);
		setVisible(true);
		//M_Ventana oyenteVentana = new M_Ventana();
		//addWindowListener(oyenteVentana);
		addWindowListener(new M_Ventana());
	}
}

class M_Ventana extends WindowAdapter {

	/*@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana ha sido cerrada");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent ee) {
		System.out.println("Ventana abierta");
	}*/
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}