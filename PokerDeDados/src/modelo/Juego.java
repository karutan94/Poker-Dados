package modelo;

import java.util.ArrayList;

import observer.Observable;
import observer.Observador;

public class Juego extends Observable implements IJuego {

	/*
	 * --------------------------------------------------------
	 * 						Variables
	 * --------------------------------------------------------
	*/
	
	//Arreglo que contiene a los jugadores
	private ArrayList<Jugador> jugadores;
	
	//Jugador actual en turno
	private int jugadorEnTurno;
	
	//Estado actual del juego
	private EstadoJuego estado;
	
	//Cubilete del juego
	private Cubilete cubilete;
	
	//Variable para contar cuantas veces lanzo los dados
	private int cantidadLanzamientos = 0;
	
	//Variable para controlar la cantidad de rondas que van de juego
	private int cantidadRondas = 0;
	
	/*
	 * --------------------------------------------------------
	 * 						Constructor de Juego
	 * --------------------------------------------------------
	*/
	public Juego() {
		this.jugadores = new ArrayList<Jugador>();
		this.cubilete = new Cubilete();
		this.estado = EstadoJuego.ESPERANDO_JUGADORES;
	}
	
	
	/*
	 * --------------------------------------------------------
	 * 						Metodos del juego
	 * --------------------------------------------------------
	*/
	
	/*
	 * Agregar jugador.
	 * 
	 * Si el juego esta en estado esperando jugadores
	 * y no hay mas de 5 jugadores, lo agrega.
	 * Elegi que se juegue como maximo de 5 jugadores, por cuestiones de que sino 
	 * se alarga demasiado la ronda.
	 */
	@Override
	public void agregarJugador(String nombre) {
		if (jugadores.size()<5) {
			//Creo un nuevo jugador
			Jugador nuevoJugador = new Jugador(nombre);
			/*
			 * Verifico que no haya otro jugador con el mismo nombre,
			 * no se permiten nombres repetidos ya que con el nombre se identifica
			 * univocamente a cada jugador en el juego.
			 */
			if (!this.jugadores.contains(nuevoJugador)) {
				jugadores.add(nuevoJugador);
				//Notifico que cambio la lista de jugadores
				this.notificar(Evento.JUGADOR_AGREGADO);
			} else {
				this.notificar(Evento.JUGADOR_YA_EXISTE);
			}
			
		} else {
			/*
			 * Si no lo agrega es porque se tiene el maximo de jugadores ya.
			 * Notifica que se tiene el maximo de jugadores.
			 */
			this.notificar(Evento.MAXIMO_DE_JUGADORES);
		}
		
		//Si hay 2 o mas jugadores cambio el estado de juego a LISTO_PARA_INICIAR
		if ((this.jugadores.size() >= 2) && (!this.estado.equals(EstadoJuego.LISTO_PARA_INICIAR))) {
			this.setEstado(EstadoJuego.LISTO_PARA_INICIAR);
			this.notificar(Evento.LISTO_PARA_INICIAR);
		}
	}
	
	/*
	 * Remover jugador.
	 * 
	 * Se le pasa el nombre del jugador a remover.
	 */
	public void removerJugador(String nombre) {
		for (Jugador j : jugadores) {
			if (j.getNombre().equals(nombre)) {
				jugadores.remove(j);
				this.notificar(Evento.JUGADOR_ELIMINADO);
				if (jugadores.size() < 2) {
					this.setEstado(EstadoJuego.ESPERANDO_JUGADORES);
				}
				break;
			}
			
		}
	}
	
	/*
	 * Inicia el juego. 
	 * Si el juego esta en estado = LISTO_PARA_INICIAR
	 */
	public void iniciar() {
		if (this.estado.equals(EstadoJuego.LISTO_PARA_INICIAR)) {
			this.setEstado(EstadoJuego.JUGANDO);
			this.notificar(Evento.JUEGO_INICIADO);
			this.jugadorEnTurno = 0;
			this.cantidadRondas = 0;
			
		} else {
			this.notificar(Evento.FALTAN_JUGADORES);
			
		}
	}
	
	/*
	 * Reinicia el juego.
	 * reiniciarCompleto sirve para indicar si reinicia el juego completo junto con sus jugadores
	 * o si solo inicia una nueva partida con los mismos jugadores.
	 */
	public void reiniciarJuego(boolean reiniciarCompleto) {
		if (reiniciarCompleto) {
			this.setEstado(EstadoJuego.ESPERANDO_JUGADORES);
			this.jugadores = new ArrayList<Jugador>();
		} else {
			this.setEstado(EstadoJuego.LISTO_PARA_INICIAR);
		}
	}
	
	/*
	 * Pone un dado en el cubilete
	 */
	public void ponerEnCubilete(int dado) {
		cubilete.ponerEnCubilete(dado);
	}
	
	/*
	 * Pone todos los dados en el cubilete
	 */
	public void ponerTodoEnCubilete() {
		cubilete.ponerTodosEnElCubilete();
	}
	
	/*
	 * Le pide al cubilete que tire los dados que tenga adentro.
	 */
	public void tirarCubilete() {
		cubilete.tirarDados();
		cubilete.getTodosLosDados();
		this.notificar(Evento.CAMBIO_DADOS);
	}
	
	
	/*
	 * --------------------------------------------------------
	 * 						Getters
	 * --------------------------------------------------------
	*/
	
	@Override
	public EstadoJuego getEstado() {
		return this.estado;
	}
	
	/*
	 * Devuelve los jugadores en un arreglo con todo su contenido
	 * Nombre, Numero, Monedas
	 */
	@Override
	public ArrayList<Jugador> getListaDeJugadores() {
		return this.jugadores;
	}

	/*
	 * Devuelve una arreglo con los nombres de los jugadores
	 */
	@Override
	public ArrayList<String> getNombreDeJugadores() {
		ArrayList<String> nombres = new ArrayList<String>();
		for (Jugador j : jugadores) {
			nombres.add(j.getNombre());
		}
		return nombres;
	}
	
	/*
	 * Devuelve la cantidad de monedas de un jugador.
	 */
	public int getMonedas(String nombre) {
		for (Jugador j : jugadores) {
			if (j.getNombre().equals(nombre)) {
				return j.getMonedas();
			}
		}
		return -1;
	}
	
	/*
	 * Devuelve todos los dados con su actual cara.
	 * No importa si estan o no en el cubilete, devuelve el valor de los dados tirados.
	 */
	public int[] getDados() {
		return cubilete.getTodosLosDados();
	}
	
	/*
	 * Devuelve la cara actual de un dado pasado como parametro.
	 */
	public int getCaraDado(int numeroDado) {
		return cubilete.getCaraDado(numeroDado);
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Setters
	 * --------------------------------------------------------
	*/
	
	@Override
	public void setEstado(EstadoJuego nuevoEstado) {
		this.estado = nuevoEstado;
	}
		
	/*
	 * --------------------------------------------------------
	 * 					Reglas del juego
	 * --------------------------------------------------------
	*/
	public void pokerReal() {
		boolean flag = true;
		int[] dados = cubilete.getTodosLosDados();		
		int i = 0;
		while ((i <= dados.length) && (flag)) {
			
		}
	}
	
	public void pokerCuadruple() {
		
	}
	
	public void full() {
		
	}
	
	public void escaleraMayor() {
		
	}
	
	public void escaleraMenor() {
		
	}
	
	public void pierna() {
		
	}
	
	public void paresDobles() {
		
	}
	
	public void pares() {
		
	}
}
