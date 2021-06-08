package ejercicio2;

import java.awt.*;

public class Ejercicio2CheckBox {

	private Panel panelSeleccion = new Panel(new FlowLayout(FlowLayout.LEFT));

	public Ejercicio2CheckBox(String nombre, String opcion1, String opcion2) {
		panelSeleccion.add(new Label(nombre));
		
		CheckboxGroup grupo = new CheckboxGroup();
		
		Checkbox op1 = new Checkbox(opcion1, false, grupo);
		panelSeleccion.add(op1);
		
		Checkbox op2 = new Checkbox(opcion2, false, grupo);
		panelSeleccion.add(op2);
		
	}
	
	public Panel getPanel() {
		return panelSeleccion;
	}
	
}
