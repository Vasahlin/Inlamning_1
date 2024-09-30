package util;

import plant.Plant;
import userInteraction.UserInteraction;

import java.util.ArrayList;

public final class InputValidation {

    private InputValidation() {
        throw new AssertionError();
    }

    public static int fieldExists(String toExamine, ArrayList<Plant> plantList) {
        if (!toExamine.equalsIgnoreCase(UserInteraction.exit)) {
            try {
                stringNotEmpty(toExamine);
                listNotEmpty(plantList);
                return indexOfPlant(toExamine, plantList);
            } catch (IllegalArgumentException | NullPointerException | NoSuchFieldError e) {
                System.out.println(e.getMessage());
                return -1;
            }
        } else return -1;
    }

    private static void stringNotEmpty(String toExamine) throws IllegalArgumentException {
        if (toExamine.trim().isEmpty()) {
            throw new IllegalArgumentException("Plant name is empty." + System.lineSeparator());
        }
    }

    private static void listNotEmpty(ArrayList<Plant> plantList) {
        if (plantList.isEmpty()) {
            throw new NullPointerException("List of plants contains no elements." + System.lineSeparator());
        }
    }

    private static int indexOfPlant(String toExamine, ArrayList<Plant> plantList) throws NoSuchFieldError {
        int low = 0, high = plantList.size() - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (plantList.get(mid).getPlantName().equalsIgnoreCase(toExamine)) {
                return mid;
            } else if (plantList.get(mid).getPlantName().toLowerCase().compareTo(toExamine.toLowerCase()) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        throw new NoSuchFieldError("List of plants contains no plant with such name." + System.lineSeparator());
    }

   public static boolean userWantsToExit(String userInput) {
        return !(userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("Y"));
    }
}
