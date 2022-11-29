package pokerApp;

import controlador.Controlador;
import modelo.Juego;
import vista.VistaConsola;

public class IniciarApp {

	public static void main(String[] args) {
		Juego modelo = new Juego();
		Controlador controlador = new Controlador(modelo);
		VistaConsola vista = new VistaConsola(controlador);
		vista.iniciar();
		
	}

}
