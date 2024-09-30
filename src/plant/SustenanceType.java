package plant;

public interface SustenanceType {

    String getSustenanceType();

    enum sustenanceName {
        CACTUS("sparkling water"),
        PALM("tap water"),
        CARNIVORE("protein drink");

        public final String sustenanceName;

        sustenanceName(String sustenance) {
            this.sustenanceName = sustenance;
        }
    }
}
