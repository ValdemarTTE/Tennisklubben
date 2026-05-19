package ui;

import file.CSVHandler;
import main.TennisSystemCashier;
import main.TennisSystemChairman;
import util.SortingService;

import java.util.Scanner;

public class CashierMenu {
    private Scanner sc;

    public CashierMenu (Scanner sc) {
        this.sc = sc;
    }

    TennisSystemCashier cashier = new TennisSystemCashier();
    CSVHandler file = new CSVHandler();
    SortingService sortingService = new SortingService();

    // Viser kasserermenu
    public void startCashierMenu() {

        boolean running = true;

        while (running) {
            System.out.println("\n=============================================");
            System.out.println(" 🎾 Velkommen til kasserens menu, 1 - 7 🎾 ");
            System.out.println("\n=============================================");
            System.out.println();
            System.out.println("1. Overblik over forventede indbetalinger");
            System.out.println("2. Sorter restance medlemmer efter beløb");
            System.out.println("3. Sorter restance medlemmer efter navn");
            System.out.println("4. Afslut program");


            int choice = sc.nextInt();

            switch (choice) {
                case 1: cashier.expectPayment();

                case 2:cashier.sortArrearsAmount();

                case 3:

                case 4:

                case 5:
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