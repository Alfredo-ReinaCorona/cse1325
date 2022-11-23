

package product;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Order //from prof-rice github
{
	private ArrayList<Serving> servings;

    public Order() 
    {
        this.servings = new ArrayList<>();
    }
    
    public Order(BufferedReader br) throws IOException 
    {
    	int numServings = Integer.parseInt(br.readLine());
        while(numServings-- > 0) servings.add(new Serving(br));
        this.servings = new ArrayList<>();
        
    }
    
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write("" + servings.size() + '\n');
        for(Serving s : servings) s.save(bw);
    }

    
    public void addServing(Serving serving) 
    {
        servings.add(serving);
    }

    public int price()
    {
        Order.price=Serving.price;
    }
    
    @Override
    public String toString() 
    {
        StringBuilder result = new StringBuilder();
        String separator = "";
        if(servings.size() > 0) 
        {
            for(Serving s : servings) 
            {
                result.append(separator + s.toString());
                separator = "<br/>";
            }
        }
        return result.toString();
    }
    
}
