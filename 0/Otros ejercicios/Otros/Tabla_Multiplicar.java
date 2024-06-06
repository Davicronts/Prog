/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TABLA_MULTIPLICAR.java."

import java.io.*;

public class tabla_multiplicar {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double mul;
		System.out.println("Dime de qué número quieres la tabla de multiplicar");
		mul = bufEntrada.readLine();
		for (i=0; i<=10; ++i) {
			System.out.println(mul+" * "+i+" = "+mul*i);
		}
	}


}

