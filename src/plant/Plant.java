package plant;

public abstract class Plant implements ISustenanceType {
    protected double lengthMeter;
    protected String plantName;

    public Plant(double lengthMeter, String plantName) {
        this.lengthMeter = lengthMeter;
        this.plantName = plantName;
    }

    public String getPlantName() {
        return this.plantName;
    }

    abstract public double getSustenanceVolume();
}
