package main;

import ui.MainMenu;

public class Main {

    static void main(String[] args) {

        // Initialisere UI og giver den adgang til controlleren
        MainMenu ui = new MainMenu();

        // Starter programmet med et while loop der holder programmet kørende
        ui.run();
    }
}