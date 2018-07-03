import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String END_COMMAND = "End";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        List<Detainable> detainables = new ArrayList<>();
        while (!END_COMMAND.equals(line)) {
            String[] items = line.split("\\s+");
            Detainable detainable = getDetainable(items);
            if (detainable != null){
                detainables.add(detainable);

            }
            line = reader.readLine();
        }

        String lastDigits = reader.readLine();

        for (Detainable detainable : detainables) {
            if (detainable.getBirthDate().endsWith(lastDigits)) {
                System.out.println(detainable.getBirthDate());
            }
        }


    }

    private static Detainable getDetainable(String[] items) {
        String type = items[0];

        switch (type) {
            case "Citizen":
                return new Citizen(items[1], Integer.parseInt(items[2]), items[3], items[4]);
            case "Pet":
                return new Pet(items[1], items[2]);
            default:
                return null;
        }

    }


}
