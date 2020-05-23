package poo;

import javax.swing.*;
import java.awt.*;

public class Escirbiendomarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoTexto marco = new MarcoTexto();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setVisible(true);
		
		setSize(600,459);
		
		setLocation(400,200);
		
		setTitle("Primer texto");
	
		lamina lamina = new lamina();
	
		add(lamina);
		
	}
	
	
}


class lamina extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Esto es una prueba", 100, 100);
		
	}
	
}