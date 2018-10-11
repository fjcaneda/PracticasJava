package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		MarcoConFuentes miMarco = new MarcoConFuentes();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConFuentes extends JFrame {
	public MarcoConFuentes() {
		setTitle("Prueba con fuentes");
		setSize(400, 400);
		LaminaConFuentes miLamina = new LaminaConFuentes();
		add(miLamina);
		miLamina.setForeground(Color.BLUE);
	}
}

class LaminaConFuentes extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("Francisco", 100, 100);
		g2.setFont(new Font("Courier", Font.ITALIC, 14));
		//g2.setColor(new Color(128, 90, 50));
		g2.drawString("Curso de Java", 100, 200);
	}
}