package util;

import plant.*;

final public class Print {
    final public static String instructions = "Welcome to your sustenance program. Enter 'exit' to leave.";
    final public static String readPlant = System.lineSeparator() + "What plant needs sustenance? ";
    final public static String askContinue = "(Enter Y or yes to continue)"
            + System.lineSeparator() + "Do you want to continue? ";


    public static void printMessage(String message) {
        if (message.equals(instructions)) {
            System.out.println(instructions);
        }
        if (message.equals(readPlant)) {
            System.out.print(Print.readPlant);
        }
        if (message.equals(askContinue)) {
            System.out.print(Print.askContinue);
        }
    }

    public void printSustenance(Plant plant) {
        System.out.printf("Type: %s. Sustenance: %.2f(l) of %s. %n%n",
                plant.getClass().getSimpleName(),
                plant.getSustenanceVolume(), SustenanceType.getSustenanceType(plant));
    }


}
