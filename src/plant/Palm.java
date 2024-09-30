package plant;

public class Palm extends Plant {

    public Palm(double lengthMeter, String plantName) {
        super(lengthMeter, plantName);
    }

    public double getSustenanceVolume() {
        return this.lengthMeter * 0.5;
    }

    public String getSustenanceType() {
        return SustenanceType.getSustenanceType(this);
    }
}
