import java.util.Scanner;

public class Hello2
{
    public static void main(String[] args)
    {
        Scanner userinput= new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name=userinput.nextLine();
        System.out.println("Hello "+name+"!");
    }
    
}
