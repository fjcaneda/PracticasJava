package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class MarcoAccion extends JFrame {
	public MarcoAccion() {
		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		PanelAccion Lamina = new PanelAccion();
		add(Lamina);
	}
}

class PanelAccion extends JPanel {
	public PanelAccion() {
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("avion_de_papel.png"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("avion_de_papel.png"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("avion_de_papel.png"), Color.RED);
		/*JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);*/
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonRojo = new JButton("Rojo");
		JButton botonAzul = new JButton("Azul");
		add(botonAmarillo);
		add(botonRojo);
		add(botonAzul);*/	
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
	}
	private class AccionColor extends AbstractAction {   //puede implementar iguamente la interfaz Action
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("colorDeFondo", colorBoton);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color color = (Color)getValue("colorDeFondo");
			setBackground(color);
			System.out.println("Nombre: " + getValue(Action.NAME));
		}
	}
}