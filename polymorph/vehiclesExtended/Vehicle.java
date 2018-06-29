import java.text.DecimalFormat;

public abstract class Vehicle {
    private static final double DEFAULT_DISTANCE = 0;
    static final DecimalFormat DEFAULT_FORMAT = new DecimalFormat("#.##");
    private static final String DEFAULT_CAPACITY_ERROR_MESSAGE = "Cannot fit fuel in tank";
    private static final String DEFAULT_FUEL_ERROR_MSG = "Fuel must be a positive number";

    private double fuelQuantity;
    private double litersKm;
    private double tankCapacity;
    private double distance;


    Vehicle(double fuelQuantity, double litersKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.litersKm = litersKm;
        this.tankCapacity = tankCapacity;
        this.distance = DEFAULT_DISTANCE;
    }

    double getFuelQuantity() {
        return this.fuelQuantity;
    }

    double getLitersKm() {
        return this.litersKm;
    }

    public double getDistance() {
        return this.distance;
    }

    private double getTankCapacity() {
        return this.tankCapacity;
    }

    protected void setFuelQuantity(double liters) {
        this.fuelQuantity = liters;
    }

    protected void setLitersKm(double litersKm) {
        this.litersKm = litersKm;
    }

    protected void setDistance(double distance) {
        this.distance = distance;
    }


    public abstract String driveEmpty(double distance);

    public abstract String drive(double distance);

    public void refuel(double liters){
        if (liters <= 0){
            throw new IllegalArgumentException(DEFAULT_FUEL_ERROR_MSG);
        } else if ((this.getTankCapacity() - this.getFuelQuantity()) < liters){
            throw new IllegalArgumentException(DEFAULT_CAPACITY_ERROR_MESSAGE);
        } else {
            this.setFuelQuantity(this.getFuelQuantity() + liters);
        }
    }


}
