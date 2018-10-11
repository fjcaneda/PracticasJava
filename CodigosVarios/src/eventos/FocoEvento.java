package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco miMarcoFoco = new MarcoFoco();
		miMarcoFoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoFoco extends JFrame {
	public MarcoFoco() {
		setVisible(true);
		setBounds(300, 300, 600, 450);
		LaminaFoco mLaminaFoco = new LaminaFoco();
		add(mLaminaFoco);
	}
}

class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFocos eLanzaFocos = new LanzaFocos();
		cuadro1.addFocusListener(eLanzaFocos);
	}
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Tienes el foco");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String email = cuadro1.getText();
			boolean comprobacion = false;
			for(int i = 0; i < email.length(); i++) {
				if(email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			if(comprobacion == true) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
		
	}
}

