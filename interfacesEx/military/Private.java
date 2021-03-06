public class Private extends Soldier {
    private double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }


    @Override
    public String toString(){
        return String.format("Name: %s %s Id: %d Salary: %.2f", this.getFirstName(),
                this.getLastName(), this.getId(), this.getSalary());
    }
}
