package modelo;

public class Cubilete {
	
	//atributos del cubilete
	private Dado[] dados = new Dado[5];
	
	
	//Constructor del Cubilete
	public Cubilete() {
		for (int i = 0; i < dados.length; i++) {
			dados[i] = new Dado();
		}
	}
	
	/*
	 * --------------------------------------------------------
	 * 					Metodos del cubilete
	 * --------------------------------------------------------
	 */
	
	//Tira los dados que estan en el cubilete
	public void tirarDados() {
		for (Dado d : dados)
			d.tirarDado();
	}
	
	// Recibe un dado y lo pone en el cubilete
	public void ponerEnCubilete(int dado) {
		if (dado > 0 && dado <= dados.length) {
			dados[dado - 1].setEnCubilete();
		}
	}
	
	// Pone todos los dados en el cubilete
	public void ponerTodosEnElCubilete() {
		for (Dado d : dados)
			d.setEnCubilete();
	}
	
	//Muestra el dado que se le pide
	public int getCaraDado(int dado) {
		if (dado > 0 && dado <= dados.length) {
			return dados[dado - 1].getCara();
		} else
			return -1;
	}
	
	//Devuelve todos los dados con su cara actual, en un arreglo
	public int[] getTodosLosDados() {
		int[] caras = new int[dados.length];
		int i = 0;
		for (Dado d : dados) {
			caras[i] = d.getCara();
			i++;
		}
		return caras;
	}

}
