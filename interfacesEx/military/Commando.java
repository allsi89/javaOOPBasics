import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Commando extends SpecialisedSoldier implements ICommando{
    private List<Mission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }


    @Override
    public void addMission(List<String> missions) {
        for (int i = 0; i < missions.size() - 1 ; i+=2) {
            try {
                Mission mission = new Mission(missions.get(i), missions.get(i + 1));
                this.missions.add(mission);
            } catch (IllegalArgumentException ex){

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Missions:");
        if (this.missions.size() > 0){
            sb.append(System.lineSeparator())
                    .append(this.missions.stream().map(Mission::toString).collect(Collectors.joining("\n")));
        }

        return sb.toString();
    }
}
