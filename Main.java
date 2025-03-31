public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        Bicycle bicycle=new Bicycle("Mountain Bike",21,30.0);

        System.out.println("\nCar Speed Calculations: ");
        System.out.println("Normal Speed: "+car.calculateSpeed()+" km/h");
        System.out.println("Speed With Factor 1.5: "+car.calculateSpeed(1.5)+" km/h");

        System.out.println("\nBicycle Speed Calculations: ");
        System.out.println("Normal Speed: "+bicycle.calculateSpeed()+" km/h");
        System.out.println("Speed With Factor 0.8: "+bicycle.calculateSpeed(0.8)+" km/h");

        System.out.println("\nVehicle Details");
        car.displayVehicleDetails();
        System.out.println();
        bicycle.displayVehicleDetails();
    }
}
