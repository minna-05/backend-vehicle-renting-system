
package newpackage;


public class vehicle {
    private String make;
    private String model;
    private int year;
    private int rentRate;
    
    public vehicle()
    {
        
    }
    public vehicle(String make, String model, int year, int rentRate)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.rentRate=rentRate;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int getRentalRate()
    {
        return rentRate;
    }
    
    public double calculateRentalCost(int days) {
    return rentRate * days;
}
    
    public void displayInfo()
    {
        System.out.println("Make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println("rent rate per day: "+rentRate);
        
    }
}
