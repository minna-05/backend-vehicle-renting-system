
package newpackage;

import java.util.List;
import java.util.ArrayList;

public class car extends vehicle implements rentable{
    
    private int numDoor;
    private boolean isConvertable;
    private String fuel;
    private String type;
    private boolean isRented= false;
    
    
    public car (String type, String make, String model, int year, int rentRate, int numDoor, boolean isConveratable, String fuel)
    {
        super(make, model, year, rentRate);
        this.type=type;
        this.fuel=fuel;
        this.isConvertable=isConveratable;
        this.numDoor=numDoor;
    }
    
    public void displayInfo()
    {
        System.out.println(type);
        System.out.println();
        super.displayInfo();
        System.out.println("number of doors: "+numDoor);
        System.out.println("convertable: "+isConvertable);
        System.out.println("fuel type: "+fuel);
        
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

}
