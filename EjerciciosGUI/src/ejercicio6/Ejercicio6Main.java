package ejercicio6;

import java.awt.*;
import java.awt.event.*;

import cosasGenerales.Ventana;

public class Ejercicio6Main {
	
	private static boolean llamada = false;

	public static void main(String[] args) {
		
		Ventana ejercicio6 = new Ventana("Ejercicio 6", 250, 300);
		
		Panel panelTelefono = new Panel(new BorderLayout());
		ejercicio6.add(panelTelefono);
		
		Panel panelResultado = new Panel();
		TextArea resultado = new TextArea(1,25);
		panelResultado.add(resultado);
		panelTelefono.add(panelResultado, BorderLayout.NORTH);
		
		Button[] botones = new Button[10];
		Panel panelDigitos = new Panel(new GridLayout(4,3));
		for (int i = 0; i < 9; i++) {
			botones[i] = new Button("" + (i + 1));
			panelDigitos.add(botones[i]);
		}
		Button borrar = new Button("BORRAR");
		botones[9] = new Button("0");
		Button llamarColgar = new Button("LLAMAR");
		panelDigitos.add(borrar);
		panelDigitos.add(botones[9]);
		panelDigitos.add(llamarColgar);
		panelTelefono.add(panelDigitos);
	
		botones[0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 1);
			}
		});
		botones[1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 2);
			}
		});
		botones[2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 3);
			}
		});
		botones[3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 4);
			}
		});
		botones[4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 5);
			}
		});
		botones[5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 6);
			}
		});
		botones[6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 7);
			}
		});
		botones[7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 8);
			}
		});
		botones[8].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 9);
			}
		});
		botones[9].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.append("" + 0);
			}
		});
		
		borrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resultado.setText("");
			}
		});
		
		llamarColgar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (llamada == false) {
					llamada = true;
					llamarColgar.setLabel("COLGAR");
				}else {
					llamada = false;
					llamarColgar.setLabel("LLAMAR");
				}
			}
		});
		
	}

}
