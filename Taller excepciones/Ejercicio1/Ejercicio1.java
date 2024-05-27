//Julio Cesar Hernández Monroy 26/05/2024
//Programa para pedir un solo caracter y dar un mensaje en caso de error con excepciones

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un carácter: ");
            String input = sc.nextLine();

            if (input.length() != 1) {
                throw new IllegalArgumentException("Debe ingresar exactamente un carácter.");
            }

            char Caracter = input.charAt(0); 
            System.out.println("Carácter introducido: " + Caracter);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            sc.close(); 
        }
    }
}
