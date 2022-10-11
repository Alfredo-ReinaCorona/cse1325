import java.util.ArrayList;

public class Scoop 
{
    private IceCreamFlavor flavor;
    private MixIn[] mixins;

    public Scoop(IceCreamFlavor flavor)
    {
        this.mixins=new ArrayList<>();
        this.flavor=flavor;
    }
    public addMixIn(MixIn mixin)
    {

    }
    @Override
    public String toString() 
    {
        if(mixins.size() > 0) 
        {
            return flavor +"with"+ mixin;
        }   
}


