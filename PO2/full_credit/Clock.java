import java.util.Scanner;

public class Clock 
{
    int hr;
    int min;
    int sec;

    public Clock(int hr, int min, int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        
        
        System.out.println("Hour: ");
        int hr= input.nextInt();

        System.out.println("Minute: ");
        int min=input.nextInt();

        System.out.println("Second: ");
        int sec=input.nextInt();

        Clock inputClock= new Clock(hr, min, sec);

        if(hr<10 || min<10 || sec<10)
        {
            String hr_padded=String.format("%02d",hr);
            String min_padded=String.format("%02d",min);
            String sec_padded=String.format("%02d",sec);
            System.out.println("The time is "+hr_padded+":"+min_padded+":"+sec_padded); 
           //System.out.println("Hello");
        }

        else
        {
            System.out.println("The time is "+inputClock.hr+":"+inputClock.min+":"+inputClock.sec);
        }
        //Clock c= new Clock(hr,min,sec);
        
    }
    
}

