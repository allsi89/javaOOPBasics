public class Bus extends Vehicle {
    private static final double DEFAULT_CONSUMPTION_INCREASE = 1.4;


    Bus(double fuelQuantity, double litersKm, double tankCapacity) {
        super(fuelQuantity, litersKm, tankCapacity);
    }

    @Override
    public String driveEmpty(double distance){
        double consumption = distance*super.getLitersKm();
        return getCorrespondingMessage(distance, consumption);
    }

    @Override
    public String drive(double distance) {
        double consumption = distance*(super.getLitersKm() + DEFAULT_CONSUMPTION_INCREASE);
        return getCorrespondingMessage(distance, consumption);
    }

    private String getCorrespondingMessage(double distance, double consumption) {
        if (consumption > super.getFuelQuantity()){
            return "Bus needs refueling";
        } else {
            super.setDistance(distance);
            super.setFuelQuantity(super.getFuelQuantity() - consumption);
            return String.format("Bus travelled %s km", DEFAULT_FORMAT.format(distance));
        }
    }

}
