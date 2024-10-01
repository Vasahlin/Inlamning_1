package plant;

public abstract class Plant implements ISustenanceType {
    protected double lengthMeter;
    protected String plantName;
    protected String sustenanceType = ISustenanceType.getSustenanceType(this);

    public Plant(double lengthMeter, String plantName) {
        this.lengthMeter = lengthMeter;
        this.plantName = plantName;
    }

    public String getPlantName() {
        return this.plantName;
    }

    public String getSustenanceType() {
        return sustenanceType;
    }

    abstract public double getSustenanceVolume();
}
