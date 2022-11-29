package modelo;

import java.util.Random;

public class Dado {
	
	//atributos del dado
	private int cara;
	private boolean enCubilete;
	private Random rnd;
	
	//Constructor del Dado
	public Dado() {
		rnd = new Random();
		this.cara = 0;
		this.enCubilete = true;
	}
	
	/*
	 * --------------------------------------------------------
	 * 						Metodos del dado
	 * --------------------------------------------------------
	 */
	
	//Tira el dado, si se encuentra en el cubilete
	public void tirarDado() {
		if (enCubilete) {
			this.cara = rnd.nextInt(6) + 1;
			//Una vez que tira el dado, lo saca del cubilete
			this.enCubilete = false;
		}
	}
	
	/*
	 * --------------------------------------------------------
	 * 							Getters
	 * --------------------------------------------------------
	 */
	
	//Devuelve el valor del dado
	public int getCara() {
		return this.cara;
	}
	
	//Devuelve si el dado esta en el cubilete o no
	public boolean getEnCubilete() {
		return this.enCubilete;
	}
	
	/*
	 * --------------------------------------------------------
	 * 							Setters
	 * --------------------------------------------------------
	 */
	//Pone el dado en el cubilete
	public void setEnCubilete() {
		this.enCubilete = true;
	}
	
}