/**
 * 
 */
package clases;

/**
 * Clase que contiene dos metodos que comprueban el valor maximo entre dos o tres enteros.
 */
public class Maximos {

	/**
	 * Metodo maximoDe2EnterosPositivos
	 * realiza una comprobacion entre dos numeros enteros devolviendo el mayor de ellos.
	 * @param a numero entero para comparar.
	 * @param b numero entero para comparar.
	 * @return deuelve el numero mayor de los parametros.
	 */
	public static int maximoDe2EnterosPositivos(int a, int b) {
		int resultado = 0;
	    if (a <= 0 || b <= 0) {
	        throw new IllegalArgumentException("Los números deben ser positivos");
	    }
	    if (a > b) {
	         resultado = a;
	    } else {
	    	 resultado = b;
	    }
	    return resultado;
	}
	/**
	 * Metodo maximoDe3EnterosPositivos
	 * realiza una comprobacion entre tres numeros enteros devolviendo el mayor de ellos.
	 * @param a numero entero para comparar.
	 * @param b numero entero para comparar.
	 * @param c numero entero para comparar.
	 * @return deuelve el numero mayor de los parametros.
	 */
	public static int maximoDe3EnterosPositivos(int a, int b, int c) {
		int resultado = 0;
	    if (a <= 0 || b <= 0 || c <= 0) {
	        throw new IllegalArgumentException("Los números deben ser positivos");
	    }
	    if (a >= b && a >= c) {
	        resultado = a;
	    } else if (b >= a && b >= c) {
	        resultado = b;
	    } else {
	        resultado = c;
	    }
	    return resultado;
	}
}