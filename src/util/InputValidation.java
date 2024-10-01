package util;

import plant.Plant;
import userInteraction.UserInteraction;

import java.util.ArrayList;

public final class InputValidation {

    private InputValidation() {
        throw new AssertionError();
    }

    public static int validateAndFindIndex(String toExamine, ArrayList<Plant> plantList) {
        if (!toExamine.equalsIgnoreCase(UserInteraction.exit)) {
            try {
                stringNotNull(toExamine);
                listNotNull(plantList);
                return searchForIndex(toExamine, plantList);
            } catch (IllegalArgumentException | NullPointerException | NoSuchFieldError e) {
                System.out.println(e.getMessage());
                return -1;
            }
        } else return -1;
    }

    private static void stringNotNull(String toExamine) throws IllegalArgumentException {
        if (toExamine == null || toExamine.trim().isEmpty()) {
            throw new IllegalArgumentException("Plant name is empty.");
        }
    }

    private static void listNotNull(ArrayList<Plant> plantList) {
        if (plantList.isEmpty()) {
            throw new NullPointerException("List of plants contains no elements.");
        }
    }

    private static int searchForIndex(String toExamine, ArrayList<Plant> plantList) throws NoSuchFieldError {
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
        throw new NoSuchFieldError("List of plants contains no plant with such name.");
    }

   public static boolean userWantsToExit(String userInput) {
        return !(userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("Y"));
    }
}
