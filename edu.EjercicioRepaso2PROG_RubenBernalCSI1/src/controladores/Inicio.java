/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * @author rbr - 081024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 081024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero = 24;
		
		//Sumo 10 al valor de la variable
		System.out.println("El resultado de sumar 10 al valor de la variable es: " + (numero + 10));
		//Resto 5 al valor de la variable
		System.out.println("El resultado de restar 5 al valor de la variable es: " + (numero - 5));
		//Multiplico por 3 el valor de la variable
		System.out.println("El resultado de multiplicar por 3 el valor de la variable es: " + (numero * 3));
		//Divido entre 2 el valor de la variable
		System.out.println("El resultado de dividir entre 2 el valor de la variable es: " + (numero / 2));

	}

}
