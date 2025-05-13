package CLASES;
public class Principal extends Algoritmos {

	public static void main(String[] args) {
		
		Algoritmos nuevo = new Algoritmos() {};
        
		// Creamos array
        int numeros[] = new int[3];
        

        //Damos valores aleatorios.
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*(10 - 2 + 1)+2);
        }
               
        /*
        Calcula mediante un bucle el número de fibonacci de los 3 números del array y 
        almacena el resultado en otro array llamado “resultadoFibonacci”.
        */
        
        int resultadoFibonacci[]= new int [3];
        
        for(int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = nuevo.fibonacci(numeros[i]);
        }
        
        /*Calcula mediante un bucle el factorial de los 3 números del 
         * array y almacena el resultado en otro array llamado “resultadoFactorial”.*/
        
        int resultadoFactorial[] = new int [3];
        
        for(int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = nuevo.factorial(numeros[i]);
        }
        
        /*Comprueba mediante un bucle si los 3 números del array son primos o no y almacena 
         * el resultado en otro array llamado “resultadoPrimos”.*/
        
        boolean resultadoPrimos[]= new boolean [3];
        
        for(int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = nuevo.primo(numeros[i]);
        }
        
	}

}
