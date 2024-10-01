package plant;

public abstract class Plant implements Sustenance {
    abstract public String getPlantName();
    abstract public String getSustenanceType();
    abstract public double getSustenanceVolume();

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
        return "unknown liquid";
    }

    /**
        Example of enum
     */
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
