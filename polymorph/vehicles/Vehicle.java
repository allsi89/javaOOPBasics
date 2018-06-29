import java.text.DecimalFormat;

public abstract class Vehicle {
    public static final double DEFAULT_DISTANCE = 0;
    public static final DecimalFormat DEFAULT_FORMAT = new DecimalFormat("#.##");

    private double fuelQuantity;
    private double litersKm;
    private double distance;

    Vehicle(double fuelQuantity, double litersKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersKm = litersKm;
        this.distance = DEFAULT_DISTANCE;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getLitersKm() {
        return this.litersKm;
    }

    public double getDistance() {
        return this.distance;
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

    public abstract String drive(double distance);

    public abstract void refuel(double liters);


}
