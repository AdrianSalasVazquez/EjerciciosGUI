package ejercicio2;

import java.awt.*;

public class Ejercicio2TextField {
	private Panel panelTexto = new Panel(new FlowLayout(FlowLayout.LEFT));

	public Ejercicio2TextField(String nombre, int tamanoTexto) {
		panelTexto.add(new Label(nombre));
		panelTexto.add(new TextField(tamanoTexto));
	}
	
	/**
	 * Devuelve el panel creado.
	 * @return Panel panelTexto
	 */
	public Panel getPanel() {
		return panelTexto;
	}
	
	
}
