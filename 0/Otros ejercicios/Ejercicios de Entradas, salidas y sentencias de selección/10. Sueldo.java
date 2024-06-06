/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SUELDO.java."

import java.io.*;

public class sueldo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double aumento;
		double sueldo_nuevo;
		double sueldo_original;
		System.out.println("Ingrese su sueldo:");
		sueldo_original = Double.parseDouble(bufEntrada.readLine());
		if (sueldo_original>=500.000) {
			aumento = (sueldo_original*12)/100;
			sueldo_nuevo = sueldo_original+aumento;
			System.out.println("Tu nuevo sueldo tendrá un aumento de "+aumento+" euros, siendo en total "+sueldo_nuevo+" euros.");
		} else {
			aumento = (sueldo_original*15)/100;
			sueldo_nuevo = sueldo_original+aumento;
			System.out.println("Tu nuevo sueldo tendrá un aumento de "+aumento+" euros, siendo en total "+sueldo_nuevo+" euros.");
		}
	}


}

