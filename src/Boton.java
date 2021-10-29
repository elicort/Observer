import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class Boton {
	public JButton boton;
	private String color;
	private Pantalla observador;
	

public Boton (String color) {
	this.color=color;
	this.boton= new JButton(color);
}
public void pintarPantalla() {
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(color=="amarillo") {
				System.out.println("amarillo");
				Main.screen.setBackground(Color.YELLOW);
			}
			if(color=="azul") {
				System.out.println("azul");
				Main.screen.setBackground(Color.BLUE);
			}
			if(color=="rojo") {
				System.out.println("rojo");
				Main.screen.setBackground(Color.RED);
			}
			
		}
	};
	boton.addActionListener(listener);
}
public void enlazarObservador(Pantalla p) {
	observador=p;
}

public void notificar() {
	
}

}
