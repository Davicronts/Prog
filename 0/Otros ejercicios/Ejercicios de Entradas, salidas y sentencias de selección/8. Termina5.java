/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TERMINA5.java."

import java.io.*;

public class termina5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double n;
		System.out.println("Introduce un número:");
		n = Double.parseDouble(bufEntrada.readLine());
		if (n<0) {
			n = n*(-1);
			if (n%10==5) {
				System.out.println("Tu número termina en 5");
			} else {
				System.out.println("Tu número no termina en 5");
			}
		} else {
			if (n%10==5) {
				System.out.println("Tu número termina en 5");
			} else {
				System.out.println("Tu número no termina en 5");
			}
		}
	}


}

