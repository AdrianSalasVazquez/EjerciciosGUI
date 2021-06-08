package ejercicio4;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import cosasGenerales.Ventana;

public class Ejercicio4Main {

	public static void main(String[] args) {
		
		Ventana ejercicio3 = new Ventana("Ejercicio 4");
		Panel panel1 = new Panel(new GridLayout(4,1));
		ejercicio3.add(panel1);
		
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		Label resultado = new Label();
		resultado.setAlignment(Label.CENTER);
		Button sacarResultado = new Button("Mostrar Resultado");
		
		panel1.add(num1);
		panel1.add(num2);
		panel1.add(resultado);
		panel1.add(sacarResultado);
		
		sacarResultado.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				resultado.setText("" +(Math.max(n1, n2)));
			}
		});

	}

}
