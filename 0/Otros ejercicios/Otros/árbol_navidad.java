/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ARBOL_NAVIDAD.java."

import java.io.*;

public class arbol_navidad {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double espacio;
		double i;
		double n;
		System.out.println("¿de qué altura quieres la pirámide?");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1; i<=n; ++i) {
			for (espacio=1; espacio<=n-i; ++espacio) {
				System.out.print("  ");
			}
			for (a=1; a<=2*i-1; ++a) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		for (i=n+1; i<=n+1; ++i) {
			for (espacio=1; espacio<=n-1; ++espacio) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
	}


}

