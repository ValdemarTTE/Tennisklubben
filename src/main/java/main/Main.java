package main;

import ui.MainMenu;

public class Main {

    static void main(String[] args) {
        //Initialisere Controlleren
        // Controlleren opretter selv sine services og data forbindelser
        Controller controller = new Controller();

        // Initialisere UI og giver den adgang til controlleren
        MainMenu ui = new MainMenu(controller);

        // Starter programmet med et while loop der holder programmet kørende
        ui.run();
    }
}