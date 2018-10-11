package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PruebaImagen {

	public static void main(String[] args) {
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
class MarcoImagen extends JFrame {
	public MarcoImagen() {
		setTitle("Marco con imagenes");
		setBounds(750, 300, 300, 200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
		setVisible(true);
		
	}
}
class LaminaConImagen extends JPanel {
	public LaminaConImagen() {
		try {
			imagen = ImageIO.read(new File("imagenes/avion-de-papel.png"));
			//imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//File miImagen = new File("imagenes/coche.png");
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		
		for(int i = 0; i < 300; i++) {
			for(int j = 0; j < 200; j++) {
				if(i + j > 0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i , alturaImagen * j);
				}
			}
		}
	}
	private Image imagen;
}