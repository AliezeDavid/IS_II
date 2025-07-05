public class Main{
    public static void main(String[] args) {

        //This is us instantiating a class by packing everything Vehicle and
        // Car has into vehicle and Car respectively
        //Note: there is a difference in what i wrote i said 'vehicle' not "Vehicle"
        // the first one is the instance of a class the second one is the class itself
        //Just like the way you are an instance of LMU and you are not LMU it's the same thing here

        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.gauger(35);

        System.out.println("\n");
        car.drive();
        car.Trip_cost(23.5,56.6,90.0);
        //vehicle.Speed(56.6);
        car.Speed(56.9);
    }
}