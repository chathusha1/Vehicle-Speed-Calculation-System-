public class Bicycle extends Vehicle {
    private int gearCount;
    private double maxPedaSpeed;

    public Bicycle(){
        super("Default Bicycle");
        this.gearCount=6;
        this.maxPedaSpeed=25.0;
    }

    public Bicycle(String vehicleName, int gearCount, double maxPedaSpeed){
        super(vehicleName);
        this.gearCount=gearCount;
        this.maxPedaSpeed=maxPedaSpeed;
    }
    public int getgearCount(){
        return gearCount;
    }
    public void setgearCount(int gearCount){
        this.gearCount=gearCount;
    }
    public double getmaxPedaSpeed(){
        return maxPedaSpeed;
    }
    public void setmaxPedaSpeed(double maxPedaSpeed){
        this.maxPedaSpeed=maxPedaSpeed;
    }
    public double calculateSpeed(){
        return maxPedaSpeed;
    }
    public void displayVehicleDetails(){
        System.out.println("---------------Bicycle Details----------------");
        System.out.println("Vehicle Name: "+getVehicleName());
        System.out.println("Gear Count: "+gearCount);
        System.out.println("Max Pedal Speed: "+maxPedaSpeed+" km/h");
    }
}
