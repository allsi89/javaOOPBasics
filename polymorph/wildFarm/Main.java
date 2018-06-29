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

        int count = 1;

        Animal animal = null;
        Food food = null;
        List<Animal> animals = new ArrayList<>();
        while (!END_COMMAND.equals(line)){


            if (count%2 != 0){
                String[] anItems = line.split(" ");
                animal = createAnimal(anItems);
                animals.add(animal);
            } else {
                String[] foodItems = line.split(" ");
                food = createFood(foodItems);
                animal.makeSound();
                try{
                    animal.eat(food);
                } catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }

            count++;
            line = reader.readLine();
        }

        animals.forEach(x-> System.out.println(x.toString()));



    }

    private static Food createFood(String[] foodItems) {
        switch (foodItems[0]){
            case "Vegetable":
                return new Vegetable(Integer.parseInt(foodItems[1]));
            case "Meat":
                return new Meat(Integer.parseInt(foodItems[1]));
        }
        return null;
    }

    private static Animal createAnimal(String[] anItems) {
        String type = anItems[0];
        String name = anItems[1];
        double weight = Double.parseDouble(anItems[2]);
        String livingRegion = anItems[3];

        switch (type){
            case "Mouse":
                return new Mouse(type, name, weight, livingRegion);
            case "Cat":
                return new Cat(type, name, weight, livingRegion, anItems[4]);
            case "Tiger":
                return new Tiger(type, name, weight, livingRegion, livingRegion);
            case "Zebra":
                return new Zebra(type, name, weight, livingRegion);
        }

        return null;
    }
}