package product;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Serving {
    public Serving(IceCreamFlavor flavor) 
    {
        this.flavor = flavor;
        this.toppings = new ArrayList<>();
    }
    
    public Serving(BufferedReader br) throws IOException 
    {
        this.flavor = new IceCreamFlavor(br);
        this.mixins = new ArrayList<>();
        int numMixIns = Integer.parseInt(br.readLine());
        while(numMixIns-- > 0) mixins.add(new MixIn(br));
    }
    
    public void save(BufferedWriter bw) throws IOException 
    {
        flavor.save(bw);
        bw.write("" + scoops.size() + '\n');
        for(MixIn mi : mixins) mi.save(bw);
    }

    
    public void addScoop(Scoop scoop) 
    {
        scoops.add(scoop);
    }
    public addToppings(Mixin toppings)
    {
        toppings.add(toppings);
    }

    private Scoop[] scoops; 
    private ArrayList<MixIn> toppings;
}
