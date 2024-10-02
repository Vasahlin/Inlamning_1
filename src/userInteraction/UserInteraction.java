package userInteraction;

import plant.*;
import util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInteraction {
    private final Scanner myScan;
    private final ArrayList<Plant> plantList;

    public UserInteraction() {
        myScan = new Scanner(System.in);
        plantList = new ArrayList<>();
        Collections.addAll(plantList,
                new Cactus("Igge"),
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
            index = InputValidation.validateAndFindIndex(userInput, plantList);
            if (index >= 0) {
                Print printer = new Print();
                printer.printSustenance(plantList.get(index));
                Print.printMessage(Print.askContinue);
                if (InputValidation.userWantsToExit(userInput = myScan.nextLine())) {
                    userInput = loopControlSignal.EXIT.identifier;
                }
            }
        } while (!userInput.trim().equalsIgnoreCase(loopControlSignal.EXIT.identifier));
    }

    /**
        SIGRUN: ENUM
     */
    public enum loopControlSignal {
        EXIT("exit"),
        CONTINUE("yes");

        public final String identifier;

        loopControlSignal(String identifier) {
            this.identifier = identifier;
        }
    }
}
