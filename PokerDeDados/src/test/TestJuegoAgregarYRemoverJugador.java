package test;


import modelo.Juego;

public class TestJuegoAgregarYRemoverJugador {

	public static void main(String[] args) {
		Juego juego = new Juego();
		
		System.out.println(juego.getEstado());
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getListaDeJugadores());
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
		juego.agregarJugador("3");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("5");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.agregarJugador("6");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		System.out.println(juego.getNombreDeJugadores());
		System.out.println("----------------------------");
		System.out.println(juego.getEstado());
		System.out.println("----------------------------");
		juego.removerJugador("3");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.removerJugador("5");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.removerJugador("1");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.removerJugador("2");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.removerJugador("4");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		juego.removerJugador("1");
		System.out.println(juego.getNombreDeJugadores());
		System.out.println(juego.getEstado());
		System.out.println(juego.getNombreDeJugadores());
	}

}
