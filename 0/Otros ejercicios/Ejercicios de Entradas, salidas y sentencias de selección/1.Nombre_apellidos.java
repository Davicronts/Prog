/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NOMBRE_APELLIDOS.java."

import java.io.*;

public class nombre_apellidos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String a1;
		String a2;
		String genero;
		String n;
		System.out.println("Introduce tu nombre:");
		n = bufEntrada.readLine();
		System.out.println("Introduce tu primer apellido:");
		a1 = bufEntrada.readLine();
		System.out.println("Introduce tu segundo apellido:");
		a2 = bufEntrada.readLine();
		System.out.println("Introduce tu género (H/M):");
		genero = bufEntrada.readLine();
		if (genero.equals("H")) {
			System.out.println("Bienvenido, Sr. "+n+" "+a1+" "+a2);
		} else {
			if (genero.equals("M")) {
				System.out.println("Bienvenida, Sra. "+n+" "+a1+" "+a2);
			} else {
				System.out.println("No he entendido su género");
			}
		}
	}


}

