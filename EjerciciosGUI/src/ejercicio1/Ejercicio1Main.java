package ejercicio1;

import java.awt.*;

import cosasGenerales.Ventana;

public class Ejercicio1Main {

	public static void main(String[] args) {
		
		Ventana ejercicio1 = new Ventana("Ejercicio 1");
		
		Panel panelPrincipal = new Panel(new GridLayout(4,5));
		ejercicio1.add(panelPrincipal);
		
		Panel panel0 =  new Panel(new GridLayout(2,2));
		panel0.add(new Button("A"));
		panel0.add(new Button("B"));
		panel0.add(new Button("C"));
		panel0.add(new Button("D"));
		
		Panel panel6 =  new Panel(new GridLayout(3,1));
		panel6.add(new Button("A"));
		panel6.add(new Button("B"));
		panel6.add(new Button("C"));
		
		Panel panel12 =  new Panel(new GridLayout(3,1));
		panel12.add(new Button("A"));
		panel12.add(new Button("B"));
		panel12.add(new Button("C"));
		
		Panel panel18 =  new Panel(new BorderLayout());
		panel18.add(new Button("A"),BorderLayout.NORTH);
		panel18.add(new Button("B"),BorderLayout.WEST);
		panel18.add(new Button("C"),BorderLayout.CENTER);
		panel18.add(new Button("D"),BorderLayout.EAST);
		panel18.add(new Button("E"),BorderLayout.SOUTH);
		
		Panel panelDer = new Panel(new GridLayout(1,2));
		panelDer.add(new Button("A"));
		panelDer.add(new Button("B"));
		
		Panel panelDer1 = new Panel(new GridLayout(1,2));
		panelDer1.add(new Button("A"));
		panelDer1.add(new Button("B"));
		
		Panel panelDer2 = new Panel(new GridLayout(1,2));
		panelDer2.add(new Button("A"));
		panelDer2.add(new Button("B"));
		
		Panel panelDer3 = new Panel(new GridLayout(1,2));
		panelDer3.add(new Button("A"));
		panelDer3.add(new Button("B"));
		
		for (int i = 0; i < 20; i++) {
			switch (i) {
			case 0:
				panelPrincipal.add(panel0);
				break;
			case 4:
				panelPrincipal.add(panelDer);
				break;
			case 6:
				panelPrincipal.add(panel6);
				break;
			case 9:
				panelPrincipal.add(panelDer1);
				break;
			case 12:
				panelPrincipal.add(panel12);
				break;
			case 14:
				panelPrincipal.add(panelDer2);
				break;
			case 18:
				panelPrincipal.add(panel18);
				break;
			case 19:
				panelPrincipal.add(panelDer3);
				break;
			default :
				panelPrincipal.add(new Button("" + (i + 1)));
				break;
			}
		}
		
	}

}
