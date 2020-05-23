package graficos;

import java.awt.*;

import javax.swing.*;

public class creandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ventana1 marco1 = new ventana1();
		
		
		ventana2 marco2 = new ventana2();
		
		
		
		
	}

}

class ventana1 extends JFrame{
	
	public ventana1() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
	
		setBounds(500,300,550,300);
		
		//setResizable(false);
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Primera ventana");

		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Image icono = mipantalla.getImage("C:\\Users\\fedeg\\Downloads\\icono.png");
		
		setIconImage(icono);
		
		lamina lamina = new lamina();
		
		add(lamina);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}


class ventana2 extends JFrame{
	
	public ventana2(){
		
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla = pantalla.getScreenSize();
		
		int alturaPantalla = tamanopantalla.height;
		int anchoPantalla = tamanopantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Segunda ventana");
				
		Image icono = pantalla.getImage("C:\\Users\\fedeg\\Downloads\\icono.png");
		
		setIconImage(icono);
		
		lamina lamina = new lamina();
		
		add(lamina);
			
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}

class lamina extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Esto es una ventana", 100, 100);
		
	}
	
}