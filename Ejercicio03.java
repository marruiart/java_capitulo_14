/**
 * Realiza un programa que genere una excepción de forma aleatoria de entre
 * las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
 * IndexOutOfBoundsException y ArithmeticException.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio03 {
    public static void main (String[] args) throws Exception {
        int i = (int) (Math.random() * 5) + 1;
        System.out.printf("1. NumberFormatException\n" +
                "2. IOException\n" +
                "3. FileNotFoundException\n" +
                "4. IndexOutOfBoundsException\n" +
                "5. ArithmeticException\n");
        System.out.println("Debe salir la excepción " + i);
        switch (i) {
            case 1 -> throw new NumberFormatException();
            case 2 -> throw new IOException();
            case 3 -> throw new FileNotFoundException();
            case 4 -> throw new IndexOutOfBoundsException();
            case 5 -> throw new ArithmeticException();
            default -> throw new IllegalStateException("Unexpected value: " + i);
        }
    }
}
