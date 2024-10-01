package plant;

public class Palm extends Plant {

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
        return getSustenanceType(this);
    }

    public double getSustenanceVolume() {
        return this.lengthMeter * 0.5;
    }
}
