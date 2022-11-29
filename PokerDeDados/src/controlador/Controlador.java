package controlador;

import java.util.Collection;
import java.util.ArrayList;

import modelo.Evento;
import modelo.IJuego;
import modelo.Juego;
import observer.Observable;
import observer.Observador;
import vista.IVistaDeJuego;


public class Controlador implements Observador{

	//Coleecion de vistas asociadas al controlador
	private Collection<IVistaDeJuego> vistas;
	
	private IJuego juego;
	
	/*
	 * --------------------------------------------------------
	 * 					Constructor del controlador
	 * --------------------------------------------------------
	*/
	public Controlador(Juego modelo) {
		this.juego = modelo;
		juego.agregarObservador(this);
		this.vistas = new ArrayList<IVistaDeJuego>();
	}
	
	//Agrega una vista al controlador
	public void registrarVista(IVistaDeJuego nuevaVista) {
		this.vistas.add(nuevaVista);
	}
	
	//Agregar jugador
	public void agregarJugador(String nombre) {
		this.juego.agregarJugador(nombre);
	}
	
	//Eliminar jugador
	public void eliminarJugador(String nombre) {
		this.juego.removerJugador(nombre);
	}
	
	//Listar jugadores
	public ArrayList<String> listarJugadores() {
		return juego.getNombreDeJugadores();
	}
	
	/*
	 * Metodo actualizar, que en base a los cambios ocurridos en el modelo, avisa a las vistas.
	 */
	@Override
	public void actualizar(Observable objetoQueCambio, Object eventoNuevo) {
		Evento evento = (Evento) eventoNuevo;
		if (evento instanceof Evento) {
			switch((Evento) evento) {
			case CAMBIO_LISTA_DE_JUGADORES:
				for (IVistaDeJuego vista: this.vistas) {
					vista.actualizarListaDeJugadores(this.listarJugadores());
				}
				break;
			case JUGADOR_AGREGADO:
				for (IVistaDeJuego vista: this.vistas) {
					vista.notificarJugadorAgregado();
				}
				break;
			case JUGADOR_ELIMINADO:
				for (IVistaDeJuego vista: this.vistas) {
					vista.notificarJugadorEliminado();
				}
				break;
			case JUGADOR_YA_EXISTE:
				for (IVistaDeJuego vista: this.vistas) {
					vista.jugadorExistente();
				}
				break;
			case FALTAN_JUGADORES:
				break;
			case MAXIMO_DE_JUGADORES:
				for (IVistaDeJuego vista: this.vistas) {
					vista.maximoDeJugadores();
				}
				break;
			case LISTO_PARA_INICIAR:
				break;
			case JUEGO_INICIADO:
				break;
			case CAMBIO_TURNO:
				break;
			case CAMBIO_DADOS:
				break;
			case FINALIZO:
				break;
			}
		}
	}



}
