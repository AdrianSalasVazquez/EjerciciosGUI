package ejercicio7;

import java.awt.*;
import java.awt.event.*;

import cosasGenerales.Ventana;

public class Ejercicio7Main {
	
	static int cont = 0;

	public static void main(String[] args) {
			
		Ventana ejercicio3 = new Ventana("Ejercicio 7",300,80);
		Panel panel1 = new Panel();
		ejercicio3.add(panel1);
		
		Button boton1 = new Button("Contar1");
		Button boton2 = new Button("Contar2");
		Label contador = new Label("Contador:");
		TextField cuenta = new TextField();
		cuenta.setEditable(false);
		
		cont = 0;
		cuenta.setText("" + cont);
		
		panel1.add(contador);
		panel1.add(cuenta);
		panel1.add(boton1);
		panel1.add(boton2);
		
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cont++;
				cuenta.setText("" + cont);
			}
		});
		
		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cont++;
				cuenta.setText("" + cont);
			}
		});
		
	}

}
