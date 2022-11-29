package modelo;

/*	Representa a un jugador del juego. Tiene nombre y monedas para apostar.
*	Todo jugador arranca con la misma cantidad de monedas. 1000.
*/

public class Jugador {
	
	private static int contadorJugador = 0;
	
	private String nombre;
	
	private int numero;
	
	private int monedas;
	
	/*
	 * Variable que guarda los puntos de la ronda para luego comparar al final
	 * y ver quien fue el jugador ganador del pozo.
	 * Al final de la ronda se deben reiniciar los puntos.
	 */
	private int puntos_de_ronda;
	
	//Constructor de jugador
	public Jugador(String nombre) {
		contadorJugador++;
		this.numero = contadorJugador;
		this.monedas = 1000;
		this.puntos_de_ronda = 0;
		//Si se ingresa un nombre vacio o nulo lo cargo por defecto como jugador + el numero de jugador
		if (nombre == null || nombre.equals(""))
			this.nombre = "Jugador " + String.valueOf(numero);
		else
			this.nombre = nombre;
		
	}
	
	/*
	 * Se usa para saber si un jugador es igual a otro, esto lo hace comparando si el
	 * nombre es el mismo.
	 */
	@Override
	public boolean equals(Object objetoComparado) {
		boolean esUnJugador = objetoComparado instanceof Jugador;
		boolean esIgual = false;
		
		if (esUnJugador) {
			Jugador objetoCasteado = (Jugador) objetoComparado;
			esIgual = objetoCasteado.getNombre().equals(this.getNombre());
		}
		return esUnJugador && esIgual;		
	}
	
	/*
	 * --------------------------------------------------------
	 * 							Getters
	 * --------------------------------------------------------
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroJugador() {
		return numero;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public int getPuntos_de_ronda() {
		return this.puntos_de_ronda;
	}
	/*
	 * --------------------------------------------------------
	 * 							Setters
	 * --------------------------------------------------------
	 */
	
	public void sumarPuntos(int puntos) {
		this.puntos_de_ronda += puntos;
	}
	
	public void resetearPuntos() {
		this.puntos_de_ronda = 0;
	}
	
	public void agregarMonedas(int n) {
		this.monedas += n;
	}
	
	/*
	 * Si se le pasa un numero mas grande de monedas de las que tiene, no deja saldo negativo
	 * lo deja en 0.
	 */
	public void restarMonedas(int n) {
		if (n >= this.monedas) {
			this.monedas = 0;
		} else {
			this.monedas -= n;
		}
	}
}
