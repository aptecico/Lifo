package lifo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("****Ejericio de PILA***");
		Pila pila=new Pila();
		/**
		 * Agregar directamente a ala pila  los valores
		 * */
		
		
		
		
		Scanner sn=new Scanner(System.in);
		boolean salir=false;
		int opcion; //opcion que digita el usuario
		int elemento;
		
		while(!salir) {
			System.out.println("*******Menu de opciones***");
			System.out.println("1. Llenar pila");
			System.out.println("2. Listar pila");
			System.out.println("3. Verificar  pila vacia");
			System.out.println("4. Agregar un elemento a ala Pila");
			System.out.println("5. Editar un elemento a la Pila");
			System.out.println("6. Eliminar toda la Pila");
			System.out.println("7. Mostrar ultimo elemento de la Pila");
			System.out.println("8. salir");
			
			try {
				System.out.println("Escriba una opcion");
				opcion=sn.nextInt();
				switch(opcion) {
					case 1:
						System.out.println("llenando Pila...");
						System.out.println("Ingrese número para llenar la pila");
							elemento=sn.nextInt();
							pila.apilar(elemento);
							//pila.apilar(16);
							//pila.apilar(23);
							//pila.apilar(18);
							//pila.apilar(32);
						System.out.println("La pila se ha llenado");
					break;
					
					case 2:
					System.out.println("**Lista de elementos de la Pila**");
						//listar toda la pila					
						pila.listar();
					break;
					
					case 3:
						if(pila.esVacia()) {
							System.out.println("La Pila esta vacia");
						}else {
							System.out.println("La pila esta llena con "+pila.getTamanio()
							   +" elementos");
						}
					break;
					case 4:
						System.out.println("Ingrese un nuevo valor");
						int valornuevo = sn.nextInt();
						pila.apilar(valornuevo);
					break;
				}
			}catch (InputMismatchException e) {
				System.out.println("Debe ingresar solo numeros");
				sn.next();
			}
		}
	}
}
