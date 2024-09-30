package userInteraction;

import plant.*;
import util.Print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInteraction {
    private final Scanner myScan;
    private final ArrayList<Plant> plantList;
    public final static String exit = "exit";

    public UserInteraction() {
        myScan = new Scanner(System.in);
        plantList = new ArrayList<>();
        Collections.addAll(plantList,
                new Cactus(0.2, "Igge"),
                new Palm(5, "Laura"),
                new CarnivorousPlant(0.7, "Meatloaf"),
                new Palm(1, "Olof"));
    }

    public void start() {
        String userInput;
        int index;

        Print.printMessage(Print.instructions);
        do {
            Print.printMessage(Print.readPlant);
            userInput = myScan.nextLine();
            index = util.InputValidation.fieldExists(userInput, plantList);
            if (index >= 0) {
                Print.printSustenance(plantList.get(index));
                Print.printMessage(Print.askContinue);
                userInput = myScan.nextLine();
                if (util.InputValidation.userWantsToExit(userInput)) {
                    userInput = exit;
                }
            }
        } while (!userInput.trim().equalsIgnoreCase(exit));
    }
}
