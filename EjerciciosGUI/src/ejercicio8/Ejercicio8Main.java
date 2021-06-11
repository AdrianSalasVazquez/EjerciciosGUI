package ejercicio8;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import cosasGenerales.Ventana;

public class Ejercicio8Main {

	public static void main(String[] args) {
		
		Ventana ejercicio8 = new Ventana("Ejercicio 8",570,250);
		
		Panel panelBlock = new Panel(new BorderLayout());
		ejercicio8.add(panelBlock);
		
		Panel panelMenu = new Panel();
		Button guardar = new Button("Guardar");
		panelMenu.add(guardar);
		panelBlock.add(panelMenu, BorderLayout.NORTH);
		
		Panel panelNotas = new Panel();
		TextArea notas = new TextArea();
		panelNotas.add(notas);
		panelBlock.add(panelNotas);
		
		guardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog save = new FileDialog(ejercicio8, "guardar archivo", FileDialog.SAVE);
				save.setVisible(true);
				
				String rutaArchivo = save.getDirectory() + save.getFile();
				
				File guardado = new File(rutaArchivo);
				
				guardado.getParentFile().mkdirs();
				try {
					FileWriter fw = new FileWriter(guardado);
					PrintWriter pw = new PrintWriter(fw);

					pw.println(notas.getText());
					
					fw.close();
				} catch (IOException a) {
					a.getStackTrace();
				}
				
			}
		});
	}

}
