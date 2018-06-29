public class Truck extends Vehicle {
    private static final double DEFAULT_CONSUMPTION_INCREASE = 1.6;
    private static final double DEFAULT_REFUEL_MOD = 0.95;

    public Truck(double fuelQuantity, double litersKm, double tankCapacity) {
        super(fuelQuantity, litersKm, tankCapacity);
    }

    @Override
    public String driveEmpty(double distance) {
        return null;
    }

    @Override
    public String drive(double distance) {
        double consumption = distance*(super.getLitersKm() + DEFAULT_CONSUMPTION_INCREASE);
        if (consumption > super.getFuelQuantity()){
           return "Truck needs refueling";
        } else {
            super.setDistance(distance);
            super.setFuelQuantity(super.getFuelQuantity() - consumption);
            return String.format("Truck travelled %s km", DEFAULT_FORMAT.format(distance));
        }
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters*DEFAULT_REFUEL_MOD);
    }
}
