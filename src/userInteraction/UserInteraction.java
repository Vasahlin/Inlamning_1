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
                userInput = myScan.nextLine();
                if (util.InputValidation.userWantsToExit(userInput)) {
                    userInput = loopControlSignal.EXIT.label_1;
                }
            }
        } while (!userInput.trim().equalsIgnoreCase(loopControlSignal.EXIT.label_1));
    }

    /**
        SIGRUN: ENUM
     */
    public enum loopControlSignal {
        EXIT("exit", "EXIT"),
        CONTINUE("yes", "Y");

        public final String label_1;
        public final String label_2;

        loopControlSignal(String label_1, String label_2) {
            this.label_1 = label_1;
            this.label_2 = label_2;
        }
    }
}
