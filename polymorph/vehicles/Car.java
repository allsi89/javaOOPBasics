public class Car extends Vehicle {
    private static final double DEFAULT_CONSUMPTION_INCREASE = 0.9;

    Car(double fuelQuantity, double litersKm) {
        super(fuelQuantity, litersKm);
    }

    @Override
    public String drive(double distance) {
        double consumption = distance*(super.getLitersKm() + DEFAULT_CONSUMPTION_INCREASE);
        if (consumption > super.getFuelQuantity()){
            return "Car needs refueling";
        } else {
            super.setDistance(distance);
            super.setFuelQuantity(super.getFuelQuantity() - consumption);
            return String.format("Car travelled %s km", DEFAULT_FORMAT.format(distance));
        }
    }

    @Override
    public void refuel(double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + liters);
    }

}
