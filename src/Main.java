import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		// Create a new frame (a window)
				JFrame frame = new JFrame();
				frame.setTitle("Tarea 1");
				
				//creando observador
				Pantalla screen = new Pantalla();
				
				//creando sujetos a observar
				Boton btn1 = new Boton("amarillo");
				Boton btn2 = new Boton("azul");
				Boton btn3 = new Boton("rojo");
				
				//añadiendo los botones a la pantalla
				screen.add(btn1.boton);
				screen.add(btn2.boton);
				screen.add(btn3.boton);
				
				//enlazando los botones con la pantalla
				btn1.enlazarObservador(screen);
				btn2.enlazarObservador(screen);
				btn3.enlazarObservador(screen);
				
				//accion a realizar
				btn1.pintarPantalla();
				btn2.pintarPantalla();
				btn3.pintarPantalla();
				
				frame.add(screen);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(300, 300);

				// Open the window
				frame.setVisible(true);
				frame.requestFocus();

	}

}
