public class Vehicle {
    private String vehicleName;

    public Vehicle(){
        this.vehicleName="Unknown Vehicle";
    }
    public Vehicle(String vehicleName){
        this.vehicleName=vehicleName;
    }
    public String getVehicleName(){
        return vehicleName;
    }
    public void setVehicleName(String vehicleName){
        this.vehicleName=vehicleName;
    }
    public void displayVehicleDetails(){
        System.out.println("Vehicle Name: "+vehicleName);
    }

    public double calculateSpeed(){
        return 0.0;
    }
    public double calculateSpeed(double factor){
        return calculateSpeed()*factor;
    }
}
