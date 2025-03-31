public class Car extends Vehicle{
    private int engineCapacity;
    private double topSpeed;

    public Car(){
        super("Default Car");
        this.engineCapacity=1000;
        this.topSpeed=120.0;
    }
    public Car(String vehicleName,int engineCapacity, double topSpeed){
        super(vehicleName);
        this.engineCapacity=engineCapacity;
        this.topSpeed=topSpeed;
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity){
        this.engineCapacity=engineCapacity;
    }
    public double gettopSpeed(){
        return topSpeed;
    }
    public void settopSpeed(double topSpeed){
        this.topSpeed=topSpeed;
    }
    public double calculateSpeed(){
        return topSpeed;
    }
    public void displayVehicleDetails(){
        System.out.println("------------Car Details----------------");
        System.out.println("Vehicle Name: "+ getVehicleName());
        System.out.println("Engine Capacity: "+engineCapacity+" CC");
        System.out.println("Top Speed: "+topSpeed+"km/h");
    }
}
