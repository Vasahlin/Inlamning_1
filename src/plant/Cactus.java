package plant;

public class Cactus extends Plant{
    private String plantName;

    public Cactus(double lengthMeter, String plantName) {
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
