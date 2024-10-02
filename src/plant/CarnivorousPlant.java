package plant;

/**
    SIGRUN: Inheritance
 */
public class CarnivorousPlant extends Plant{

    /**
        SIGRUN: Encapsulation
     */
    private static final String sustenanceType = "protein drink";
    private final double lengthMeter;
    private final String plantName;

    public CarnivorousPlant(double lengthMeter, String plantName) {
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
        return 0.1 + this.lengthMeter * 0.2;
    }
}
