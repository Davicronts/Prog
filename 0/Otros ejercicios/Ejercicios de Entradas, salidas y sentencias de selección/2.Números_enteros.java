/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMEROS_ENTEROS.java."

import java.io.*;

public class numeros_enteros {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double n;
		System.out.println("Introduce un número positivo o negativo:");
		n = bufEntrada.readLine();
		if (n==0) {
			System.out.println("Tu número no es ni positivo ni negativo");
		} else {
			if (n>0) {
				System.out.println("Tu número es positivo");
			} else {
				if (n<0) {
					System.out.println("Tu número es negativo");
				} else {
					System.out.println("No he entendido tu número");
				}
			}
		}
	}


}

