package ejercicio2;

import java.awt.*;
public class Ejercicio2TextArea {

	private Panel panelTexto = new Panel(new FlowLayout(FlowLayout.LEFT));

	public Ejercicio2TextArea(String nombre, int cols, int rows) {
		panelTexto.add(new Label(nombre));
		panelTexto.add(new TextArea(cols, rows));
	}
	
	/**
	 * Devuelve el panel creado.
	 * @return Panel panelTexto
	 */
	public Panel getPanel() {
		return panelTexto;
	}
	
}
