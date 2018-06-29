import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] carItems = reader.readLine().split(" ");
         String[] truckItems = reader.readLine().split(" ");

         Vehicle car = new Car(Double.parseDouble(carItems[1]), Double.parseDouble(carItems[2]));
         Vehicle truck = new Truck(Double.parseDouble(truckItems[1]), Double.parseDouble(truckItems[2]));

         int n = Integer.parseInt(reader.readLine());

         while (n-- > 0){
             executeCommands(reader, car, truck);
         }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f", truck.getFuelQuantity());
    }

    private static void executeCommands(BufferedReader reader, Vehicle car, Vehicle truck) throws IOException {
        String[] items = reader.readLine().split(" ");
        switch (items[0]){
            case "Drive":
                double distance = Double.parseDouble(items[2]);
                driveVehicle(car, truck, items[1], distance);
                break;
            case "Refuel":
                double liters = Double.parseDouble(items[2]);
                refuelVehicle(car, truck, items[1], liters);
                break;
        }
    }

    private static void refuelVehicle(Vehicle car, Vehicle truck, String item, double liters) {
        if ("Car".equals(item)){
            car.refuel(liters);
        } else {
            truck.refuel(liters);
        }
    }

    private static void driveVehicle(Vehicle car, Vehicle truck, String item, double distance) {
        if ("Car".equals(item)){
            System.out.println(car.drive(distance));
        } else{
            System.out.println(truck.drive(distance));
        }
    }
}
