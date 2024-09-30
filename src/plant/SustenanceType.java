package plant;

public interface SustenanceType {

    static String getSustenanceType(Plant plant) {
        if (plant instanceof Cactus) {
            return sustenanceName.CACTUS.toString();
        }
        if (plant instanceof CarnivorousPlant) {
            return sustenanceName.CARNIVORE.toString();
        }
        if (plant instanceof Palm) {
            return sustenanceName.PALM.toString();
        }
        return "Unknown";
    }

    enum sustenanceName {
        CACTUS("sparkling water"),
        PALM("tap water"),
        CARNIVORE("protein drink");

        public final String sustenanceName;

        sustenanceName(String sustenance) {
            this.sustenanceName = sustenance;
        }
    }
}
