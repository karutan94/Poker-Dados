package modelo;

import java.util.ArrayList;

import observer.Observador;

public interface IJuego {

	void agregarJugador(String nombre);
	
	void removerJugador(String nombre);
	
	ArrayList<Jugador> getListaDeJugadores();
	
	ArrayList<String> getNombreDeJugadores();
	
	void iniciar();
	
	//void atenderTurnoJugadorActual();
	
	//getJugadorEnTurno();
	
	//cambiarTurnoDeJugador();
	
	void reiniciarJuego(boolean reiniciarCompleto);
	
	void ponerEnCubilete(int dado);
	
	void ponerTodoEnCubilete();
	
	void tirarCubilete();
	
	int[] getDados();
	
	int getCaraDado(int numeroDado);
	
	EstadoJuego getEstado();
	
	void setEstado(EstadoJuego nuevoEstado);
	
	int getMonedas(String nombre);
	
	public void agregarObservador(Observador nuevoObservador);
	
	public void notificar(Object evento);
	
}
