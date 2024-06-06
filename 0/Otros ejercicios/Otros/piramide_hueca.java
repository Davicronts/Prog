/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PIRAMIDE_HUECA.java."

import java.io.*;

public class piramide_hueca {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double asterisco;
		double espacio;
		double i;
		System.out.print("Introduce la altura de la pirámie: ");
		altura = Double.parseDouble(bufEntrada.readLine());
		for (i=1; i<=altura; ++i) {
			for (espacio=1; espacio<=altura-i; ++espacio) {
				System.out.print("  ");
			}
			for (asterisco=1; asterisco<=2*i-1; ++asterisco) {
				if (i==1 || i==altura || asterisco==1 || asterisco==2*i-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}


}

