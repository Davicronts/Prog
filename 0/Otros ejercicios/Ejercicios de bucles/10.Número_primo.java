/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMERO_PRIMO.java."

import java.io.*;

public class numero_primo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double i;
		double n;
		System.out.println("Introduce un número");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1; i<=n; ++i) {
			if (n%i==0) {
				c = c+1;
			}
		}
		if (c==2) {
			System.out.println("El número "+n+" es un número primo.");
		} else {
			System.out.println("El número "+n+" no es un número primo.");
		}
	}


}

