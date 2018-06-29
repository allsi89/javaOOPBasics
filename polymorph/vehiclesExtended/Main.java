import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] carItems = reader.readLine().split(" ");
         String[] truckItems = reader.readLine().split(" ");
         String[] busItems = reader.readLine().split(" ");

         Vehicle car = new Car(Double.parseDouble(carItems[1]),
                 Double.parseDouble(carItems[2]),
                 Double.parseDouble(carItems[3]));
         Vehicle truck = new Truck(Double.parseDouble(truckItems[1]),
                 Double.parseDouble(truckItems[2]),
                 Double.parseDouble(truckItems[3]));
         Vehicle bus = new Bus(Double.parseDouble(busItems[1]),
                 Double.parseDouble(busItems[2]),
                 Double.parseDouble(busItems[3]));

         int n = Integer.parseInt(reader.readLine());

         while (n-- > 0){
             try {
                 executeCommands(reader, car, truck, bus);
             } catch (IllegalArgumentException ex){
                 System.out.println(ex.getMessage());
             }

         }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());

    }

    private static void executeCommands(BufferedReader reader, Vehicle car, Vehicle truck, Vehicle bus) throws IOException {
        String[] items = reader.readLine().split(" ");
        switch (items[0]){
            case "Drive":
                double distance = Double.parseDouble(items[2]);
                driveVehicle(car, truck, bus, items[1], distance);
                break;
            case "Refuel":
                double liters = Double.parseDouble(items[2]);
                refuelVehicle(car, truck, bus, items[1], liters);
                break;
            case "DriveEmpty":
                double distance1 = Double.parseDouble(items[2]);
                System.out.println(bus.driveEmpty(distance1));
                break;
        }
    }

    private static void refuelVehicle(Vehicle car, Vehicle truck, Vehicle bus, String item, double liters) {
        if ("Car".equals(item)){
            car.refuel(liters);
        } else if("Bus".equals(item)){
            bus.refuel(liters);
        } else {
            truck.refuel(liters);
        }
    }

    private static void driveVehicle(Vehicle car, Vehicle truck, Vehicle bus, String item, double distance) {
        if ("Car".equals(item)){
            System.out.println(car.drive(distance));
        } else if("Bus".equals(item)) {
            System.out.println(bus.drive(distance));
        }else{
            System.out.println(truck.drive(distance));
        }
    }
}
