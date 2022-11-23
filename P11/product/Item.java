package product;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;

public class Item 
{
 protected String name;
    protected String description;
    protected int cost;
    protected int price;
    
   
    
    public Item(BufferedReader br) throws IOException 
    {
        this.name = br.readLine();
        this.description = br.readLine();
        this.cost = Integer.parseInt(br.readLine());
        this.price = Integer.parseInt(br.readLine());
    }
    
     public Item(String name, String description, int cost, int price) 
    {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.price = price;
    }
    
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(name );
        bw.write(description);
        bw.write("" + cost );
        bw.write("" + price);
    }

    public String name() {return name;}
    public String description() {return description;}
    public int cost() {return cost;}
    public int price() {return price;}
    
    @Override
    public String toString() 
    {
        return name;
    }
   
} 
