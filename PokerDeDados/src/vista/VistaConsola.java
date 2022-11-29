package vista;

import java.util.ArrayList;
import java.util.Scanner;

import controlador.Controlador;

public class VistaConsola implements IVistaDeJuego {

	private Scanner teclado;
	
	private Controlador controlador;
	
	//Constructor
	public VistaConsola(Controlador controlador) {
		teclado = new Scanner(System.in);
		this.controlador = controlador;
		//Le pide al controlador que registre esta vista
		this.controlador.registrarVista(this);
	}
	
	//Metodo para inicar la vista de consola
	public void iniciar() {
		this.menuPrincipal();
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Menu principal
	 * --------------------------------------------------------
	*/
	public void menuPrincipal() {
		
		int opcion = 99;

		while (opcion != 0) {
			System.out.println("╔═════════════════════════════════╗");
			System.out.println("║   --------Poker Dados--------   ║");
			System.out.println("║   ----------------------------  ║");
			System.out.println("║   -------MENU PRINCIPAL-------  ║");
			System.out.println("║   ----------------------------  ║");
			System.out.println("║   1- Agregar Jugador            ║");
			System.out.println("║   2- Eliminar Jugador           ║");
			System.out.println("║   3- Ver lista de jugadores     ║");
			System.out.println("║   4- Iniciar juego              ║");
			System.out.println("║                                 ║");
			System.out.println("║   0- Salir                      ║");
			System.out.println("╚═════════════════════════════════╝");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				menuAltaJugador();
				break;
			case 2:
				menuEliminarJugador();
				break;
			case 3:
				mostrarNombreJugadores();
				break;
			case 4:
				
				break;
			case 0:
                System.exit(0);                         
                break;
			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
		}
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Alta de jugador
	 * --------------------------------------------------------
	*/
	public void menuAltaJugador() {
		System.out.println("No se pueden repetir los nombres de jugadores");
		System.out.println("");
		System.out.println("Ingrese el nombre del Jugador: ");
		String nombre = teclado.next();
		teclado.nextLine();
		controlador.agregarJugador(nombre);
	}
	
	public void notificarJugadorAgregado() {
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("║         Jugador agregado        ║");
		System.out.println("╚═════════════════════════════════╝");
	}
	
	public void notificarJugadorEliminado() {
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("║         Jugador eliminado       ║");
		System.out.println("╚═════════════════════════════════╝");
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Eliminar de jugador
	 * --------------------------------------------------------
	*/
	public void menuEliminarJugador() {
		System.out.println("Ingrese el nombre del Jugador a eliminar: ");
		String nombre = teclado.next();
		teclado.nextLine();
		controlador.eliminarJugador(nombre);
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Listar jugadores
	 * --------------------------------------------------------
	*/
	public void mostrarNombreJugadores() {
		ArrayList<String> listaNombres = controlador.listarJugadores();
		int i = 1;
		System.out.println("N°  Nombre");
		System.out.println("");
		for (String l : listaNombres) {
			System.out.println(i + "   " + l);
			i++;
		}
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Menu juego
	 * --------------------------------------------------------
	*/
	
	
	/*
	 * Cuando se producen cambios en la lista de jugadores,
	 * muestra en pantalla la nueva lista.
	 */
	public void actualizarListaDeJugadores(ArrayList<String> jugadores) {
		System.out.println("Jugadores:");
		for (String jugador : jugadores) {
			System.out.println(jugador);
		}
	}
	
	//Mensaje de jugador existente
	public void jugadorExistente() {
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("║        Jugador no cargado       ║");
		System.out.println("║         Nombre repetido         ║");
		System.out.println("╚═════════════════════════════════╝");
	}
	
	//Mensaje de que se alcanzo el maximo de jugadores
	public void maximoDeJugadores() {
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("║        Jugador no cargado       ║");
		System.out.println("║Se alcanzo el limite de jugadores║");
		System.out.println("╚═════════════════════════════════╝");
	}
	
}
