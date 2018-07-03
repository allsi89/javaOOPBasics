public abstract class SpecialisedSoldier extends Private {
    public static final String DEFAULT_CORPS_AIR = "Airforces";
    public static final String DEFAULT_CORPS_MAR = "Marines";

    private String corps;

    public SpecialisedSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    public String getCorps() {
        return this.corps;
    }

    private void setCorps(String corps) {
        if (!(DEFAULT_CORPS_AIR.equals(corps) || DEFAULT_CORPS_MAR.equals(corps))){
            throw new IllegalArgumentException();
        }
        this.corps = corps;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", this.getFirstName(),
                this.getLastName(),
                this.getId(), this.getSalary()))
                .append(System.lineSeparator())
                .append(String.format("Corps: %s", this.getCorps()))
                .append(System.lineSeparator());
        return sb.toString();
    }
}
