//Julio Cesar Hernández Monroy 26/05/2024
//Programa para mostrar una excepción en caso de que no se encuentra un Archivo

package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del Archivo: ");
        String NombreArchivo = sc.nextLine();

        try {
            File Archivo = new File(NombreArchivo);
            Scanner Lector = new Scanner(Archivo);

            System.out.println("El Archivo '" + NombreArchivo + "' fue encontrado con éxito.");

            Lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El Archivo '" + NombreArchivo + "' no se encuentra.");
        }
    }
}
