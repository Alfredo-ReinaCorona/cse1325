public class Scoop 
{
    private IceCreamFlavor flavor;
    private MixIn[] mixins;

    public Scoop(IceCreamFlavor flavor)
    {
        this.flavor=flavor;
    }
    public addMixIn(MixIn mixin)
    {

    }
    @Override
    public String toString() 
    {
        if(mixin)
        {
            return flavor+ "with"+mixin;
        }
        return flavor;
    }
}

