package test;

import modelo.Cubilete;

public class testCubilete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cubilete c = new Cubilete();
		
		//Llama a los dados cuando son recien creados
		System.out.println("Llama a los dados cuando son recien creados");
		System.out.println(c.getCaraDado(0));
		System.out.println(c.getCaraDado(1));
		System.out.println(c.getCaraDado(2));
		System.out.println(c.getCaraDado(3));
		System.out.println(c.getCaraDado(4));
		System.out.println(c.getCaraDado(5));
		System.out.println(c.getCaraDado(6));
		System.out.println("----------------------");
		
		//Tira los dados
		System.out.println("Tira los dados y los muestra");
		c.tirarDados();
		System.out.println(c.getCaraDado(1));
		System.out.println(c.getCaraDado(2));
		System.out.println(c.getCaraDado(3));
		System.out.println(c.getCaraDado(4));
		System.out.println(c.getCaraDado(5));
		System.out.println("----------------------");
		
		//Pone el primer dado en el cubilete y trata de tirar todos los dados
		System.out.println("Pone el primer dado en el cubilete y trata de tirar todos los dados");
		c.ponerEnCubilete(1);
		c.tirarDados();
		System.out.println(c.getCaraDado(1));
		System.out.println(c.getCaraDado(2));
		System.out.println(c.getCaraDado(3));
		System.out.println(c.getCaraDado(4));
		System.out.println(c.getCaraDado(5));
		System.out.println("----------------------");
		
		//Pone todos los dados en el cubilete y tira de nuevo
		System.out.println("Pone todos los dados en el cubilete y tira de nuevo");
		c.ponerTodosEnElCubilete();
		c.tirarDados();
		System.out.println(c.getCaraDado(1));
		System.out.println(c.getCaraDado(2));
		System.out.println(c.getCaraDado(3));
		System.out.println(c.getCaraDado(4));
		System.out.println(c.getCaraDado(5));
		System.out.println("----------------------");
		
		//Muestra la cara del dado que se le pide
		System.out.println("Muestra la cara del dado que se le pide");
		System.out.println("Cara del dado 1: " + c.getCaraDado(1));
		System.out.println("Cara del dado 2: " + c.getCaraDado(2));
		System.out.println("Cara del dado 3: " + c.getCaraDado(3));
		System.out.println("Cara del dado 4: " + c.getCaraDado(4));
		System.out.println("Cara del dado 5: " + c.getCaraDado(5));
		System.out.println("----------------------");
		
		//Devuelve todas las caras de los dados
		System.out.println("Arreglo auxiliar con todas las caras");
		int[] aux = c.getTodosLosDados();
		for (int i = 0; i < aux.length; i++) {
			System.out.println(aux[i]);
		}

	}

}
