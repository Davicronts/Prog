/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULADOR_FACTORIAL.java."

import java.io.*;

public class calculador_factorial {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double c;
		double f;
		double num;
		System.out.println("Introduce un número");
		num = Double.parseDouble(bufEntrada.readLine());
		f = 1;
		for (c=1; c<=num; ++c) {
			f = f*c;
		}
		System.out.println("El factorial del número ingresado es: "+f);
	}


}

