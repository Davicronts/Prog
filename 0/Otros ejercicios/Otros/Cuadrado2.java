/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CUADRADO.java."

import java.io.*;

public class cuadrado {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double columna;
		double fila;
		System.out.print("¿De cuánta altura quieres el cuadrado?");
		altura = Double.parseDouble(bufEntrada.readLine());
		for (fila=1; fila<=altura; ++fila) {
			for (columna=1; columna<=altura; ++columna) {
				if (fila==1 || fila==altura || columna==1 || columna==altura) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}


}

