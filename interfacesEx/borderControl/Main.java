import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    private static final String END_COMMAND = "End";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        Map<String, Buyer> buyers = new LinkedHashMap<>();
        while (count-- > 0) {
            String[] items = reader.readLine().split("\\s+");
            Buyer buyer = getBuyers(items);
            if (buyer != null) {
                buyers.put(items[0], buyer);
            }
        }

        buyFoodForAll(reader, buyers);
        System.out.println(calculateFood(buyers));

    }

    private static void buyFoodForAll(BufferedReader reader, Map<String, Buyer> buyers) throws IOException {
        String line = reader.readLine();
        while (!END_COMMAND.equals(line)) {
            if (buyers.containsKey(line)) {
                buyers.get(line).buyFood();
            }
            line = reader.readLine();
        }
    }

    private static int calculateFood(Map<String, Buyer> buyers) {
        int food = 0;
        for (Map.Entry<String, Buyer> buyerEntry : buyers.entrySet()) {
            food += buyerEntry.getValue().getFood();
        }
        return food;
    }

    private static Buyer getBuyers(String[] items) {
        if (items.length == 4) {
            return new Citizen(items[0], Integer.parseInt(items[1]), items[2], items[3]);
        } else {
            return new Rebel(items[0], Integer.parseInt(items[1]), items[2]);
        }
    }


}
