/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "RECTANGULOSOLIDO.java."

import java.io.*;

public class rectangulosolido {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double ancho;
		double columna;
		double fila;
		System.out.println("Ingresa el ancho del rect�ngulo:");
		ancho = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa la altura del rect�ngulo:");
		altura = Double.parseDouble(bufEntrada.readLine());
		for (fila=1; fila<=altura; ++fila) {
			for (columna=1; columna<=ancho; ++columna) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}


}

