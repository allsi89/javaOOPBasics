import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(List<String> repairs) {
        for (int i = 0; i < repairs.size() - 1; i += 2) {
            try {
                Repair repair = new Repair(repairs.get(i), Integer.parseInt(repairs.get(i + 1)));
                this.repairs.add(repair);
            } catch (IllegalArgumentException ex){

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Repairs:");
        if (this.repairs.size() > 0){
            sb.append(System.lineSeparator())
                    .append(this.repairs.stream().map(Repair::toString).collect(Collectors.joining("\n")));
        }
        return sb.toString();
    }
}
