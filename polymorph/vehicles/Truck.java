public class Truck extends Vehicle {
    private static final double DEFAULT_CONSUMPTION_INCREASE = 1.6;
    private static final double DEFAULT_REFUEL_MOD = 0.95;

    Truck(double fuelQuantity, double litersKm) {
        super(fuelQuantity, litersKm);
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
        super.setFuelQuantity(super.getFuelQuantity() + (liters*DEFAULT_REFUEL_MOD));
    }
}
