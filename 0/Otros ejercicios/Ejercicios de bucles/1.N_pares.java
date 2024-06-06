/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "N_PARES.java."

import java.io.*;

public class n_pares {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double n;
		System.out.println("Introduce un número:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (n=0; n<=n; ++n) {
			if (n%2==0) {
				System.out.print(n+" ");
			}
		}
	}


}

