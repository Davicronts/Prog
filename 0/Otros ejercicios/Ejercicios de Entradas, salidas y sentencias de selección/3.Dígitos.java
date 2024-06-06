/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "DIGITOS.java."

import java.io.*;

public class digitos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num;
		System.out.println("Introduce un número:");
		num = bufEntrada.readLine();
		if ((num>=100 && num<=999) || (num>=-999 && num<=-100)) {
			System.out.println("Tu número tiene 3 cifras");
		} else {
			System.out.println("Tu número no tiene 3 cifras");
		}
	}


}

