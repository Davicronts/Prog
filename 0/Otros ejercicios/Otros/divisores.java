/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "DIVISORES.java."

import java.io.*;

public class divisores {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int div;
		int num;
		int res;
		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(bufEntrada.readLine());
		div = 1;
		System.out.print("Los divisores propios de "+num+" son: ");
		for (div=1; div<=num-1; ++div) {
			if (num%div==0) {
				res = div+res;
				System.out.print(div+" ");
			}
		}
		System.out.print("y la suma de los mismos es: "+res+".");
		System.out.println("");
	}


}

