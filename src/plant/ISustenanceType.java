package plant;

public interface ISustenanceType {

    static String getSustenanceType(Plant plant) {
        if (plant instanceof Cactus) {
            return sustenanceName.CACTUS.sustenance;
        }
        if (plant instanceof CarnivorousPlant) {
            return sustenanceName.CARNIVORE.sustenance;
        }
        if (plant instanceof Palm) {
            return sustenanceName.PALM.sustenance;
        }
        return "Unknown";
    }

    enum sustenanceName {
        CACTUS("sparkling water"),
        PALM("tap water"),
        CARNIVORE("protein drink");

        public final String sustenance;

        sustenanceName(String sustenance) {
            this.sustenance = sustenance;
        }
    }
}
