import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    private static final String END_COMMAND = "End";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, ISoldier> privates = new LinkedHashMap<>();
        List<ISoldier> soldiers = new ArrayList<>();
        String line = reader.readLine();
        while (!END_COMMAND.equals(line)) {
            String[] items = line.split("\\s+");
            try {
                ISoldier iSoldier = getSoldier(items, privates);
                privates.put(Integer.parseInt(items[1]), iSoldier);
                soldiers.add(iSoldier);
            } catch (IllegalArgumentException ex){

            }
            line = reader.readLine();
        }

        soldiers.forEach(s-> System.out.println(s.toString()));

    }

    private static ISoldier getSoldier(String[] items, Map<Integer, ISoldier> privates) {
        String type = items[0];
        int id = Integer.parseInt(items[1]);
        String firstName = items[2];
        String lastName = items[3];
        switch (type) {
            case "Private":
                return createNewPrivate(items[4], privates, id, firstName, lastName);
            case "LeutenantGeneral":
                return createNewLeutenant(items, privates, id, firstName, lastName);
            case "Engineer":
                return createEngineer(items, id, firstName, lastName);
            case "Commando":
                return createCommando(items, id, firstName, lastName);
            case "Spy":
                return new Spy(id, firstName, lastName, items[4]);
            default:
                return null;
        }

    }

    private static ISoldier createCommando(String[] items, int id, String firstName, String lastName) {
        Double salary = Double.parseDouble(items[4]);
        String corps = items[5];
        ICommando commando = new Commando(id, firstName, lastName, salary, corps);
        List<String> missions = Arrays.stream(items).skip(6).collect(Collectors.toList());
        commando.addMission(missions);
        return commando;
    }

    private static ISoldier createEngineer(String[] items, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(items[4]);
        String corps = items[5];
        IEngineer engineer = new Engineer(id, firstName, lastName, salary, corps);
        List<String> repairs = Arrays.stream(items).skip(6).collect(Collectors.toList());
        engineer.addRepair(repairs);
        return engineer;
    }

    private static ISoldier createNewLeutenant(String[] items, Map<Integer, ISoldier> privates, int id, String firstName, String lastName) {
        double salaryLG = Double.parseDouble(items[4]);
        // ISoldier iSoldier = new LeutenantGeneral(id, firstName, lastName, salaryLG);
        ILeutenantGeneral general = new LeutenantGeneral(id, firstName, lastName, salaryLG);
        List<String> privateIds = Arrays.stream(items).skip(5).collect(Collectors.toList());
        general.addPrivates(privateIds, privates);
        return general;
    }

    private static ISoldier createNewPrivate(String item, Map<Integer, ISoldier> privates, int id, String firstName, String lastName) {
        double salaryP = Double.parseDouble(item);
        ISoldier iPrivate = new Private(id, firstName, lastName, salaryP);
        privates.put(id, iPrivate);
        return iPrivate;
    }
}
