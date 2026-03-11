package principal;

import service.ConnectServiceAPI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConnectServiceAPI servicio = new ConnectServiceAPI();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("***************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda :)");
            System.out.println();
            System.out.println("1) Dólar ==> Peso argentino");
            System.out.println("2) Peso argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real brasileño");
            System.out.println("4) Real brasileño ==> Dólar");
            System.out.println("5) Dólar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dólar");
            System.out.println("7) Salir");
            System.out.println();
            System.out.print("Elija una opción válida: ");
            System.out.println("***************************************************");

            opcion = teclado.nextInt();

            if (opcion == 7) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Ingrese el valor que desea convertir: ");
            double valor = teclado.nextDouble();

            double resultado = 0;

            switch (opcion) {

                case 1 -> resultado = servicio.convertir("USD", "ARS", valor);
                case 2 -> resultado = servicio.convertir("ARS", "USD", valor);
                case 3 -> resultado = servicio.convertir("USD", "BRL", valor);
                case 4 -> resultado = servicio.convertir("BRL", "USD", valor);
                case 5 -> resultado = servicio.convertir("USD", "COP", valor);
                case 6 -> resultado = servicio.convertir("COP", "USD", valor);
                default -> System.out.println("Opción inválida");
            }

            System.out.printf("El valor convertido es: %,.2f%n", resultado);
            System.out.println();
        }
    }
}
