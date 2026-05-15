package ui;

import java.util.Scanner;

public class ChairmanMenu {

    private Scanner scanner;

    // Viser formandens menu
    public void startChairmanMenu() {

        boolean running = true;

        while (running) {

            System.out.println("\n================================================");
            System.out.println(" 🎾 Velkommen til formandens menu, vælg 1 - 5 🎾 ");
            System.out.println("\n================================================");
            System.out.println();
            System.out.println("1. Lav nyt medlem");
            System.out.println("2. Se medlemsliste");
            System.out.println("3. Sorter medlemsliste efter navn");
            System.out.println("4. Sorter medlemsliste efter alder");
            System.out.println("5. Afslut program");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:
                    running = false;
                    break;

            }
        }
    }
}