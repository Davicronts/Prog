package unidad8;

import unidad8.numeros.Cifras;
import unidad8.arrays1d.Filtros;
import unidad8.arrays2d.Elementos;

/**
 * Clase principal para probar las funciones de la biblioteca.
 */
public class Prueba {
    public static void main(String[] args) {
        // Prueba de contieneCifra
        System.out.println("Prueba de contieneCifra:");
        System.out.println(Cifras.contieneCifra(74506, 5)); // verdadero

        // Prueba de filtraConCifra
        System.out.println("Prueba de filtraConCifra:");
        int[] array = { 12, 5, 39, 18, 209 };
        int[] filtrado = Filtros.filtraConCifra(array, 9);
        for (int numero : filtrado) {
            System.out.print(numero + " "); // 39 209
        }
        System.out.println();

        // Prueba de aleatorioDeArray2D
        System.out.println("Prueba de aleatorioDeArray2D:");
        int[][] array2d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Elementos.aleatorioDeArray2D(array2d));
    }
}
