
package newpackage;

import java.util.ArrayList;
import java.util.List;
        
public class truck extends vehicle{
    
    private int loadCapacity;
    private String type;
    private boolean isFourWheelDrive;
    private String cargoType;
    private boolean isRented= false;

    
    public truck (String type, String make, String model, int year, int rentRate, int loadCapacity,boolean isFourWheelDrive)
    {
        super(make ,model ,year ,rentRate);
        this.type=type;
        this.isFourWheelDrive=isFourWheelDrive;
        this.loadCapacity=loadCapacity;
    }
    
    public void rent() {
        isRented=true;
    }

    public void returnVehicle() {
        isRented=false;
    }
    
    public boolean isAvailable() {
        return !isRented;
    }
    
    public void displayInfo()
    {
        System.out.println(type+"\n");
        System.out.println();
        super.displayInfo();
        System.out.println("is it a four wheel drive?: "+isFourWheelDrive);
        System.out.println("the load capacity is: "+loadCapacity);
        
    } 
           
    
    
}
