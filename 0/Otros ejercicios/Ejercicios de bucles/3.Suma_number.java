/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SUMA_NUMBER.java."

import java.io.*;

public class suma_number {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double num;
		double res;
		System.out.println("¿Cuántos números quieres sumar?");
		num = Double.parseDouble(bufEntrada.readLine());
		res = 0;
		for (i=1; i<=num; ++i) {
			res = res+i;
		}
		System.out.println("La suma de todos los números hasta "+num+" es: "+res+".");
	}


}

