import java.awt.Color;

import javax.swing.JPanel;

public class Pantalla extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel panel;
	
	public void update(Color color) {
		
		Main.screen.setBackground(color);
		
	}
}
