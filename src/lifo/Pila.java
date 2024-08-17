package lifo;

public class Pila {
	//puntero que indica el inicio de la pila
	//o el fin de la pila
	private Nodo inicio;
	private int tamanio;
	
	public Pila() {
		this.setInicio(null);
		this.setTamanio(0);
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void apilar(int valor) {
		//definir nuevo nodo
		Nodo nuevo = new Nodo();
		//agregar el valor al nodo
		nuevo.setValor(valor);
		//consultar si la pila esta vacia
		if(esVacia()) {
			//Inicializa con el nuevo nodo
			inicio=nuevo;
		}else {
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
		tamanio++;
	}
	
	public boolean esVacia() {
		return inicio==null;
	}
	
	public void listar() {
		//crear una copia de la pila
		Nodo aux=inicio;
		//recorrer la pila 
		while(aux!=null) {
			System.out.println("|\t"+aux.getValor()+"\t|");
			System.out.println("------------");
			aux=aux.getSiguiente();
		}
	}
}
