/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CUADRADO.java."

import java.io.*;

public class cuadrado {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double n;
		System.out.println("¿De cuánta altura quieres el cuadrado?");
		n = Double.parseDouble(bufEntrada.readLine());
		if (n<=0) {
			System.out.println("¡Tienes que elegir una altura!");
		} else {
			for (a=1; a<=n; ++a) {
				for (b=1; b<=n; ++b) {
					if (a>1 && a<n && b>1 && b<n) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				}
				System.out.println("");
			}
		}
	}


}

