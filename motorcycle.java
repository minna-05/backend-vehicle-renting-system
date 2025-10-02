
package newpackage;

import java.util.ArrayList;
import java.util.List;

public class motorcycle extends vehicle {
    
    private String bikeType;
    private String type;
    private boolean isRented= false;

     
    public motorcycle(String type, String make, String model, int year, int rentRate,String bikeType)
    {
        super(make,model,year,rentRate);
        this.type=type;
        this.bikeType=bikeType;
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
        System.out.println(type);
        System.out.println();
        super.displayInfo();
        System.out.println("bike type: "+bikeType);
        
    }
            
    
    
}
