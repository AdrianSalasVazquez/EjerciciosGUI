package ejercicio5;

import java.awt.*;
import java.awt.event.*;

import cosasGenerales.Ventana;

public class Ejercicio5Main {
	
	static int cont = 0;

	public static void main(String[] args) {
		
		Ventana ejercicio3 = new Ventana("Ejercicio 5",200,80);
		Panel panel1 = new Panel();
		ejercicio3.add(panel1);
		
		Button boton = new Button("Contar");
		Label contador = new Label("Contador:");
		TextField cuenta = new TextField();
		cuenta.setEditable(false);
		
		cont = 0;
		cuenta.setText("" + cont);
		
		panel1.add(contador);
		panel1.add(cuenta);
		panel1.add(boton);
		
		boton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cont++;
				cuenta.setText("" + cont);
			}
		});
	}

}
