package unico;

public class Ejercicio16 {

	public static void main(String[] args) {

		/*
		 * Implementa un método que permita la conversión de números binarios
		 * introducidos por consola a decimal. Ejemplo de conversión de binario (base 2)
		 * a decimal (base 10): 01102 = 0*23+1*22+1*21+0*20 = 610
		 */

		int numero;
		int numeroBinario;

		do {
			numero = Util.leerInt("Introduzca un nómero entero positivo: ");
		} while (numero < 0);
		
		numeroBinario = numBinario(numero);
		Util.escribir("El número " + numero + " es igual a " + numeroBinario + " en binario.");
	}

	public static int numBinario(int numero) {
		final int BASE = 10;
		int binario = 0;
		int exp = 0;
		int digitoBinario;
		
        while(numero>0){
        	digitoBinario = numero % 2;
        	binario = (digitoBinario*(int)Math.pow(BASE, exp)) + binario;
            exp ++;
        	numero = numero/2; }
		return binario;
	}
}
