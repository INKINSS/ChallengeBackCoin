import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            handleOption(option);
        } while (option != 8);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1) Dólar a Peso Argentino");
        System.out.println("2) Peso Argentino a Dólar");
        System.out.println("3) Dólar a Real Brasileño");
        System.out.println("4) Dólar a Peso Colombiano");
        System.out.println("5) Peso Colombiano a Dólar");
        System.out.println("6) Quetzales a Dólar");
        System.out.println("7) Dólar a Quetzales");
        System.out.println("8) Salir");
    }

    private static void handleOption(int option) {
        switch (option) {
            case 1:
                // Lógica para convertir Dólar a Peso Argentino
                break;
            case 2:
                // Lógica para convertir Peso Argentino a Dólar
                break;
            case 3:
                // Lógica para convertir Dólar a Real Brasileño
                break;
            case 4:
                // Lógica para convertir Dólar a Peso Colombiano
                break;
            case 5:
                // Lógica para convertir Peso Colombiano a Dólar
                break;
            case 6:
                // Lógica para convertir Quetzales a Dólar
                break;
            case 7:
                // Lógica para convertir Dólar a Quetzales
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}