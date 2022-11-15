package product;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Order {
    public Order(IceCreamFlavor flavor) {
        this.Servings = servings;
        
    }
    
    public Order(BufferedReader br) throws IOException {
        this.servings = new servings(br);
        
        int numMixIns = Integer.parseInt(br.readLine());
        while(numMixIns-- > 0) mixins.add(new MixIn(br));
    }
    
    public void save(BufferedWriter bw) throws IOException {
        flavor.save(bw);
        bw.write("" + serving.size() + '\n');
        for(MixIn mi : serving) mi.save(bw);
    }

    
    public voidServing(Serving serving) {
        servings.add(serving);
    }

    private Serving[] servings;
}
