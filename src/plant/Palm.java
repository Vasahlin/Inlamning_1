package plant;

public class Palm extends Plant {

    private double lengthMeter;
    private String plantName;

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
