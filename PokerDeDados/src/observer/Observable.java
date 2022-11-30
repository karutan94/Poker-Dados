package observer;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Observable {
	
	protected Collection<Observador> observadores;
	
	//Constructor
	public Observable() {
		this.observadores = new ArrayList<Observador>();
	}
	
	public void agregarObservador(Observador nuevoObservador) {
		this.observadores.add(nuevoObservador);
	}
	
	public void notificar(Object evento) {
		for (Observador observador : observadores) {
			observador.actualizar(this, evento);
		}
	}
}
