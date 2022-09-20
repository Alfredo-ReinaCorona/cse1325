





public class ElectricVehicle extends Vehicle 
{

    public static double centsPerKwhOfElectricity;
    public double whPerMile;
    public double kwhInBattery;


    public ElectricVehicle(int year,String make,String model,BodyStyle bodyStyle,double whPerMile,double kwhlnBattery)
    {

    }

    @Override
    public double range()
    {
        return kwhInBattery / (whPerMile / 1000);
    }
    @Override
    public double fuelConsumed(double miles)
    {
        if(kwhInBattery<miles * (whPerMile / 1000)) throw new ArithmeticException("Error: More fuel consumed than available...");
        else
        {
            return miles * (whPerMile / 1000);
        }
    }
    @Override
    public double dollarsToTravel()
    {
        return FuelConsumed(miles) * (centsPerKwhOfElectricity / 100);
    }
}

