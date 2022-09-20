public class GasVehicle extends Vehicle
{
    private double milesPerGallon;
    private double gallonsInTank;
    public double dollarsPerGallonOfGas;

    public GasVehicle(int year, String make, String model, BodyStyle bodyStyle, double milesPerGallon, double gallonsInTank)//no CLue
    {

    }
    @Override
    public double range()
    {
        return gallonsInTank*milesPerGallon;
    }
    @Override
    public double fuelConsumed(Double miles)
    {
        if(miles/milesPerGallon < gallonsInTank) throw new ArithmeticException("Error: More fuel consumed than available ");
        else
        {
            return miles / milesPerGallon;
        }

    
    }
    @Override
    public static double dollarsToTravel(double miles)
    {
        return fuelConsumed*dollarsPerGallonOfGas;
    }
}

