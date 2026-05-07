package ui;

import java.util.Scanner;

public class CashierMenu {

    private Scanner scanner;

    public void startCashierMenu() {

        boolean running = true;

        while (running) {
            System.out.println("Velkommen til kasserens menu, 1 - 7");
            System.out.println("1. Opkrav kontingentbetalning af medlemmer");
            System.out.println("2. Sorter forventede indbetalinger efter beløb");
            System.out.println("4. Vis medlemmer i restance");
            System.out.println("5. Sorter restance medlemmer efter navn");
            System.out.println("6. Sorter restance medlemmer efter beløb");
            System.out.println("7. Afslut program");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    running = false;
                    break;

                default:
                System.out.println("Ugyldigt input, prøv igen.");
                running = true;
                break;
            }
        }
    }
}