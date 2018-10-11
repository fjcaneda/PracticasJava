package graficos;

import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado miMarcoCentrado = new MarcoCentrado();
		miMarcoCentrado.setVisible(true);
		miMarcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCentrado extends JFrame {
	public MarcoCentrado () {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int altoPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		setSize(anchoPantalla / 2, altoPantalla / 2);
		setLocation(anchoPantalla / 4, altoPantalla / 4);
		setTitle("Marco centrado");
		Image icono = miPantalla.getImage("imagenes/imagen.png");
		setIconImage(icono);
	}
}