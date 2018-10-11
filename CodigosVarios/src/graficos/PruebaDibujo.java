package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos miMarco = new MarcoConDibujos ();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConDibujos extends JFrame {
	public MarcoConDibujos () {
		Toolkit t = Toolkit.getDefaultToolkit();
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		Image icono = t.getImage("imagenes/imagen.png");
		setIconImage(icono);
		LaminaConFiguras miLamina = new LaminaConFiguras ();
		add(miLamina);
	}
}

class LaminaConFiguras extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);	
		g2.draw(elipse);
		g2.draw(new java.awt.geom.Line2D.Double(100, 100, 300, 250));
		double centroEnX = rectangulo.getCenterX();
		double centroEnY = rectangulo.getCenterY();
		double radio = 125;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
		g2.draw(circulo);
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		//g.drawArc(50, 100, 100, 200, 120, 150);
	}
}