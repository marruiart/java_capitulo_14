/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int[] nums = new int[6];
        int n = 0;

        System.out.println("A continuación, se van a solicitar 6 números enteros");
        do {
            try {
                System.out.printf("Introduce un número (%d/6): ", count + 1);
                n = s.nextInt();
                nums[count] = n;
                count++;
            } catch (Exception e) {
                s.nextLine();
                System.out.println("Excepción: " + e.getClass());
                System.out.println("Error: " + e.getMessage() + "El número introducido no es válido.");
            }
        } while (count < 6);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        System.out.printf("El número máximo introducido es el %d", max);
    }
}
