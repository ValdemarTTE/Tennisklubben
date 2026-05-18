package main;

import model.*;
import service.*;
import filehandler.*;
import exceptions.*;
import util.*;

import java.util.List;

public class Controller {
//Referencer til andre lag (Services og Data)
    private MemberManager memberManager;
    private FinanceService financeService;
    private IStorage storage;
    private ILogger logger;
    private IValidator validator;

    public Controller() {
    // Initialisering af systemets dele
        this.memberManager = new MemberManager();
        this.financeService = new FinanceService();
        this.storage = new CSVHandler();
        this.logger = new FileLogger();
        this.validator = new MemberValidator();

        // indlæs data automatisk ved opstart
        try {
            loadAllData();
        } catch (SmashException e) {
            System.out.println("Fejl ved opstart: " + e.getMessage());
        }
    }
}

public void addMember(String name, int age, boolean isActive, boolean isCompetitive) throws SmashException {
// validere data via interface
    validator.validate(name, age);

    // Opretter medlem via Factory (hører under MemberManager eller som selvstændig service)
    Member newMember = MemberFactory.create(name, age, isActive, isCompetitive);

    // Tilføjer til listen og gemmer til fil
    memberManager.add(newMember);
    storage.saveMembers(memberManager.getAll());
}

public List<Member> getArrearsList() {
    // Henter Listen over folk i restance fra FinanceService
    return financeService.getMembersInArrears(memberManager.getAll());
}

public double getTotalExpectedRevenue() {
    return financeService.calculateTotalRevenue(memberManager.getAll());

}

public List<Member> getTopFive(String discipline, boolean isJunior) {
    // Bruger SortingService til at finde de 5 bedste
    return SortingService.getTopFive(memberManager.getAll(), discipline, isJunior);

}

public void loadAllData() throws SmashException {
    List<Member> loadedMembers = storage.loadMembers();
    memberManager.setAll(loadedMembers);
}

public void runPerformanceTest() {
    // Denne methode kalder CSVHandler for at CPU-tid kan måles
    if (storage instanceof CSVHandler) {
        ((CSVHandler) storage).measurePerformance();
    }
}