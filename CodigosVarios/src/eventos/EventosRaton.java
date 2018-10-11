package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

import org.w3c.dom.ls.LSException;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton miMarcoRaton = new MarcoRaton();
		miMarcoRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRaton extends JFrame {
	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeRaton eventosDeRaton = new EventosDeRaton();
		//addMouseListener(eventosDeRaton);
		addMouseMotionListener(eventosDeRaton);
	}
}

/*class EventosDeRaton implements MouseListener { //o utilizar (heredar de) la clase adaptadora 

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho clik");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}
}*/

/*class EventosDeRaton extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("Coordenada X: " + e.getX() +
				" Coordenada Y: " + e.getY());
		System.out.println("Has hecho clic " + e.getClickCount() + " veces");
		
	}
	
	public void mousePressed(MouseEvent e) {
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el botón izquierdo");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del ratón");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el botón izquierdo");
		}
	}
}*/
	
class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando el ratón");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el ratón");
	}
	
}