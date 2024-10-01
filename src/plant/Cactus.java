package plant;

public class Cactus extends Plant{

    private final String plantName;

    public Cactus(String plantName) {
        this.plantName = plantName;
    }

    public String getSustenanceType() {
        return getSustenanceType(this);
    }

    public String getPlantName() {
        return this.plantName;
    }

    public double getSustenanceVolume() {
        return 0.02;
    }
}
