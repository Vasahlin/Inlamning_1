package plant;

public class Cactus extends Plant{

    public Cactus(double lengthMeter, String plantName) {
        super(lengthMeter, plantName);
    }

    public double getSustenanceVolume() {
        return 0.02;
    }
}
