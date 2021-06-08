package ejercicio2;

import java.awt.*;

import cosasGenerales.Ventana;

public class Ejercicio2Main {

	public static void main(String[] args) {
		
		Ventana ejercicio2 = new Ventana("Ejercicio 2");
		Panel panelEj2 = new Panel(new BorderLayout());
		ejercicio2.add(panelEj2);
		panelEj2.add(new Label("Registration Form", Label.CENTER), BorderLayout.NORTH);
		
		Panel panelGrid1 = new Panel();
		GridLayout grid = new GridLayout(1,2);
		grid.setVgap(100);
		panelGrid1.setLayout(grid);
		panelEj2.add(panelGrid1);
		
		Panel panelGrid2 = new Panel(new GridLayout(7,1));
		panelGrid1.add(panelGrid2);
		
		
		panelGrid2.add(new Ejercicio2TextField("Name",15).getPanel());
		panelGrid2.add(new Ejercicio2TextField("Mobile",9).getPanel());
		panelGrid2.add(new Ejercicio2CheckBox("Gender","Male","Female").getPanel());
		panelGrid2.add(new Ejercicio2Date("DOB").getPanel());
		panelGrid2.add(new Ejercicio2TextArea("Address",2,15).getPanel());
		
		Panel panel7 = new Panel(new FlowLayout(FlowLayout.CENTER));
		panelGrid2.add(panel7);
		panel7.add(new Checkbox("Accept Tems And Conditions", false));
		
		panelGrid2.add(new Ejercicio2Botones("Submit","Reset").getPanel());
		

		panelGrid1.add(new TextArea());
	}

}
