package plant;

public class Cactus extends Plant{
    private static final String sustenanceType = "sparkling water";
    private final String plantName;

    public Cactus(String plantName) {
        this.plantName = plantName;
    }

    public String getSustenanceType() {
        return sustenanceType;
    }

    public String getPlantName() {
        return this.plantName;
    }

    public double getSustenanceVolume() {
        return 0.02;
    }
}
