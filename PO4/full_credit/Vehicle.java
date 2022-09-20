

//import toString 

abstract class Vehicle 
{
    private int year;
    private String model;
    private BodyStyle bodyStyle;

    public Vehicle(int year, String make, String model, BodyStyle bodyStyle)
    {

    }

    public abstract double range();

    public abstract double fuelConsumed(double miles);

    public abstract double dollarsToTravel();

    
    
    @Override
    public String toString() 
    {
        return year.toString()+" "+make+" "+model+" "+ bodyStyle; 
    }

}

