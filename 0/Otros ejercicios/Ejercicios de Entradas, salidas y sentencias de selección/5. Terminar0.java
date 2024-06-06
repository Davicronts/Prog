/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TERMINAR0.java."

import java.io.*;

public class terminar0 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num1;
		System.out.println("Introduce un número:");
		num1 = bufEntrada.readLine();
		if (num1%10==0) {
			System.out.println("Tu número termina en 0");
		} else {
			System.out.println("Tu número no termina en 0");
		}
	}


}

