package vista;

import java.util.ArrayList;

public interface IVistaDeJuego {
	
	void iniciar();
	
	void actualizarListaDeJugadores(ArrayList<String> jugadores);
	
	void notificarJugadorAgregado();
	
	void notificarJugadorEliminado();
	
	void jugadorExistente();
	
	void maximoDeJugadores();
	
	void iniciarJuego();
	
	void juegoIniciado();
	
	void faltanJugadores();
	
	
}
