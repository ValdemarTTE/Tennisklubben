package ui;

import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);

    ChairmanMenu menuA = new ChairmanMenu();
    CashierMenu menuB = new CashierMenu();
    CoachMenu menuC = new CoachMenu();

    // viser hovedmenu
    public void run() {

        boolean running = true;

        while (running) {
            System.out.println("\n=========================================");
            System.out.println("     🎾 VELKOMMEN TIL TENNISKLUBBENS 🎾    ");
            System.out.println("===========================================");
            System.out.println("            HOVEMENU             ");
            System.out.println("-------------------------------------------");
            System.out.println();
            System.out.println("1. Formanden menu");
            System.out.println("2. kasserer menu");
            System.out.println("3. Træner menu");
            System.out.println("4. Afslut program");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuA.startChairmanMenu();
                    break;

                case 2:
                    menuB.startCashierMenu();
                    break;

                case 3:
                    menuC.startCoachMenu();
                    break;

                case 4:
                    running = false;
                    break;
            }
        }
    }
}