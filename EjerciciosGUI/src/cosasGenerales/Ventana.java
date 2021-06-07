package cosasGenerales;

import java.awt.Frame;

public class Ventana extends Frame{

	public Ventana(String titulo, int ancho, int largo, int x, int y) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.setLocation(x,y);
		this.addWindowListener(new CierreVentana());
		this.setVisible(true);
	}
	
	public Ventana(String titulo, int ancho, int largo) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.addWindowListener(new CierreVentana());
		this.setVisible(true);
	}
	
	public Ventana(int ancho, int largo) {
		this.setTitle("Presupuesto");
		this.setSize(ancho, largo);
		this.addWindowListener(new CierreVentana());
		this.setVisible(true);
	}
	
	public Ventana(String titulo) {
		this(titulo, 400, 400);
	}
	
	public Ventana() {
		this("Ejercicio");
	}
	
}
