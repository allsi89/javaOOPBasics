public class Car extends Vehicle {
    private static final double DEFAULT_CONSUMPTION_INCREASE = 0.9;

    public Car(double fuelQuantity, double litersKm, double tankCapacity) {
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
            return "Car needs refueling";
        } else {
            super.setDistance(distance);
            super.setFuelQuantity(super.getFuelQuantity() - consumption);
            return String.format("Car travelled %s km", DEFAULT_FORMAT.format(distance));
        }
    }


}
