import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<ISoldier> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivates(List<String> items, Map<Integer, ISoldier> soldiers) {
        for (String item : items) {
            int id = Integer.parseInt(item);
            if (soldiers.containsKey(id)) {
                ISoldier iSoldier = soldiers.get(id);
                this.privates.add(iSoldier);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",
                this.getFirstName(), this.getLastName(),
                this.getId(), this.getSalary()))
                .append(System.lineSeparator())
                .append("Privates:");
        if (this.privates.size() > 0) {
            sb.append(System.lineSeparator())
                    .append("  ")
                    .append(this.privates.stream()
                            .sorted(Comparator.comparingInt(ISoldier::getId).reversed())
                            .map(ISoldier::toString)
                            .collect(Collectors.joining("\n  ")));
        }



        return sb.toString();
    }
}
