package ui;

import java.util.Scanner;

public class CoachMenu {

    private Scanner scanner;

    // Viser trænermenu
    public void startCoachMenu() {

        boolean running = true;

        while (running) {
            System.out.println("\n================================================");
            System.out.println(" 🎾 Velkommen til trænerens menu, vælg 1 - 5 🎾 ");
            System.out.println("\n================================================");
            System.out.println();
            System.out.println("1. Register bedste træningsresultat til en disciplin");
            System.out.println("2. Udtag medlem til turnering");
            System.out.println("3. Se top 5 medlemmer indenfor en disciplin");
            System.out.println("4. Afslut program");


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
