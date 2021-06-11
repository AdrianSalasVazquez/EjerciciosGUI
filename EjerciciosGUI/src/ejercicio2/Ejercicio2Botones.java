package ejercicio2;

import java.awt.*;

public class Ejercicio2Botones {

	private Panel panelBotones = new Panel(new FlowLayout(FlowLayout.CENTER));

	public Ejercicio2Botones(String nombre1, String nombre2) {
		panelBotones.add(new Button(nombre1));
		panelBotones.add(new Button(nombre2));
	}
	
	/**
	 * Devuelve el panel creado.
	 * @return Panel panelBotones
	 */
	public Panel getPanel() {
		return panelBotones;
	}
	
}
