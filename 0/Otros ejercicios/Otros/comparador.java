/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "COMPARAR_NUMEROS.java."

import java.io.*;

public class comparar_numeros {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double numero1;
		double numero2;
		numero1 = 5;
		System.out.println("Introduce un n�mero:");
		numero2 = bufEntrada.readLine();
		if (numero2>numero1) {
			System.out.println("Tu n�mero es mayor que "+numero1);
		} else {
			if (numero2==numero1) {
				System.out.println("�Has acertado mi n�mero!");
			} else {
				System.out.println("Tu n�mero es menor que "+numero1);
			}
		}
	}


}

