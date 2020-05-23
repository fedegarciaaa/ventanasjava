package poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
public class CreandoMarcoCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanopantalla.height;
		int anchoPantalla = tamanopantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("java");
		
		Image icono = mipantalla.getImage("C:\\Users\\fedeg\\Downloads\\icono.png");
		
		setIconImage(icono);
		
	}
	
	
}

class botones extends JPanel{
	private void initialize() {
	JLabel etiqueta1 = new JLabel("Texto a copiar");
	etiqueta1.setBounds(63, 63, 76, 14);
	getContentPanel().add(etiqueta1);
	
	JLabel etiqueta2 = new JLabel("Texto copiado");
	etiqueta2.setBounds(320, 63, 68, 14);
	getContentPanel().add(etiqueta2);
	
	JButton boton = new JButton("copiar");
	boton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(radiob.getSelection().equals(rdbtnMayuscula.getModel())) {
				campo2.setText(campo1.getText().toUpperCase());
				campo1.setText("");
			} else {
				campo2.setText(campo1.getText());
				campo1.setText("");
			}
		}
	});
	boton.setBounds(187, 105, 89, 23);
	getContentPane().add(boton); 
	}
}





















