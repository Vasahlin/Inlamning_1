package plant;

public class CarnivorousPlant extends Plant{

    public CarnivorousPlant(double lengthMeter, String plantName) {
        super(lengthMeter, plantName);
    }

    public double getSustenanceVolume() {
        return 0.1 + this.lengthMeter * 0.2;
    }
}
