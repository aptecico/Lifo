package lifo;

public class Nodo {
	//variable guarda el valor del elemento de la pila
	private int valor;
	//variable para enlazar los nodos
	private Nodo siguiente;
	
	public Nodo() {
		this.setValor(0);
		this.setSiguiente(null);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
