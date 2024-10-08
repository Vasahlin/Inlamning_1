package plant;

public class Palm extends Plant {
    private static final String sustenanceType = "tap water";
    private final double lengthMeter;
    private final String plantName;

    public Palm(double lengthMeter, String plantName) {
        this.lengthMeter = lengthMeter;
        this.plantName = plantName;
    }

    public String getPlantName() {
        return this.plantName;
    }

    public String getSustenanceType() {
        return sustenanceType;
    }

    public double getSustenanceVolume() {
        return this.lengthMeter * 0.5;
    }
}
