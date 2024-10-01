package plant;

public class CarnivorousPlant extends Plant{
    private double lengthMeter;
    private String plantName;

    public CarnivorousPlant(double lengthMeter, String plantName) {
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
        return 0.1 + this.lengthMeter * 0.2;
    }
}
