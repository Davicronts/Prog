/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "MULTIPLO.java."

import java.io.*;

public class multiplo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num1;
		double num2;
		System.out.println("Introduce un n�mero:");
		num1 = bufEntrada.readLine();
		System.out.println("Introduce un segundo n�mero:");
		num2 = bufEntrada.readLine();
		if (num1%num2==0) {
			System.out.println("Tu primer n�mero es m�ltiplo del segundo");
		} else {
			System.out.println("Tu primer n�mero no es m�ltiplo del segundo");
		}
	}


}

