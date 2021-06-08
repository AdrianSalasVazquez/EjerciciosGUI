package ejercicio3;

import java.awt.*;
import java.awt.event.*;

import cosasGenerales.Ventana;

public class Ejercicio3Main {

	public static void main(String[] args) {
		
		Ventana ejercicio3 = new Ventana("Ejercicio 3",300,120);
		Panel panel1 = new Panel(new GridLayout(1,3));
		ejercicio3.add(panel1);
		
		Button boton1 = new Button("BOTON1");
		Button boton2 = new Button("BOTON2");
		Label etiqueta = new Label();
		etiqueta.setAlignment(Label.CENTER);
		
		panel1.add(boton1);
		panel1.add(etiqueta);
		panel1.add(boton2);
		
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("BOTON1");
			}	
		});
		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("BOTON2");
			}	
		});
		
	}

}
