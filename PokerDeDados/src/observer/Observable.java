package observer;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Observable {
	
	protected Collection<Observador> observadores;
	
	//Constructor
	public Observable() {
		this.observadores = new ArrayList<Observador>();
	}
	
	public abstract void notificar(Object evento);
	/*
	 * {
		this.observadores.add(nuevoObservador);
	}
	 */
	
	public abstract void agregarObservador(Observador nuevoObservador);
	/*
	 * {
		for (Observador observador : observadores) {
			observador.actualizar(this, evento);
		}
	}
	 */
}
