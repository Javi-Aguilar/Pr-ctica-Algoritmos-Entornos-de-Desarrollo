public class Algoritmos {
	
	/**
	 * Constructor para crear un Algoritmo sin parametros
	 */
	public Algoritmos() {
			
	}
	
	/**
	 * Calcula el numero de fibonacci de un numero entero positivo
	 * 
	 * @param n, numero introducido sobre el que se calcula el fibonacci.
	 * @return fibonacci del numero
	 * @throws IlegalArgumentExeption Si el numero es negativo
	 */
	public static int fibonacci(int n) {
        if (n < 0) {
        	throw new IllegalArgumentException("El numero no puede ser inferior a 0");
        }
        
        if (n <= 1) {
        	return n;
        }

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
	
	
}
