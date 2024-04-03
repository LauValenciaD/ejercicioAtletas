package ejercicioAtletas;

import java.util.Scanner;

public class MyScanner {
    private Scanner scanner;

    // Constructor
    public MyScanner() {
        this.scanner = new Scanner(System.in);
    }

    // Método para pedir un entero
    public int pedirInt() {
        System.out.println("Introduce un número:");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número entero válido:");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    // Método para pedir una cadena de texto
    public String pedirString(String mensaje) {
        System.out.println("Introduce el " + mensaje + ":");
        return scanner.nextLine();
    }

    // Método para pedir un número decimal
    public double pedirDouble() {
        System.out.println("Introduce un número decimal:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingresa un número decimal válido:");
            scanner.next();
        }
        double numero = scanner.nextDouble();
        scanner.nextLine();
        return numero;
    }

    // Método para cerrar el scanner
    public void cerrar() {
        scanner.close();
    }
}
