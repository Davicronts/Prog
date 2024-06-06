/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PALINDROMO.java."

import java.io.*;

public class palindromo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int der;
		boolean es_palindromo;
		boolean falso));
		String frase;
		int izq;
		do {
			System.out.println("Introduzca frase a comprobar:");
			frase = bufEntrada.readLine();
		} while (frase.length()<=1);
		izq = 1;
		der = frase.length();
		es_palindromo = true;
		do {
			while (frase.substring(izq-1, izq).equals(" ")) {
				izq = izq+1;
			}
			while (frase.substring(der-1, der).equals(" ")) {
				der = der-1;
			}
			if (!frase.substring(izq-1, izq).equals(frase.substring(der-1, der))) {
				es_palindromo = false;
			}
			izq = izq+1;
			der = der-1;
		} while (!(izq>=der || es_palindromo==false));
		if (es_palindromo) {
			System.out.println("La frase introducida es un palíndromo");
		} else {
			System.out.println("La frase introducida NO es un palíndromo");
		}
	}


}

