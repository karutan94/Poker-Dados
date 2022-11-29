package test;

import modelo.Jugador;

public class testJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo jugadores
		Jugador j1 = new Jugador("");
		Jugador j2 = new Jugador("Pedro");
		Jugador j3 = new Jugador("Carmen");
		Jugador j4 = new Jugador("");
		Jugador j5 = new Jugador("");
		
		//Obtengo sus datos
		System.out.println("Nombre: " + j1.getNombre());
		System.out.println("Numero: " + j1.getNumeroJugador());
		System.out.println("Monedas: " + j1.getMonedas());
		System.out.println("Puntos: " + j1.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		System.out.println("Nombre: " + j2.getNombre());
		System.out.println("Numero: " + j2.getNumeroJugador());
		System.out.println("Monedas: " + j2.getMonedas());
		System.out.println("Puntos: " + j2.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		System.out.println("Nombre: " + j3.getNombre());
		System.out.println("Numero: " + j3.getNumeroJugador());
		System.out.println("Monedas: " + j3.getMonedas());
		System.out.println("Puntos: " + j3.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		System.out.println("Nombre: " + j4.getNombre());
		System.out.println("Numero: " + j4.getNumeroJugador());
		System.out.println("Monedas: " + j4.getMonedas());
		System.out.println("Puntos: " + j4.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		System.out.println("Nombre: " + j5.getNombre());
		System.out.println("Numero: " + j5.getNumeroJugador());
		System.out.println("Monedas: " + j5.getMonedas());
		System.out.println("Puntos: " + j5.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		
		//Sumar y restar monedas
		j1.agregarMonedas(100);
		j2.restarMonedas(1500);
		System.out.println("Nombre: " + j1.getNombre());
		System.out.println("Numero: " + j1.getNumeroJugador());
		System.out.println("Monedas: " + j1.getMonedas());
		System.out.println("Puntos: " + j1.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
		System.out.println("Nombre: " + j2.getNombre());
		System.out.println("Numero: " + j2.getNumeroJugador());
		System.out.println("Monedas: " + j2.getMonedas());
		System.out.println("Puntos: " + j2.getPuntos_de_ronda());
		System.out.println("-------------------------------------------");
	}

}
