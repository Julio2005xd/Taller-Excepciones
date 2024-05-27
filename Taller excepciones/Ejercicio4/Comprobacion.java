//Julio Cesar Hernández Monroy 26/05/2024
//Programa obtener una excepción a partir de unas herencias

package Ejercicio4;

public class Comprobacion {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción de tipo ExcepcionB
            throw new ExcepcionB("ExcepcionB lanzada");
        } catch (ExcepcionA e) {
            System.out.println("Capturada excepción de tipo ExcepcionA.");
        }

        try {
            // Lanzamos una excepción de tipo ExcepcionC
            throw new ExcepcionC("ExcepcionC lanzada");
        } catch (ExcepcionA e) {
            System.out.println("Capturada excepción de tipo ExcepcionA.");
        }
    }
}
