/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PIRAMIDE.java."

import java.io.*;

public class piramide {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int altura;
		double espacios;
		double estrellas;
		double fila;
		System.out.print("¿De cuántos pisos quieres la piramide?");
		altura = Integer.parseInt(bufEntrada.readLine());
		for (fila=1; fila<=altura; ++fila) {
			for (espacios=1; espacios<=altura-fila; ++espacios) {
				System.out.print(" ");
			}
			for (estrellas=1; estrellas<=2*fila-1; ++estrellas) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}


}

