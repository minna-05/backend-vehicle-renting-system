
package newpackage;

import java.util.ArrayList;
import java.util.List;

public class rentalSystem {
    
   private List<vehicle> availableVehicles;
   private List<vehicle> rentedVehicles;
   
   public rentalSystem()
   {
       availableVehicles=new ArrayList<>();
       rentedVehicles=new ArrayList<>();
   }
   
   public void addVehicle(vehicle Vehicle)
   {
       availableVehicles.add(Vehicle);
   }

    public void setAvailableVehicles(List<vehicle> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public void setRentedVehicles(List<vehicle> rentedVehicles) {
        this.rentedVehicles = rentedVehicles;
    }
   
   public void removeVehicle(vehicle Vehicle)
   {
       availableVehicles.remove(Vehicle);
   }
   
   public List<vehicle> getAvailableVehicles()
   {
       return availableVehicles;
   }
   
   public List<vehicle> getRentedVehicles()
   {
       return rentedVehicles;
   }
   
   public void rentVehicle(vehicle Vehicle)
   {
        if(availableVehicles.contains(Vehicle))
       {   availableVehicles.remove(Vehicle);
           rentedVehicles.add(Vehicle);
       }
      
   }
   
   public void returnVehicle(vehicle Vehicle)
   {
       if(rentedVehicles.contains(Vehicle))
       {
           rentedVehicles.remove(Vehicle);
           availableVehicles.add(Vehicle);
       }
       
   }
   
   public int displayRentalInfo()
   {
       System.out.println("Available vehicles: ");
       System.out.println();
       for(vehicle av : availableVehicles)
       {
           av.displayInfo();
           System.out.println();
       }
       
       System.out.println("Rented vehicles: ");
       System.out.println();
       for(vehicle rv : rentedVehicles)
       {
           rv.displayInfo();
           System.out.println();
       }
       
       return 0;
   }
   
   public double calculatRentalCost(vehicle Vehicle, int rentalDuration)
   {
       double rentalRate=Vehicle.getRentalRate();
       double totalCost=rentalRate*rentalDuration;
       return totalCost;
   }
}
