package test;
import modelo.Juego;

public class TestJuegoIniciar {

	public static void main(String[] args) {
Juego juego = new Juego();
		
		System.out.println(juego.getEstado());
		System.out.println("----------------------------");
		juego.agregarJugador("1");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("2");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("3");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("4");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("5");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		System.out.println("----------------------------");
		System.out.println(juego.getEstado());
		System.out.println("----------------------------");
		
	}

}
