public class Ferrari  implements Car {
    private static final String MODEL = "488-Spider";
    private static final String DEFAULT_BRAKE_MSG = "Brakes!";
    private static final String DEFAULT_GAS_MSG = "Zadu6avam sA!";

    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = MODEL;
    }

    @Override
    public String useBrakes() {
        return DEFAULT_BRAKE_MSG;
    }

    @Override
    public String useGasPedal() {
        return DEFAULT_GAS_MSG;
    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
