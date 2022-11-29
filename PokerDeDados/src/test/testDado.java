package test;

import modelo.Dado;

public class testDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea los dados
		 */
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		Dado d3 = new Dado();
		Dado d4 = new Dado();
		Dado d5 = new Dado();
		
		/*
		 * Tira los dados
		 */
		d1.tirarDado();
		d2.tirarDado();
		d3.tirarDado();
		d4.tirarDado();
		System.out.println(d5.getEnCubilete());
		d5.tirarDado();
		/*
		 * Muestra los dados
		 */
		System.out.println(d1.getCara());
		System.out.println(d2.getCara());
		System.out.println(d3.getCara());
		System.out.println(d4.getCara());
		System.out.println(d5.getCara());
		System.out.println(d5.getEnCubilete());
		System.out.println("------------------");
		
		//Tira los dados devuelta pero no estan en el cubilete
		d1.tirarDado();
		d2.tirarDado();
		d3.tirarDado();
		d4.tirarDado();
		System.out.println(d5.getEnCubilete());
		d5.tirarDado();
		//Muestra los dados pero no cambiaron porque ya fueron tirados
		System.out.println(d1.getCara());
		System.out.println(d2.getCara());
		System.out.println(d3.getCara());
		System.out.println(d4.getCara());
		System.out.println(d5.getCara());
	}

}
