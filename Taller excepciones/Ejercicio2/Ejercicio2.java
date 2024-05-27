//Julio Cesar Hernández Monroy 26/05/2024
//Programa para dividir un numero y dar un mensaje de error en caso de dividir en 0 con excepciones

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Programa para divisiones ");
            System.out.println("Ingresa el numerador: ");
            double Numerador = sc.nextDouble();

            System.out.print("Ingresa el denominador: ");
            double Denominador = sc.nextDouble();

            if (Denominador == 0.0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }

            double Resultado = Numerador / Denominador;
            System.out.println("Resultado de la división: " + Resultado);
        } catch (ArithmeticException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
