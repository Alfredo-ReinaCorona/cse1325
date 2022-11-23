//x

//package product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class MixIn 
{
	private MixInFlavor flavor;
    private MixInAmount amount;
    
    public MixIn(MixInFlavor flavor, MixInAmount amount) 
    {
        this.flavor = flavor;
        this.amount = amount;
    }
    public MixIn(BufferedReader br) throws IOException 
    {
        amount = MixInAmount.valueOf(br.readLine());
        flavor = new MixInFlavor(br);
    }
    
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(amount.toString() + '\n');
        flavor.save(bw);
    }
    
    @Override
    public String toString() 
    {
        return flavor.toString();
    }

    public int price()
    {
        if(MixInAmount.equals(Drenched))
        {
            MixIn.price=price*2;
        }
        if(MixInAmount.equals(Extra))
        {
            MixIn.price=price*1.2;
        }
        if(MixInAmount.equals(light))
        {
            MixIn.price=price*.8;
        }
    }
    
}
